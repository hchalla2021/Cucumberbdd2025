package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       features = "C:\\Users\\hchalla2020\\NewWorkSpace2023\\Cucumberbdd_2023\\src\\test\\java\\Features",
        glue = "StepDefinition",
        tags = "@RegressionTesting",
        plugin = {"pretty","html:target/Cucumber_report/CucumberReport2023.html"}

)
public class RunnerClass {
}
