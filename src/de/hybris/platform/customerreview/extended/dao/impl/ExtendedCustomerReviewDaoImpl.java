package de.hybris.platform.customerreview.extended.dao.impl;

import de.hybris.platform.customerreview.extended.dao.ExtendedCustomerReviewDao;
import de.hybris.platform.customerreview.extended.dao.ProductModel;


public class ExtendedCustomerReviewDaoImpl extends AbstractItemDao implements ExtendedCustomerReviewDao {
	

	/*
	 * @see de.hybris.platform.customerreview.extended.dao.ExtendedCustomerReviewDao#getNumberOfReviewsByRatingWithinGivenRange(ProductModel, int, int)
	 */
	public Integer getNumberOfReviewsByRatingRange(ProductModel paramProductModel, double startRating,
			double endRating) {
		// TODO - Code implementation to fetch product’s total number of customer reviews whose ratings are within a given range
		return 0;
	}	
}
