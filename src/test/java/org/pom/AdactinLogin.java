package org.pom;

import org.Base.BaseCodes;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin extends BaseCodes{
	
	public AdactinLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
	private WebElement UserName;
	@FindBy(id = "password")
	private WebElement Password;
	@FindBy(id = "login")
	private WebElement Login;
	public WebElement getUserName() {
		return UserName;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLogin() {
		return Login;
	}
	public void loginpagedata(String UserName,String PassWord  ) {
		sendtext(getUserName(), UserName);
		sendtext(getPassword(), PassWord);
		enter(getLogin());
		
	}
	
}
