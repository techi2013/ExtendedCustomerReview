package de.hybris.platform.customerreview.extended.dao;

import de.hybris.platform.core.model.product.ProductModel;

public abstract interface ExtendedCustomerReviewDao {
	
	/**
	 * This method facilitates to get a product’s total number of customer reviews whose ratings are within a given range 
	 * 
	 * @param paramProductModel
	 * @param startRating
	 * @param endRating
	 * @return numberOfReviews
	 */
	public abstract Integer getNumberOfReviewsByRatingRange(ProductModel paramProductModel, double startRating,
			double endRating);
}