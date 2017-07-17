package com.wso2telco.tests.apimanager.base;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty","html:target/cucumber-html-report","json:target/cucumber-report.json" },
		 features = {
	/*	"src/test/resources/feature/",*/
		"src/test/resources/feature/hub-2.0.0/Dialog-AllStepsBySequense2.feature"
},
glue={
		"com.wso2telco.tests.apimanager.base",
		"com.wso2telco.tests.apimanager.steps.activitiexplorer",
		"com.wso2telco.tests.apimanager.steps.apimanager",
		"com.wso2telco.tests.apimanager.steps.apipublisher",
		"com.wso2telco.tests.apimanager.steps.idserver",
		"com.wso2telco.tests.apimanager.steps.activitymonitor",
		"com.wso2telco.tests.apimanager.steps.mailinator"
},
tags = {
		
//		"@runnerAllsteps",
//		"@createSpsteps",
//		"@addminApproveSteps",
		"@spSubscribeForAPI"
}
)
public class RunCukesTest {

}
