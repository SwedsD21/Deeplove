package org.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCodes {
	public static WebDriver driver;

	
	public static void driverlaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
			}
	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void implicitwait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public WebElement findelementbyxpath(String elementid) {
		WebElement element = driver.findElement(By.xpath(elementid));
		return element;
	}

	public WebElement findelementbyId(String elementid) {
		WebElement element = driver.findElement(By.id(elementid));
		return element;

	}

	public void sendtext(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void enter(WebElement element) {
		element.click();

	}

	public WebElement findelementidnew(String id1) {
		return driver.findElement(By.id(id1));


}
}