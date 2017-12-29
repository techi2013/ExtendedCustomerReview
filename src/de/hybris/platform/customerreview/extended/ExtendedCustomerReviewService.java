package de.hybris.platform.customerreview.extended;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.customerreview.CustomerReviewService;
import de.hybris.platform.customerreview.extended.exception.CustomerReviewException;
import de.hybris.platform.customerreview.impl.CustomerReviewModel;
import de.hybris.platform.customerreview.impl.UserModel;

public abstract interface ExtendedCustomerReviewService extends CustomerReviewService {
	/**
	 * This method facilitates to get a product’s total number of customer
	 * reviews whose ratings are within a given range
	 * 
	 * @param paramProductModel
	 * @param startRating
	 * @param endRating
	 * @return numberOfReviews
	 */
	public abstract Integer getNumberOfReviewsByRatingRange(ProductModel paramProductModel, double startRating,
			double endRating);

	/**
	 * This method validates customer review and create customer review.
	 * 
	 * @param rating
	 * @param headline
	 * @param comment
	 * @param user
	 * @param product
	 * @return customerReviewModel
	 * @throws CustomerReviewException
	 */
	public CustomerReviewModel validateAndcreateCustomerReview(Double rating, String headline, String comment,
			UserModel user, ProductModel product) throws CustomerReviewException;

}
