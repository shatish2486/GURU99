package com.guru99.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.resources.BaseClass;

public class AddCustomerPom extends BaseClass {

	public AddCustomerPom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[@for='done']")
	private WebElement bgcDone;

	@FindBy(xpath = "//input[@id='pending']")
	private WebElement bgcPending;

	@FindBy(id = "fname")
	private WebElement firstName;

	@FindBy(id = "lname")
	private WebElement lastName;

	@FindBy(id = "email")
	private WebElement emil;

	@FindBy(xpath = "//textarea[@placeholder='Enter your address']")
	private WebElement address;

	@FindBy(id = "telephoneno")
	private WebElement phone;

	@FindBy(xpath = "//a[text()='Guru99 telecom']")
	private WebElement logoHomePageLink;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement btnSubmit;

	@FindBy(xpath = "//input[@type='reset']")
	private WebElement btnReset;

	public WebElement getBgcDone() {
		return bgcDone;
	}

	public WebElement getBgcPending() {
		return bgcPending;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmil() {
		return emil;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getLogoHomePageLink() {
		return logoHomePageLink;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getBtnReset() {
		return btnReset;
	}

}
