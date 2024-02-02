package com.Base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bass_class {
	public static WebDriver driver;

	public static WebDriver launchBrowser(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static WebDriver launchUrl(String Url) {
		driver.get(Url);
		return driver;
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void terminateBrowser() {
		driver.quit();
	}

	public static WebDriver navigateTo(String Url) {
		driver.navigate().to(Url);
		return driver;
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

	public static void clickButton(WebElement element) {
		element.click();
	}

	public static void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void passInput(WebElement element, String Input) {
		element.sendKeys(Input);
	}

	public static void rejectAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	private static Actions actions() {
		Actions action = new Actions(driver);
		return action;
	}

	private static Robot robot() throws Throwable {
		Robot robot = new Robot();
		return robot;
	}

	public static void mouseHover(WebElement element) {
		actions().moveToElement(element).build().perform();
	}

	public static void actionClick(WebElement element) {
		actions().click().build().perform();
	}

	public static void keyBoardCopy(WebElement element) throws Throwable {
		actions().sendKeys(element, "7907876955").build().perform();
		robot().keyPress(KeyEvent.VK_CONTROL);
		robot().keyPress(KeyEvent.VK_A);
		robot().keyRelease(KeyEvent.VK_A);
		robot().keyRelease(KeyEvent.VK_CONTROL);
		robot().keyPress(KeyEvent.VK_CONTROL);
		robot().keyPress(KeyEvent.VK_C);
		robot().keyRelease(KeyEvent.VK_C);
		robot().keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void keyBoardPaste(WebElement element) throws Throwable {
		actions().click().build().perform();
		robot().keyPress(KeyEvent.VK_CONTROL);
		robot().keyPress(KeyEvent.VK_V);
		robot().keyRelease(KeyEvent.VK_V);
		robot().keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void waitTime() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void windowHandles() {
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			driver.switchTo().window(window);
		}
	}

	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
	}

	public static void frames(String id) {
		driver.switchTo().frame(id);
	}
	public static void isEnabled(WebElement element) {
		element.isEnabled();
	}
	public static void isDisplayed(WebElement element) {
		element.isDisplayed();
	}
	public static void isSelected(WebElement element) {
		element.isSelected();
	}
	public static String geturl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public static String getText(WebElement element) {
		String text=element.getText();
		return text;
	}
	private static Select dropDownObject(WebElement element) {
		Select s = new Select(element);
		return s;
		
	}
	public static void selectbyValue(WebElement element, String value) {
		dropDownObject(element).selectByValue(value);
	}
	public static void selectbyIndex(WebElement element, int ind) {
		dropDownObject(element).selectByIndex(ind);
	}
	public static void selectbyVissibletext(WebElement element, String string) {
		dropDownObject(element).selectByVisibleText(string);
	}
}	
