package com.panOpen.quiz.steps;

import com.panOpen.quiz.pageobjects.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPage loginPage;

	@Step
	public void loginPanOpen(String strEmail, String strPass) {
		//a.Abrir la url.
		loginPage.open();
		System.out.println(" a.Abrir la url.");
		
		//b.Ingresar email.
		loginPage.setTxtEmailAddress(strEmail);
		System.out.println(" b.Ingresar email.");
		
		//c.Ingresar password.
		loginPage.setTxtPassword(strPass);
		System.out.println(" c.Ingresar password.");
		
		//d.Clic botón Sign In
		loginPage.clickBtnSignIn();
		System.out.println(" d.Clic botón Sign In.");

	}
	
	@Step
	public void logoutPanOpen() {
		loginPage.clickBtnSignOut();
	}
	

}
