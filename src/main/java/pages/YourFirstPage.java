package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import core.BasePageObject;
import core.Constants;

public class YourFirstPage extends BasePageObject {
	
	
	public String verifyDepartureField() {
		if(!getDriver().findElement(By.xpath(Constants.departureLabelXpath)).isDisplayed())
			return"Departure Label Should be displayed";
		
		if(!getDriver().findElement(By.xpath(Constants.departureSelectXpath)).isDisplayed())
			return"Departure DropDown Should be displayed";
		
		return "";
	}

	public String verifyReturnField() {
		if(!getDriver().findElement(By.xpath(Constants.returnLabelXpath)).isDisplayed())
			return "Departure Label Should be displayed";
		
		if(!getDriver().findElement(By.xpath(Constants.returnSelectXpath)).isDisplayed())
			return"Departure DropDown Should be displayed";
		
		return "";
	}


	
	public void clickSearchButton() {
		actionClick(Constants.searchButtonXpath);
	}
	
	public String seatAvailableMessageIsDisplayed() {
		waitFor(Constants.searchResultLabelXpath);
		if(!getDriver().findElement(By.xpath(Constants.seatAvailableLabelXpath)).isDisplayed())
			return "'Seat Available' Should be displayed";
		
		if(!getDriver().findElement(By.xpath(Constants.searchResultLabelXpath)).isDisplayed())
			return"Search Result Should be displayed";
		
		if(!getDriver().findElement(By.xpath(Constants.callMessageLabelXpath)).isDisplayed())
			return"Call Message Should be displayed";
		
		return "";
	}

	public String seatNotAvailableMessageIsDisplayed() {
		String expectedSeatUnAvailableMessage = "Sorry, there are no more seats available.";
		waitABit(10);
		if(!getDriver().findElement(By.xpath(Constants.actualSeatUnAvailableMessageXpath)).getText().equals(expectedSeatUnAvailableMessage))
			return "'Sorry, there are no more seats available.' should be displayed";
		
		return "";
			
	}

	public void verifyUserEntersDepartureDropDownDetails(String departureValue) {
		dropDownSelect(Constants.departureSelectXpath, departureValue);
		
	}

	public void verifyUserEntersReturnDropDownDetails(String returnValue) {
		dropDownSelect(Constants.departureSelectXpath, returnValue);
		
	}


}
