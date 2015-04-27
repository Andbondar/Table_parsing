package Cucumber_Tests;

import org.openqa.selenium.WebDriver;

/**
 * Created by bondar on 4/27/2015.
 */
public class StartPage {
    protected WebDriver driver;
    protected String baseURL = "http://www.f1-world.ru/champ2015/stats.php";

    public StartPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get(baseURL);
    }
}
