package com.panOpen.quiz.steps;

import java.util.List;

import com.panOpen.quiz.pageobjects.DueDateForAssessmentsPage;


import net.thucydides.core.annotations.Step;

public class DueDateForAssessmentsSteps {

	DueDateForAssessmentsPage dueDateForAssessmentsPage;
	
	@Step
	public void SetDueDate(List<List<String>> data, int id) {
		
		//a.Seleccionar clase (Active Class for testing).
		dueDateForAssessmentsPage.clickClassName(data.get(id).get(0).trim());
		System.out.println(" a.Seleccionar clase.");
		
		//b.Clic en Book Analytics tab.
		dueDateForAssessmentsPage.clickTabBookAnalytics();
		System.out.println(" b.Clic en Book Analytics tab.");
		
		//c.Clic Assessment.
		dueDateForAssessmentsPage.clickLnkAssessment(data.get(id).get(1).trim());
		System.out.println(" c.Clic Assesment.");
		
		//d.Check box Activity.

		dueDateForAssessmentsPage.chkBoxActivity(data.get(id).get(2).trim());
		System.out.println(" d.Check box Activity.");
		
		//e.Clic botón Set Due Date	
		dueDateForAssessmentsPage.clicBtnSetDueDate();
		System.out.println(" e.Clic botón Set Due Date");

		//e.Ingresar Fecha y Hora.
		//f.Clic en Save.
	
	}

}
