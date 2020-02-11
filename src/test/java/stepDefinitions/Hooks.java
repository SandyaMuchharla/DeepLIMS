package stepDefinitions;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.DriverBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class Hooks extends DriverBase
{
    private static Logger log=LogManager.getLogger(Hooks.class.getName());
    @Before
    public void beforeScenario(Scenario scenario)
    {
       // DriverBase.Initialize(System.getProperty("browser"),System.getProperty("viewport"));
        DriverBase.Initialize("chrome","desktop");
        log.info("========================================================");
        log.info("Browser has initialised");
        Reporter.assignAuthor("SM - Sandya Muchharla");
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            try {
                //This takes a screenshot from the driver at save it to the specified location
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                byte[] screenshot= ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
                scenario.write("URL at failure  :" + driver.getCurrentUrl());
                File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber/screenshots/" + screenshotName + ".png");
                Files.copy(sourcePath, destinationPath);
                //This attach the specified screenshot to the test
                Reporter.addScreenCaptureFromPath(destinationPath.toString());

            } catch (IOException e)
            {
                System.err.println(e.getMessage());
            }
        }
        DriverBase.quit();
        log.info("Quit the browser");
        log.info("========================================================");
    }

}
