import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import starter.stepdefinitions.SophosStepDefinitions;
import starter.util.Factory;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/sophos/sophos.feature",
        tags = "@stories",
        snippets = SnippetType.CAMELCASE)
public class ExperimentalTests {

    private static String OS = System.getProperty("os.name").toLowerCase();
    private String driverPath = "/src/test/resources/webdriver/%s/%s";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", getPathDriverByOS());
    }




    private String getPathDriverByOS() {

        String userDirectory = System.getProperty("user.dir");


        if (isWindows()) {
            return userDirectory + String.format(driverPath, "windows", "chromedriver.exe");
        } else if (isMac()) {
            return userDirectory + String.format(driverPath, "mac", "chromedriver");
        } else if (isUnix()) {
            return userDirectory + String.format(driverPath, "linux", "chromedriver");
        }

        throw new IllegalArgumentException("OS not supported");
    }

    private static boolean isWindows() {
        return (OS.indexOf("win") >= 0);
    }

    public static boolean isMac() {
        return (OS.indexOf("mac") >= 0);
    }

    public static boolean isUnix() {
        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0);
    }

    @Test
    public void abrirUrlSophos() throws InterruptedException {
        Map<String, Object> chromePrefs = new HashMap<>();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        WebDriver driver = new ChromeDriver(options);
        Factory.call();
        driver.quit();

    }

}
