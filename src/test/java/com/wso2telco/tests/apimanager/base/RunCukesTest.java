package com.wso2telco.tests.apimanager.base;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty","html:target/cucumber-html-report","json:target/cucumber-report.json" },
		 features = {
	/*	"src/test/resources/feature/",*/
		"src/test/resources/feature/InternalGatewayFlow_Type2.feature"
},
glue={ 
		"com.wso2telco.tests.apimanager.base",
		"com.wso2telco.tests.apimanager.steps.activitiexplorer",
		"com.wso2telco.tests.apimanager.steps.apimanager",
		"com.wso2telco.tests.apimanager.steps.apipublisher",
		"com.wso2telco.tests.apimanager.steps.idserver",
		"com.wso2telco.tests.apimanager.steps.activitymonitor",
		"com.wso2telco.tests.apimanager.steps.mailinator",
		"com.wso2telco.test.carbon.pageobjects.carbon.steps"
},
tags = {
		
//		"@runnerAllsteps",
//		"@createSpsteps",
//		"@addminApproveSteps",
		"@InternalGatewayTypeTwoE2EFlow"
//		"@deleteAPI"
}
)
public class RunCukesTest {

}
