package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import core.BasePageObject;
import core.Constants;

public class YourFirstPage extends BasePageObject {
	
	
	public void verifyDepartureField() {
		// TODO Auto-generated method stub
		if(!getDriver().findElement(By.xpath(Constants.departureLabelXpath)).isDisplayed())
			Assert.fail("Departure Label Should be displayed");
		
		if(!getDriver().findElement(By.xpath(Constants.departureSelectXpath)).isDisplayed())
			Assert.fail("Departure DropDown Should be displayed");
	}

	public void verifyReturnField() {
		// TODO Auto-generated method stub
		if(!getDriver().findElement(By.xpath(Constants.returnLabelXpath)).isDisplayed())
			Assert.fail("Departure Label Should be displayed");
		
		if(!getDriver().findElement(By.xpath(Constants.returnSelectXpath)).isDisplayed())
			Assert.fail("Departure DropDown Should be displayed");
	}

	public void verifyUserEntersDropDownDetails(String departureValue, String returnValue) {
		// TODO Auto-generated method stub
		waitFor(Constants.departureSelectXpath);
		Select select = new Select(getDriver().findElement(By.xpath(Constants.departureSelectXpath)));
		select.selectByVisibleText(departureValue);
		select = new Select(getDriver().findElement(By.xpath(Constants.returnSelectXpath)));
		select.selectByVisibleText(returnValue);
	}
	
	public void clickSearchButton() {
		moveTo(By.xpath(Constants.searchButtonXpath)).click();
	}
	
	public void seatAvailableMessageIsDisplayed() {
		waitFor(Constants.searchResultLabelXpath);
		if(!getDriver().findElement(By.xpath(Constants.seatAvailableLabelXpath)).isDisplayed())
			Assert.fail("'Seat Available' Should be displayed");
		
		if(!getDriver().findElement(By.xpath(Constants.searchResultLabelXpath)).isDisplayed())
			Assert.fail("Search Result Should be displayed");
		
		if(!getDriver().findElement(By.xpath(Constants.callMessageLabelXpath)).isDisplayed())
			Assert.fail("Call Message Should be displayed");
		
		
	}

	public void seatNotAvailableMessageIsDisplayed() {
		// TODO Auto-generated method stub
		String expectedSeatUnAvailableMessage = "Sorry, there are no more seats available.";
		waitABit(10);
		if(!getDriver().findElement(By.xpath(Constants.actualSeatUnAvailableMessageXpath)).getText().equals(expectedSeatUnAvailableMessage))
			Assert.fail("'Sorry, there are no more seats available.' should be displayed");
			
	}


}
