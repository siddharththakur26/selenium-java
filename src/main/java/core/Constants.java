package core;

public class Constants {
	
    //public static final String DEFAULT_URL = "your default url";
    public static final String DEFAULT_URL = "https://marsair.thoughtworks-labs.net/ggn_siddharth_thakur";
    public static String departureLabelXpath ="//label[text()='Departing']";
	public static String departureSelectXpath = "(//label[contains(text(),'Departing')]/following::select)[1]";
	public static String returnLabelXpath = "//label[text()='Returning']";
	public static String returnSelectXpath = "(//label[contains(text(),'Returning')]/following::select)[1]";
	public static String searchButtonXpath = "//input[@value='Search']";
	public static String searchResultLabelXpath ="//h2[text()='Search Results']";
	public static String seatAvailableLabelXpath = "//p[text()='Seats available!']";
	public static String callMessageLabelXpath = "//p[contains(text(),'Call now on 0800 MARSAIR to book!')]";
	public static String actualSeatUnAvailableMessageXpath = "//div[@id='content']/p";

	
}
