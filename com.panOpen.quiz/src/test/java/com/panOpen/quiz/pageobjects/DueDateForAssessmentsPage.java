package com.panOpen.quiz.pageobjects;

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
	
	// Link Item
	private WebElement lnkItem;
	


	public  void clickClassName(String strClassName) {
		lnkClassName=getDriver().findElement(By.xpath("//*[text()='" + strClassName +"']"));
		lnkClassName.click();
	}
	
	public void clickTabBookAnalytics() {
		tabBookAnalytics.click();
	}
	
	public  void clickLnkItem(String strItem) {

		lnkItem=getDriver().findElement(By.xpath("//*[contains (text(), '" + strItem + "')]"));
		lnkItem.click();
	}
	

}