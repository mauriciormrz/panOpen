package com.panOpen.quiz.pageobjects;


import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class DueDateForAssessmentsPage extends PageObject{
	
	// Link Class Name	
	private WebElement lnkClassName;
	
	// Tab Book Analytics
	@FindBy(xpath="//*[@id='main']/div/div[3]/div[2]")
	private WebElementFacade tabBookAnalytics;
	
	// Link Assessment
	private WebElement lnkAssessment;
	
	// Botón Set Due Date
	@FindBy(xpath="//*[text()='Set Due Date']")
	private WebElementFacade btnSetDueDate;
	

	public  void clickClassName(String strClassName) {
		lnkClassName=getDriver().findElement(By.xpath("//*[text()='" + strClassName +"']"));
		lnkClassName.click();
	}
	
	public void clickTabBookAnalytics() {
		tabBookAnalytics.click();
	}
	
	public  void clickLnkAssessment(String strAssessment) {
		
		strAssessment=strAssessment.replace("-", "|");
		lnkAssessment=getDriver().findElement(By.xpath("//*[text()='" + strAssessment +"']/..//*[@class='expander ui-icon ui-icon-plusthick']"));
		lnkAssessment.click();
	}
	
	public  void chkBoxActivity(String strActivity) {
		
		List <WebElement> list = getDriver().findElements(By.xpath("//*[text()='" + strActivity +"']/..//*[@type='checkbox']"));

		 for(int i = 0; i < list.size(); i++){
			 list.get(i).click();
		 }
	}

	public void clicBtnSetDueDate() {
		btnSetDueDate.click();
	}

}