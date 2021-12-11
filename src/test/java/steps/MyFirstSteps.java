package steps;

import org.openqa.selenium.By;

import core.BasePageObject;
import core.Constants;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.YourFirstPage;

public class MyFirstSteps extends ScenarioSteps {

	YourFirstPage yfp;
	
	
	@Step("User views the Departure DropDown")
	public String verifyDepartureField() {
		return yfp.verifyDepartureField();
		
	}

	@Step("Users View the Return Field")
	public String verifyReturnField() {
		return yfp.verifyReturnField();
	}

	
	@Step("Users Selects the Values of Departure and Return Field")
	public void verifyDropDownValuesEntered(String departureValue, String returnValue) {
		yfp.verifyUserEntersDepartureDropDownDetails(departureValue);
		yfp.verifyUserEntersReturnDropDownDetails(returnValue);
	}
	
	@Step("User Clicks on Search Button")
	public void clickonSearch() {
		yfp.clickSearchButton();
		
	}
	
	@Step("User Views the Valid Message when seats are available")
	public String seatAvailableMessageIsDisplayed() {
		return yfp.seatAvailableMessageIsDisplayed();
	}

	public String seatNotAvailableMessageIsDisplayed() {
		return yfp.seatNotAvailableMessageIsDisplayed();
	}

	public void verifyProminentMessageIsDisplayed() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
