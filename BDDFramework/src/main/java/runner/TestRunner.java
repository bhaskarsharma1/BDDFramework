package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/mukka/eclipse-workspace/BDDFramework/src/main/java/Features", glue= {"stepDefinitions"}, format={"pretty","html:output"})
public class TestRunner {
	
}
