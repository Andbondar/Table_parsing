package Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by bondar on 4/27/2015.
 * Methods:
 * a. getText
 b. getLinks
 c. getImages
 */
public class Cell {
    protected WebDriver driver;

    public Cell(WebDriver driver){
        this.driver = driver;
    }

    public String getText(){
        return driver.findElement(By.xpath(".//")).getText();
    }

}
