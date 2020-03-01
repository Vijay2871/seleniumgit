package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/functionalTests/Login.feature",
dryRun=false,
glue= {"src/test/java/stepDefenitions"},
plugin= {"html:target/cucumber-html-report"})

public class TestRunner {

}