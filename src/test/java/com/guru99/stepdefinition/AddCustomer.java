package com.guru99.stepdefinition;

import com.guru99.objectrepository.HomePagePom;
import com.guru99.objectrepository.AddCustomerPom;
import com.guru99.resources.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomer extends BaseClass {
	HomePagePom p = new HomePagePom();
	AddCustomerPom a = new AddCustomerPom();

	@Given("The user is in the home page")
	public void the_user_is_in_the_home_page() throws InterruptedException {
		Driver("chrome");
		loadUrl("http://www.demo.guru99.com/telecom/");
		Thread.sleep(200);
	}

	@Given("The user clicks on the Add Customer button")
	public void the_user_clicks_on_the_Add_Customer_button() {
		btnClick(p.getAddCustomer());
	}

	@When("The user enters all the details")
	public void the_user_enters_all_the_details() {
		btnClick(a.getBgcDone());
		type(a.getFirstName(), "Shatish");
		type(a.getLastName(), "Kumar");
		type(a.getEmil(), "xyz@gmail.com");
		type(a.getAddress(), "India");
		type(a.getPhone(), "123456789");
		
	}

	@When("clicks submmit")
	public void clicks_submmit() {
		btnClick(a.getBtnSubmit());
	}

	@Then("the customer Id should be generated")
	public void the_customer_Id_should_be_generated() {
		driver.quit();
	}

}
