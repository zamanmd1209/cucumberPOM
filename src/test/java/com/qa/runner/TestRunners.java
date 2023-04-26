package com.qa.runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\MdFiles\\eclipse-workspace\\CucumberPOM\\src\\test\\java\\com\\qa\\features\\fidelityAskQuestions.feature", glue= {"/com/qa/stepDefinitions"},
plugin = { "pretty","html:test-output","json:jason-output/cucumber.json","html:target/cucumber-html-report",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt" },
//tags={"@RegressionTest"},
monochrome=true,
dryRun=false
)


public class TestRunners{
	
	//public class TestRunners extends AbstractTestNGCucumberTests{

}
