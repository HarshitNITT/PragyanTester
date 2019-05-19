

//package java;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/home/harshit/IdeaProjects/PragyanTester/src/test/resources/Features/login.feature"},
		glue={"stepsdefinition"},
		format = {"pretty", "html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome = true,
		strict = true,
		dryRun = false
)
public class TestRunner {
	public TestRunner() {
	}
}
