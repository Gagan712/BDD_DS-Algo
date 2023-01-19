package Stepdefination;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(
		plugin = {"pretty", "html:target/BDD_DS.html"}, //reporting purpose
		monochrome=false,  //console output
		tags="@tag" , //tags from feature file
		features = {"src/test/resources/Feature/googlelogin.feature"}, //location of feature files
		glue= "Stepdefination") //location of step definition files


public class Testrunner extends AbstractTestNGCucumberTests {
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
}
}
