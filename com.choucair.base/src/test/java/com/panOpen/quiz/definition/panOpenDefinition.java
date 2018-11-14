package com.panOpen.quiz.definition;

import java.util.List;

import com.panOpen.quiz.steps.CreateClassSteps;
import com.panOpen.quiz.steps.LoginSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class panOpenDefinition {
	
	@Steps
	LoginSteps loginSteps;
	
	@Steps
	CreateClassSteps createClassSteps;
	
	@Given("^User logs in as faculty with email \"([^\"]*)\" and pass \"([^\"]*)\"$")
	public void user_logs_in_as_faculty_with_email_and_pass(String email, String pass)  {
		System.out.println("");
		System.out.println("1.User logs in as faculty:");
		loginSteps.loginPanOpen(email,pass);
	}

	@When("^User clicks create a class$")
	public void user_clicks_create_a_class()  {
		System.out.println("");
		System.out.println("2.User clicks create a class:");
		createClassSteps.newClassPanOpen();
	}

	@When("^Users fills the form$")
	public void users_fills_the_form(DataTable dtDatosForm)  {
		
		List<List<String>> data = dtDatosForm.raw();
		for (int i = 0; i < data.size(); i++) {
			System.out.println("");
			System.out.println("3.Users fills the form:");
			createClassSteps.FillFormClass(data,i);
		}
	}

	@Then("^Class should be properly saved$")
	public void class_should_be_properly_saved()  {
		System.out.println("");
		System.out.println("4.Class should be properly saved:");
		//simulacionCanonFinancieroSteps.verificar_mensajes_de_error();
	}
	
	
}
