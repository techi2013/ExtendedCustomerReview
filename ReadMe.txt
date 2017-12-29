Context :
--------- 
Extending the existing functionality with the given scenarios


Given Scenarios :
----------------
1.	Provide a way to get a product’s total number of customer reviews whose ratings are within a given range (inclusive).
2.	Add the following additional checks before creating a customer review:
		a.	Your service should read a list of curse words. This list should not be defined in Java class. 
		b.	Check if Customer’s comment contains any of these curse words. If it does, throw an exception with a message.
		c.	Check if the rating is not < 0.  If it is < 0, throw an exception with a message.
	If all the rules are passed, go ahead and create the customer review.
3.	Ensure the new functionality can be used elsewhere in the application (i.e.  a bean containing the new functionality is defined within the customerreview-spring.xml).

Assumptions :
-------------
1. The given source code in customerreviewserver.jar.src folder remains untouched
2. Solution has to be implemented by extending customerreviewserver.jar.src with the expected out of box features. 
3. Technology used - Java and Spring 


Solution :
----------
1. Created a new service project (ExtendedCustomerReview) as a jar to extend the given scenario without touching the existing code.
2. Created a new Service layer which extends the exiting service layer
3. Created a new DAO layer which extends the exiting DAO layer  
4. Created Validator and Exception handler
5. To extend the existing functionality, the service layer is favoured with the composition of DAO and Validator
 
New Files
---------
de.hybris.platform.customerreview.extended.ExtendedCustomerReviewService
de.hybris.platform.customerreview.extended.impl.ExtendedCustomerReviewServiceImpl
de.hybris.platform.customerreview.extended.dao.ExtendedCustomerReviewDao
de.hybris.platform.customerreview.extended.dao.impl.ExtendedCustomerReviewDaoImpl
de.hybris.platform.customerreview.extended.exception.CustomerReviewException
de.hybris.platform.customerreview.extended.validator.CustomerReviewValidator
extended-customerreview-spring.xml
