package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\Rupa Acharya\\eclipse\\CucumberPOMSeries\\src\\test\\resources\\Appfeatures\\loginPage.feature"},
		glue = {"stepDefinitions","AppHooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true
		
)

public class MyTestRunner {

}
