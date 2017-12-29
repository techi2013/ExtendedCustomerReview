package de.hybris.platform.customerreview.extended.impl;

import java.util.List;

import de.hybris.platform.customerreview.CustomerReviewModel;
import de.hybris.platform.customerreview.UserModel;
import de.hybris.platform.customerreview.extended.ExtendedCustomerReviewService;
import de.hybris.platform.customerreview.extended.ProductModel;
import de.hybris.platform.customerreview.extended.dao.ExtendedCustomerReviewDao;
import de.hybris.platform.customerreview.extended.exception.CustomerReviewException;
import de.hybris.platform.customerreview.extended.validator.CustomerReviewValidator;
import de.hybris.platform.customerreview.impl.DefaultCustomerReviewService;
import de.hybris.platform.customerreview.impl.Required;

public class ExtendedCustomerReviewServiceImpl extends DefaultCustomerReviewService
		implements ExtendedCustomerReviewService {

	private CustomerReviewValidator customerReviewValidator;

	private ExtendedCustomerReviewDao extendedCustomerReviewDao;

	private List<String> curseWords;

	public CustomerReviewValidator getCustomerReviewValidator() {
		return customerReviewValidator;
	}

	@Required
	public void setCustomerReviewValidator(CustomerReviewValidator customerReviewValidator) {
		this.customerReviewValidator = customerReviewValidator;
	}

	public ExtendedCustomerReviewDao getExtendedCustomerReviewDao() {
		return extendedCustomerReviewDao;
	}

	@Required
	public void setExtendedCustomerReviewDao(ExtendedCustomerReviewDao extendedCustomerReviewDao) {
		this.extendedCustomerReviewDao = extendedCustomerReviewDao;
	}

	public List<String> getCurseWords() {
		return curseWords;
	}

	public void setCurseWords(List<String> curseWords) {
		this.curseWords = curseWords;
	}

	/*
	 * @see
	 * de.hybris.platform.customerreview.extended.ExtendedCustomerReviewService#
	 * getNumberOfReviewsByRatingWithinGivenRange(ProductModel, int, int)
	 */
	public Integer getNumberOfReviewsByRatingRange(ProductModel paramProductModel, double startRating,
			double endRating) {
		return getExtendedCustomerReviewDao().getNumberOfReviewsByRatingRange(paramProductModel, startRating,
				endRating);
	}

	/*
	 * @see
	 * de.hybris.platform.customerreview.extended.ExtendedCustomerReviewService#
	 * validateAndcreateCustomerReview(Double, String, String, UserModel,
	 * ProductModel)
	 */
	public CustomerReviewModel validateAndcreateCustomerReview(Double rating, String headline, String comment,
			UserModel user, ProductModel product) throws CustomerReviewException {
		validateCustomerReview(rating, comment);
		return createCustomerReview(rating, headline, comment, user, product);
	}

	/**
	 * This method validates customer review to make sure 
	 * 1) Customer comments doesn't have curse words
	 * 2) Customer review lower bound rating is not less than 0.0 
	 * 
	 * @param rating
	 * @param comment
	 * @throws CustomerReviewException
	 */
	private void validateCustomerReview(Double rating, String comment) throws CustomerReviewException {
		// Validate comment against curse words
		if (!customerReviewValidator.isCommentFreeFromCurseWords(curseWords, comment))
			throw new CustomerReviewException("Curse words found in comments.");

		// Validate rating not to be less than 0.0
		if (customerReviewValidator.isRatingLessThanZero(rating))
			throw new CustomerReviewException("Invalid rating range.");
	}

}