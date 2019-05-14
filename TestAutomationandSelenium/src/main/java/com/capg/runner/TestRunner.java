package com.capg.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\VJIT\\updatedEclipse\\TestAutomationandSelenium\\src\\main\\java\\com\\capg\\features\\conference.feature",
		glue= {"stepDefinition"},// name should be same as  packageName that contains definition
		plugin= {"pretty","html:test-output/sample.html"},
		strict= true,
		dryRun=false
		
	
		)

public class TestRunner {

	
	
}
