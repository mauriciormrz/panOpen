package com.panOpen.quiz.steps;

//import com.panOpen.quiz.pageobjects.LoginPage;
import com.panOpen.quiz.pageobjects.MyClassPage;


import java.util.List;

import net.thucydides.core.annotations.Step;

public class CreateClassSteps {
	
	MyClassPage myClassPage;

	@Step
	public void newClassPanOpen() {

		//a.Clic en My Classes.
		myClassPage.clickLnkMyClasses();
		System.out.println(" a.Clic en My Classes.");
		
		//b.Clic  Create New Class.
		myClassPage.clickBtnCreateNewClass();
		System.out.println(" b.Clic  Create New Class.");
		
	}

	public void FillFormClass(List<List<String>> data, int id) {
		
		//a.Ingresar Class Name.
		myClassPage.setClassName(data.get(id).get(0).trim());
		System.out.println(" a.Ingresar Class Name.");
		
		//d.Seleccionar Meeting Days.
		myClassPage.setBtnM(Integer.parseInt(data.get(id).get(3).trim()));	
		myClassPage.setBtnT(Integer.parseInt(data.get(id).get(4).trim()));
		myClassPage.setBtnW(Integer.parseInt(data.get(id).get(5).trim()));	
		myClassPage.setBtnTH(Integer.parseInt(data.get(id).get(6).trim()));
		myClassPage.setBtnF(Integer.parseInt(data.get(id).get(7).trim()));	
		myClassPage.setBtnS(Integer.parseInt(data.get(id).get(8).trim()));
		myClassPage.setBtnSU(Integer.parseInt(data.get(id).get(9).trim()));
		System.out.println(" d.Seleccionar Meeting Days.");
		
		//e.Ingresar Start Time.
		myClassPage.setStartTime(data.get(id).get(10).trim());
		System.out.println(" e.Ingresar Start Time.");
		
		//f.Ingresar End Time.
		myClassPage.setEndTime(data.get(id).get(11).trim());
		System.out.println(" f.Ingresar End Time.");
		
		//b.Ingresar Start Date.
		myClassPage.setStartDate(data.get(id).get(1).trim());
		System.out.println(" b.Ingresar Start Date.");
		
		//c.Ingresar End Date.
		myClassPage.setEndDate(data.get(id).get(2).trim());
		System.out.println(" c.Ingresar End Date.");

		//g.Clic botón Save Class.
		myClassPage.clicBtnSaveClass();
		
		myClassPage.esperar(15);
		
	}
}
