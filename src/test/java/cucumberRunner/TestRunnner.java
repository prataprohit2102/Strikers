package cucumberRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;


@RunWith(Cucumber.class)
@CucumberOptions(
		

          features ="/Users/sonamsharma/workspace/Exercise/src/test/java/features/",
          glue = {"stepdefs"}
          )

public class TestRunnner {
	
}