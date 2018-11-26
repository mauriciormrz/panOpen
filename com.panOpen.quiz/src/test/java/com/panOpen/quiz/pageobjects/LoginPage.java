package com.panOpen.quiz.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("https://automation.panopen.org/sign_in")
public class LoginPage extends PageObject{
	
	// Campo Email Address
	@FindBy(xpath="//*[@id='email']")
	private WebElementFacade txtEmailAddress;
	
	// Campo Password
	@FindBy(xpath="//*[@id='password']")
	private WebElementFacade txtPassword;
	
	// Botón Sign In
	@FindBy(name="commit")
	private WebElementFacade btnSignIn;
	
	// Botón Sign Out
	@FindBy(xpath="//*[@id='menu-v2']/div[1]/ul[2]/li[3]/a/i")
	private WebElementFacade btnSignOut;
	
	
	public void setTxtEmailAddress(String strUsuario) {
		txtEmailAddress.sendKeys(strUsuario);
	}
	
	public void setTxtPassword(String strPass) {
		txtPassword.sendKeys(strPass);
	}
	
	public void clickBtnSignIn() {
		btnSignIn.click();
	}

	public void clickBtnSignOut() {
		btnSignOut.click();
		getDriver().switchTo().alert().accept();
		getDriver().close();
		
	}
	

	
}
