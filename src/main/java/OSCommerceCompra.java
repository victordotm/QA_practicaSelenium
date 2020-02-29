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



public class OSCommerceCompra {
	
	private BasicActionsOScommerce instanceActionsOSCommerce;


	@BeforeClass
	public static void startDriverSetup() throws Exception {
		BasicActionsOScommerce.setUpBeforeClass();
	}

	
	@AfterClass
	public static void endDriver() throws Exception {
		BasicActionsOScommerce.tearDownAfterClass();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
	public void testGalaxyTab() {
		BasicActionsOScommerce instanceActionsOSCommerce_TestGalaxyTab = new BasicActionsOScommerce();
		//Open URL
		instanceActionsOSCommerce_TestGalaxyTab.webURL="https://demo.oscommerce.com/";
		instanceActionsOSCommerce_TestGalaxyTab.clickProduct("Samsung Galaxy Tab","2");
		try {
			TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {}
		
	}
	
	@Test
	public void testBeloved() {
		BasicActionsOScommerce instanceActionsOSCommerce_TestBeloved = new BasicActionsOScommerce();
		//Open URL
		instanceActionsOSCommerce_TestBeloved.webURL="https://demo.oscommerce.com/";
		instanceActionsOSCommerce_TestBeloved.clickProduct("Beloved","3");
	
	}

}
