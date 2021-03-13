package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browser) {

		try {
			if (browser.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe");

				driver = new InternetExplorerDriver();

			}

			else if (browser.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.drivers",
						System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");

				driver = new FirefoxDriver();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.manage().window().maximize();
		return driver;

	}

	// getUrl

	public static void getUrl(String url) {

		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void maximize() {

		driver.manage().window().maximize();
	}

	// wait
	public static void implicitWait(int duration, TimeUnit format) {

		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);

	}

	public static void explicitWait(int duration, TimeUnit format, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, duration);

		wait.until(ExpectedConditions.visibilityOf(element));

	}

	// pageTimeouts
	public static void pageTimeOuts(int duration, TimeUnit format) {

		driver.manage().timeouts().pageLoadTimeout(duration , format);

	}

	// sendKeys
	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	// click
	public static void clickOnElement(WebElement element) {

		element.click();

	}

	// close
	public static void close() {

		driver.close();

	}

	// quit

	public static void quit() {

		driver.quit();

	}

	// navigate
	public static void navigateTo(String url) {

		driver.navigate().to(url);

	}

	public static void navigateBack() {

		driver.navigate().back();

	}

	public static void navigateForward() {

		driver.navigate().forward();

	}

	public static void navigateRefresh() {

		driver.navigate().refresh();
		
		

	}
	
	public static void desiredCababilities() {

		DesiredCapabilities dc = new DesiredCapabilities().chrome();
		
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
	}

	// Actions

	public static void Actions(WebElement element, String value) {

		Actions a = new Actions(driver);
		if (value.equalsIgnoreCase("moveToElement")) {

			a.moveToElement(element).build().perform();

		} else if (value.equalsIgnoreCase("contextClick")) {

			a.contextClick(element).build().perform();
		} else if (value.equalsIgnoreCase("click")) {

			a.click(element).build().perform();
		}

		else if (value.equalsIgnoreCase("dragAndDrop")) {

			a.dragAndDrop(element, element).build().perform();
		}
	}
	
	//Desired capabilities 
	
	

	// Robot
	public static void Robot(String value) throws AWTException {

		Robot r = new Robot();
		if (value.equalsIgnoreCase("Down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (value.equalsIgnoreCase("up")) {

			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);

		} else if (value.equalsIgnoreCase("left")) {

			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);

		}

		else if (value.equalsIgnoreCase("right")) {

			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);

		}

	}

	// windowsHandle
	public static void getWindowHandle() {

		String windowHandle = driver.getWindowHandle();

		System.out.println(windowHandle);

	}

	public static void getWindowHandels(Set<String> refname) {

		Set<String> windowHandles1 = driver.getWindowHandles();
		for (String id : windowHandles1) {

			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);

		}

	}

	// isEnabled
	public static void isEnabled(WebElement element) {

		boolean enabled = element.isEnabled();

		System.out.println(enabled);
	}

	// isDisplayed
	public static void isDisplayed(WebElement element) {

		boolean displayed = element.isDisplayed();

		System.out.println(displayed);

	}

	// isSelected
	public static void isSelected(WebElement element) {

		boolean selected = element.isSelected();

		System.out.println(selected);

	}

	// getOptions
	public static void getOptions(WebElement element) {

		Select s = new Select(element);

		List<WebElement> options = s.getOptions();

		System.out.println(options);

	}

	// getTitle
	public static void getTile() {

		String title2 = driver.getTitle();

		System.out.println(title2);

	}

	// getCurrentUrl
	public static void getCurrentUrl() {

		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
	}

	// getText
	public static void getText(WebElement element) {

		String text_value = element.getText();

		System.out.println(text_value);

	}

	// getAttribute
	public static void getAttribute(WebElement element, String value) {

		if (value.equalsIgnoreCase("value")) {

			String attribute = element.getAttribute("Value");

			System.out.println(attribute);
		} else if (value.equalsIgnoreCase("name")) {

			String attribute = element.getAttribute("name");

			System.out.println(attribute);

		}
	}

	// alert
	public static void alert_Accept() {

		Alert alert = driver.switchTo().alert();
					alert.accept();
			driver.switchTo().defaultContent();
	}

		public static void alert_Dismiss() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
	driver.switchTo().defaultContent();

		}
//
public static void alertGetText() {
	
	Alert alert = driver.switchTo().alert();
	
	

}
		//clear

public static void clearElement(WebElement element ) {

	element.clear();
	
}



	// singleDropDown
	public static void singleDropDown(WebElement element, String type, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("index")) {

			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);

		}

		else if (type.equalsIgnoreCase("value")) {

			s.selectByValue(value);
		} else if (value.equalsIgnoreCase("visibile text")) {

			s.selectByVisibleText(value);
		}
	}

	// screenShot
	public static void TakesScreenshots(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File(path);

		FileUtils.copyFile(source, destination);

	}

	// is multiple
	public static void isMultiple(WebElement element) {

		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	// checkBox
	public static void checkbox(WebElement element) {

		element.click();

	}

	// getFirstSelected Option
	public static void getFirstSelected(WebElement element) {

		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption);

	}

	// getAllSelectedoptions

	public static void getAllselectedoptions(WebElement element) {

		Select s = new Select(element);

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement selectedOptions : allSelectedOptions) {
			String text = selectedOptions.getText();
			System.out.println(text);
		}

	}

	// frames
	public static void frame(String type, String value) {

		if (type.equalsIgnoreCase("byIndex")) {
			
			int parseInt = Integer.parseInt(value);
			driver.switchTo().frame(parseInt);
			
			
			
		}
		driver.switchTo().frame(value);

		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		// driver.switchTo().frame(arg0)

		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		//
		//driver.switchTo().frame(element);

		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		// driver.switchTo().parentFrame();
		// driver.switchTo().defaultContent();

	}

	// scrollUp and Scroll Down

	public static void scroll(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", element);
	
	
	}
}
