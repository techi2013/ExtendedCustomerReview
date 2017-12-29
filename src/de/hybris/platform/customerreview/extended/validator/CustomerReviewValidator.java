package de.hybris.platform.customerreview.extended.validator;

import java.util.List;

public class CustomerReviewValidator {

	/**
	 * This method validates whether the comments has curse words
	 * 
	 * @param curseWords
	 * @param comment
	 * @return isValid
	 */
	public boolean isCommentFreeFromCurseWords(List<String> curseWords, String comment) {
		if (curseWords == null || comment == null)
			return false;

		for (String curseWord : curseWords) {
			if (comment.contains(curseWord))
				return false;
		}
		return true;
	}

	/**
	 * This method validates whether the lower bound rating is less than zero
	 * 
	 * @param rating
	 * @return isRatingLessThanZero
	 */
	public boolean isRatingLessThanZero(Double rating) {
		boolean isRatingLessThanZero = false;
		// As per the requirement only lower bound rating is validated
		if (rating != null && rating < 0.0)
			isRatingLessThanZero = true;
		return isRatingLessThanZero;
	}

}
