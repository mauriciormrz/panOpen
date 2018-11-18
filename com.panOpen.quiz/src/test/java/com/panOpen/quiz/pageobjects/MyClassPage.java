package com.panOpen.quiz.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyClassPage extends PageObject{
	
	// Link My Classes
	@FindBy(xpath="//*[@id='ember713']/i")
	private WebElementFacade lnkMyClasses;
	
	// Botón Create New Class
	@FindBy(xpath = "//*[text()='Create New Class']")   
	private WebElementFacade btnCreateNewClass;

	
	// Campo Class Name
	@FindBy(id="class-name")
	private WebElementFacade txtClassName;
	
	
	// Campo Start Date
	@FindBy(xpath="//*[@id='start-date']")
	private WebElementFacade txtStartDate;
	
	// Campo End Date
	@FindBy(xpath="//*[@id='end-date']")
	private WebElementFacade txtEndDate;

	// Campo Meeting Days M
	@FindBy(xpath="//*[@id='add_class']/div[2]/div/div[2]/div[4]/div/span[1]")
	private WebElementFacade btnM;
	
	// Campo Meeting Days T
	@FindBy(xpath="//*[@id='add_class']/div[2]/div/div[2]/div[4]/div/span[2]")
	private WebElementFacade btnT;
	
	// Campo Meeting Days W
	@FindBy(xpath="//*[@id='add_class']/div[2]/div/div[2]/div[4]/div/span[3]")
	private WebElementFacade btnW;
	
	// Campo Meeting Days TH
	@FindBy(xpath="//*[@id='add_class']/div[2]/div/div[2]/div[4]/div/span[4]")
	private WebElementFacade btnTH;
	
	// Campo Meeting Days F
	@FindBy(xpath="//*[@id='add_class']/div[2]/div/div[2]/div[4]/div/span[5]")
	private WebElementFacade btnF;
	
	// Campo Meeting Days S
	@FindBy(xpath="//*[@id='add_class']/div[2]/div/div[2]/div[4]/div/span[6]")
	private WebElementFacade btnS;
	
	// Campo Meeting Days SU
	@FindBy(xpath="//*[@id='add_class']/div[2]/div/div[2]/div[4]/div/span[7]")
	private WebElementFacade btnSU;
	
	// Campo Start Time
	@FindBy(id="start-time")
	private WebElementFacade txtStartTime;
	
	// Campo End Time
	@FindBy(xpath="//*[@id='end-time']")
	private WebElementFacade txtEndTime;
	
	// Botón Save Class
	@FindBy(xpath="//*[@id='toc_options_toggle']")
	private WebElementFacade btnSaveClass;
	
	// Botón Cancel Changes
	private WebElement btnCancelChanges;
	
	
		
	public void clickLnkMyClasses() {
		lnkMyClasses.click();
	}
	
	public void clickBtnCreateNewClass() {
		btnCreateNewClass.click();
	}
	
	
	public void setClassName(String strStartDate) {
		txtClassName.click();
		txtClassName.clear();
		txtClassName.sendKeys(strStartDate);
	}
	
	public void setStartDate(String strStartDate) {
		txtStartDate.typeAndEnter(strStartDate);

	}
	
	public void setEndDate(String strEndDate) {
		txtEndDate.typeAndEnter(strEndDate);
	}
	
	public void setBtnM(Integer intEstado) {
		if (intEstado==1) {
			btnM.click();
		}
	}
	
	public void setBtnT(Integer intEstado) {
		if (intEstado==1) {
			btnT.click();
		}
	}
	
	public void setBtnW(Integer intEstado) {
		if (intEstado==1) {
			btnW.click();
		}
	}
	
	public void setBtnTH(Integer intEstado) {
		if (intEstado==1) {
			btnTH.click();
		}
	}
	
	public void setBtnF(Integer intEstado) {
		if (intEstado==1) {
			btnF.click();
		}
	}
	
	public void setBtnS(Integer intEstado) {
		if (intEstado==1) {
			btnS.click();
		}
	}
	
	public void setBtnSU(Integer intEstado) {
		if (intEstado==1) {
			btnSU.click();
		}
	}
	
	public void setStartTime(String strStartTime) {
		txtStartTime.click();
		txtStartTime.clear();
		txtStartTime.typeAndEnter(strStartTime);
	}
	
	public void setEndTime(String strEndTime) {
		txtEndTime.click();
		txtEndTime.clear();
		txtEndTime.typeAndEnter(strEndTime);
	}
	
	public void clicBtnSaveClass() {
		btnSaveClass.click();
	}
	
	public  void clickBtnCancelChanges(String strClassName) {
		btnCancelChanges=getDriver().findElement(By.xpath("//*[text()='" + strClassName +"']"));
		btnCancelChanges.click();
	}
}
