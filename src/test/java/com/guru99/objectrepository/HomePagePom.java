package com.guru99.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.resources.BaseClass;

public class HomePagePom extends BaseClass {

	public HomePagePom() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Add Customer']")
	private WebElement addCustomer;
	
	@FindBy(xpath = "//a[text()='Add Tariff Plan']")
	private WebElement addTarifPlan;

	@FindBy(xpath = "//a[text()='Add Tariff Plan to Customer']")
	private WebElement addTariffPlanToCustomer;

	@FindBy(xpath = "//a[text()='Pay Billing']")
	private WebElement payBilling;

	@FindBy(xpath = "//a[text()='Guru99 telecom']")
	private WebElement logoHomePageLink;

	public WebElement getAddCustomer() {
		return addCustomer;
	}

	public WebElement getAddTarifPlan() {
		return addTarifPlan;
	}

	public WebElement getAddTariffPlanToCustomer() {
		return addTariffPlanToCustomer;
	}

	public WebElement getPayBilling() {
		return payBilling;
	}

	public WebElement getLogoHomePageLink() {
		return logoHomePageLink;
	}

	
}
