package com.wso2telco.tests.apimanager.steps.apimanager;

import org.junit.Assert;

import com.wso2telco.apimanager.pageobjects.apihome.apis.APIsPage;
import com.wso2telco.tests.apimanager.base.BasicTestObject;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class APIsSteps extends BasicTestObject {
	
	@Then("^I should see the apimanager APIs page$")
	public void i_should_see_the_apimanager_APIs_page() throws Throwable {
	    APIsPage apispage = new APIsPage(driver);
	    apispage.isAPIPage();
	}
	
	@Then("^I should see apimanager \"([^\"]*)\" api from the left pane$")
	public void i_should_see_apimanager_api_from_the_left_pane(String arg1) throws Throwable {
		APIsPage apispage = new APIsPage(driver);
		Assert.assertTrue("API is not properly created", apispage.isCreatedAPI(arg1));
	}
	
	@When("^I click on the apimanager \"([^\"]*)\" api$")
	public void i_click_on_the_apimanager_api(String arg1) throws Throwable {
		APIsPage apispage = new APIsPage(driver);
		apispage.clickCreatedAPI(arg1);
	}
	//TODO
	@Then("^I should see the apimanager APIs \"([^\"]*)\" status as published$")
	public void i_should_see_the_apimanager_APIs_status_as_published(String arg1) throws Throwable {
		APIsPage apispage = new APIsPage(driver);
		Assert.assertTrue("API status is not published", apispage.validateApiStatus(""));
	}
	
	@When("^I click on Applications dropdown$")
	public void i_click_on_Applications_dropdown() throws Throwable {
		APIsPage apiPage = new APIsPage(driver);
		apiPage.clickApplicationDropDown();
	}
	
	@Then("^I should not see \"([^\"]*)\" Application$")
	public void i_should_not_see_Application(String arg1) throws Throwable {
		APIsPage apiPage = new APIsPage(driver);
		Assert.assertTrue("Application name is on the drop down", apiPage.validateAppName(arg1));
	}
	
	@Then("^I should see \"([^\"]*)\" Application$")
	public void i_should_see_Application(String arg1) throws Throwable {
		APIsPage apiPage = new APIsPage(driver);
		Assert.assertTrue("Application name is not on the drop down", apiPage.validateAppNameInApplications(arg1));
	}

	@When("^I select \"([^\"]*)\"$")
	public void i_select(String arg1) throws Throwable {
		APIsPage apiPage = new APIsPage(driver);
		apiPage.clickAppName(arg1);
	}
	
	@When("^I select \"([^\"]*)\" as operator$")
	public void i_select_as_operator(String arg1) throws Throwable {
		APIsPage apiPage = new APIsPage(driver);
		apiPage.clickOperator(arg1);
	}

	@When("^I click apimanager \"([^\"]*)\" API page subscribe button$")
	public void i_click_apimanager_API_page_subscribe_button(String arg1) throws Throwable {
		APIsPage apiPage = new APIsPage(driver);
		apiPage.clickSubscribe();
	}
//TODO:
	@Then("^I should see Subscription Successful pop up$")
	public void i_should_see_Subscription_Successful_pop_up() throws Throwable {
		APIsPage apiPage = new APIsPage(driver);
		Assert.assertTrue("Subscription success popup is not loaded", apiPage.validateSubscriptionSuccessPopup(""));
	}

	@When("^I click Go to My Subscription button$")
	public void i_click_Go_to_My_Subscription_button() throws Throwable {
		APIsPage apiPage = new APIsPage(driver);
		apiPage.clickGoToSubscriber();
	}
	
	

}
