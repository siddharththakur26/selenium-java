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
	public void verifyDepartureField() {
		// TODO Auto-generated method stub
		yfp.verifyDepartureField();
		
	}

	@Step("Users View the Return Field")
	public void verifyReturnField() {
		// TODO Auto-generated method stub
		yfp.verifyReturnField();
	}

	
	@Step("Users Selects the Values of Departure and Return Field")
	public void verifyDropDownValuesEntered(String departureValue, String returnValue) {
		// TODO Auto-generated method stub
		yfp.verifyUserEntersDropDownDetails(departureValue,returnValue);
	}
	
	@Step("User Clicks on Search Button")
	public void clickonSearch() {
		// TODO Auto-generated method stub
		yfp.clickSearchButton();
		
	}
	
	@Step("User Views the Valid Message when seats are available")
	public void seatAvailableMessageIsDisplayed() {
		yfp.seatAvailableMessageIsDisplayed();
	}

	public void seatNotAvailableMessageIsDisplayed() {
		// TODO Auto-generated method stub
		yfp.seatNotAvailableMessageIsDisplayed();
	}

	public void verifyProminentMessageIsDisplayed() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
