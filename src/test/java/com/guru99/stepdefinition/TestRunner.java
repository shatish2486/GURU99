package com.guru99.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\features\\AddCustomer.feature", glue = "com.guru99.stepdefinition", plugin = {
		"html:target" })

public class TestRunner {

}
