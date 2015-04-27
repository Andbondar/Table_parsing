package Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bondar on 4/27/2015.
 */
public class Table implements Tableable{
    protected WebDriver driver;
    protected WebElement webElement;

    public Table(WebDriver driver, WebElement webElement){
        this.driver = driver;
        this.webElement = webElement;
    }

    @Override
    public List<String> listRowNames() {
        return null;
    }

    @Override
    public List<String> listHeaderNames() {
        List<String> returnedList = new ArrayList<>();
        List<WebElement> headerCells = webElement.findElements(By.xpath(".//tr[1]//div"));
        for (WebElement headerCell: headerCells){
            returnedList.add(headerCell.getText());
        }
        return returnedList;
    }

    @Override
    public List<String> takeColumn() {
        return null;
    }

    @Override
    public List<String> takeRow() {
        return null;
    }
}
