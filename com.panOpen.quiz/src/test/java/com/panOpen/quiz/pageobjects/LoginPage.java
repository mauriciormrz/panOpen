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
	@FindBy(xpath="//*[@id='new_user']/div/div[5]/input")
	private WebElementFacade btnSignIn;
	
	
	public void setTxtEmailAddress(String strUsuario) {
		txtEmailAddress.sendKeys(strUsuario);
	}
	
	public void setTxtPassword(String strPass) {
		txtPassword.sendKeys(strPass);
	}
	
	public void clickBtnSignIn() {
		btnSignIn.click();
	}
	
}
