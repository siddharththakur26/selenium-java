package core;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePageObject extends PageObject {

    private static final Logger logger = LoggerFactory.getLogger(BasePageObject.class);

    public void openPageUrl(String url)
    {
        try {
            getDriver().get(url);
        }catch(Exception e)
        {
           logger.debug("Not able to launch driver ");
        }

    }
    
    public void dropDownSelect(String dropDownXpath, String text) {
    	try {
    		Select s = new Select(getDriver().findElement(By.xpath(dropDownXpath)));
    		s.selectByVisibleText(text);
    		
    	}
    	catch (Exception e) {
    		logger.debug(e.toString());
    	}
    }
    
    public void scrollToWebElement(String locatorXpath) {
    	try {
    		WebElement ele = getDriver().findElement(By.xpath(locatorXpath));
    		evaluateJavascript("arguments[0].scrollIntoView(true);",ele);
    		
    	}
    	catch (Exception e) {
    		logger.debug(e.toString());
    	}
    }
    
    
    public void actionClick(String locatorXpath) {
    	try {
    		scrollToWebElement(locatorXpath);
    		moveTo(By.xpath(locatorXpath)).click();
    	}
    	catch (Exception e) {
    		logger.debug(e.toString());
    	}
    	
    }
    
    

}
