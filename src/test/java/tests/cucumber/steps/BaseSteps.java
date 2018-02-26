package tests.cucumber.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import screens.*;
import tests.ThreadLocalDriver;

public class BaseSteps {

    protected SplashScreen splashScreen = null;
    protected TutorialScreen tutorialScreen = null;
    protected SelectionScreen selectionScreen = null;
    protected CandidateMainScreen candidateMainScreen = null;
    protected AndroidDriver<MobileElement> driver;
    protected WebDriverWait wait;


    //Screen Classes Initialization
    protected void setupCucumber () {
        System.out.println("Cucumber Base Test Before-login-test-cucumber");
        driver = ThreadLocalDriver.getTLDriver();
        wait = new WebDriverWait(driver, 10);
        splashScreen = new SplashScreen(driver);
        tutorialScreen = new TutorialScreen(driver);
        selectionScreen = new SelectionScreen(driver);
        candidateMainScreen = new CandidateMainScreen(driver);
    }

    protected void teardown(){
        driver.quit();
    }
}