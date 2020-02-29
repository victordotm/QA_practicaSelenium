import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;



public class BasicActionsOScommerce {
	
	public static  WebDriver driver = null;
	private By levelTitle=By.cssSelector("h1");
	public By LinkText=By.linkText(" ");
	public String webURL = " ";
	
	public static void setUpBeforeClass() throws Exception {
		ArrayList<String> optionsList = new ArrayList<String>();
		ChromeOptions chromeOptions = new ChromeOptions();
		optionsList.add("--start-maximized");
		optionsList.add("--incognito");
		optionsList.add("disable-notifications");
		chromeOptions.addArguments(optionsList);
		chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
  		chromeOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		System.setProperty("webdriver.chrome.driver",
                "chromedriver.exe"); 
		
		driver = new ChromeDriver(chromeOptions);
			
	}
	
	public static void tearDownAfterClass() throws Exception {
		//Close browser
		driver.close();
	}
	
	public void setUp() throws Exception {}

	
	public void tearDown() throws Exception {}

	
	public  void clickProduct(String nameProduct, String Quantity2Buy) {

		driver.get(webURL);
		LinkText=By.linkText(nameProduct);
		WebElement linkProductElement=driver.findElement(LinkText);
		linkProductElement.click();
		try {
			TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {}
		WebElement AddtoCart=driver.findElement(By.id("tdb4"));
		AddtoCart.click();
		try {
			TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {}
		WebElement inputElement=driver.findElement(By.name("cart_quantity[]"));
		inputElement.sendKeys("\b"+Quantity2Buy+"\n");

		inputElement=driver.findElement(By.name("cart_quantity[]"));
		assertEquals(Quantity2Buy,inputElement.getAttribute("value"));
		
		WebElement Checkout=driver.findElement(By.linkText("Checkout"));
		Checkout.click();
		
		try {
			TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {}

		inputElement=driver.findElement(By.name("email_address"));
		inputElement.sendKeys("Testing4ever@fake.com");
		
		inputElement=driver.findElement(By.name("password"));
		inputElement.sendKeys("Testing4ever");
		
		WebElement SignIn=driver.findElement(By.id("tdb1"));
		SignIn.click();
		
		try {
			TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {}
		
		WebElement ContinueButton=driver.findElement(By.id("tdb6"));
		ContinueButton.click();
		
		try {
			TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {}
		
		WebElement RationButton=driver.findElement(By.xpath("//input[@value='cod']"));
		RationButton.click();
		
		ContinueButton=driver.findElement(By.id("tdb6"));
		ContinueButton.click();
		
		try {			
			TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {}
		
		WebElement Paynow=driver.findElement(By.id("tdb5"));
		Paynow.click();
		
		try {			
			TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {}
		
		WebElement levelTitleElement=driver.findElement(levelTitle);
		assertEquals(levelTitleElement.getText(),"Your Order Has Been Processed!");
		
		try {			
			TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {}
		
		ContinueButton=driver.findElement(By.id("tdb5"));
		ContinueButton.click();
		
		try {			
			TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {}
		
		WebElement LogOffButton=driver.findElement(By.id("tdb4"));
		LogOffButton.click();
		
		try {			
			TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {}
		
		WebElement GoHome=driver.findElement(By.id("storeLogo"));
		GoHome.click();
		
		try {			
			TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {}
		
	}

}
