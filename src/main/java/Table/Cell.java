package Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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

    public List<WebElement> getLinks(){
        ArrayList<WebElement> returnedList = new ArrayList<>();
        int size = driver.findElements(By.xpath(".//a")).size();
        for (int i = 0; i<size; i++){
            returnedList.add(driver.findElements(By.xpath(".//a")).get(i));
        }
        return returnedList;
    }

    public List<WebElement> getImages(){
        ArrayList<WebElement> returnedList = new ArrayList<>();
        int size = driver.findElements(By.xpath(".//img")).size();
        for (int i = 0; i<size; i++){
            returnedList.add(driver.findElements(By.xpath(".//img")).get(i));
        }
        return returnedList;
    }

}
