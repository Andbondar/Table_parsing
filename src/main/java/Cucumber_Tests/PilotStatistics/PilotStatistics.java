package Cucumber_Tests.PilotStatistics;

import Cucumber_Tests.PageInstance;
import Table.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by bondar on 4/27/2015.
 */
public class PilotStatistics extends PageInstance{
    protected WebDriver driver;

    public PilotStatistics(WebDriver driver){
        this.driver = driver;
    }

    public List<String> getHeaderNames(String tableXPath){
        table = new Table(driver, driver.findElement(By.xpath(tableXPath)));
        return table.listHeaderNames();
    }
}
