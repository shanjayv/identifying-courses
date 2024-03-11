package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {".//Features"},
				glue="stepDefinition",
				plugin= {"pretty", "html:reports/myreport.html", 
						 "rerun:target/rerun.txt"
						 
				},
				
				dryRun=false,    // checks mapping between scenario steps and step definition methods
				monochrome=true,    // to avoid junk characters in output
				publish=true,  // to publish report in cucumber server
				tags="@sanity or @regression"
		
		)
public class TestRun {

}
