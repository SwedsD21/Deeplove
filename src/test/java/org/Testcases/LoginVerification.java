package org.Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.Base.BaseCodes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.AdactinLogin;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginVerification {
 
	@BeforeMethod
	//private void beforetest() {
//		driverlaunch("https://adactinhotelapp.com/");
//		maximize();
//		implicitwait(10);

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://adactinhotelapp.com/");
//	}

//	@Test(priority = -4)
//
//	private void Test1() {
//		AdactinLogin login = new AdactinLogin();
//		login.loginpagedata("UserName", "PassWord");
//		System.out.println("FIFA");
//	}
//
	@Test(priority = 1)
	private void test2() {
		AdactinLogin login = new AdactinLogin();
		login.loginpagedata("Andrew07", "UN45LL");
		System.out.println("Winner 2022");
	}

//	@Test
//	@Parameters({"UserName","PassWord"})
//	private void test3(String UserName,String PassWord) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://adactinhotelapp.com/");
//	
//	
//		AdactinLogin login = new AdactinLogin();
//		login.loginpagedata(UserName, PassWord);
//		System.out.println(UserName);
//		System.out.println(PassWord);
//		
//	}

}