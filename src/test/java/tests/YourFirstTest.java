package tests;

import common.BaseCase;
import core.BasePageObject;
import core.Constants;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

import com.ibm.icu.impl.Assert;

import steps.MyFirstSteps;

public class YourFirstTest extends BaseCase {
    @Steps
    MyFirstSteps myFirstStepsObj;

    // There should be ‘departure’ and ‘return’ fields on a search form.
    @Test
    public void verifyDepartureAndReturnFieldOnHomepage()
    {
        /*Write your test method here*/
    	driver.get(Constants.DEFAULT_URL);
    	if(!myFirstStepsObj.verifyDepartureField().equals(""))
    		Assert.fail(myFirstStepsObj.verifyDepartureField());
    	
    	if(!myFirstStepsObj.verifyReturnField().equals(""))
    		Assert.fail(myFirstStepsObj.verifyReturnField());
    	
    	
    }
    
    // Trips for the next two years should be searchable.
    @Test
    public void verifyTripsIsSearchable() {
    	driver.get(Constants.DEFAULT_URL);
    	myFirstStepsObj.verifyDropDownValuesEntered("July","December (two years from now)");
    	myFirstStepsObj.clickonSearch();
 
    	if(!myFirstStepsObj.seatAvailableMessageIsDisplayed().equals(""))
    		Assert.fail(myFirstStepsObj.seatAvailableMessageIsDisplayed()); 
    	
    	
    }
    
    //If there are no seats, display “Sorry, there are no more seats available.”
    @Test
    public void verifySeatsAreNotAvailable() {
    	driver.get(Constants.DEFAULT_URL);
    	myFirstStepsObj.verifyDropDownValuesEntered("July", "July");
    	myFirstStepsObj.clickonSearch();
    	if(!myFirstStepsObj.seatNotAvailableMessageIsDisplayed().equals(""))
    		Assert.fail(myFirstStepsObj.seatNotAvailableMessageIsDisplayed());
    }
    

    //“Book a ticket to the red planet now!” should apperar somewhere prominent on the page.
    @Test
    public void verifyProminentMessageIsDisplayed() {
    	driver.get(Constants.DEFAULT_URL);
    	myFirstStepsObj.verifyProminentMessageIsDisplayed();
    	
    }
    
    
    
    
    

}
