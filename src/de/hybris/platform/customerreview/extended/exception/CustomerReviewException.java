package de.hybris.platform.customerreview.extended.exception;

public class CustomerReviewException extends Exception{

	private static final long serialVersionUID = 1997753369232807009L;

	public CustomerReviewException() {
	}

	public CustomerReviewException(String message) {
		super(message);
	}

	public CustomerReviewException(Throwable cause) {
		super(cause);
	}

	public CustomerReviewException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomerReviewException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	

}
