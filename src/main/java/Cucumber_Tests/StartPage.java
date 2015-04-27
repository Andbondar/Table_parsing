package Cucumber_Tests;

import Cucumber_Tests.PilotStatistics.PilotStatistics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by bondar on 4/27/2015.
 */
public class StartPage extends PageInstance{
    protected WebDriver driver;
    protected String baseURL = "http://www.f1-world.ru/champ2015/stats.php";

    public StartPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get(baseURL);
    }

    public PilotStatistics openPilotStatistics(){
        driver.findElement(By.xpath(".//a[@href=\"/champ2015/stats.php\"]")).click();
        return new PilotStatistics(driver);
    }
}
