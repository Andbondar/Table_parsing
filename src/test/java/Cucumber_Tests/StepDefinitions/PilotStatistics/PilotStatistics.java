package Cucumber_Tests.StepDefinitions.PilotStatistics;

import Cucumber_Tests.PageInstance;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bondar on 4/27/2015.
 */
public class PilotStatistics extends PageInstance{
    @Then("^On page 'Statistics by pilots' list of headers are in sequence \"([^\"]*)\"$")
    public void On_page_Statistics_by_pilots_list_of_headers_are_in_sequence(String inputString){
        pilotStatistics = startPage.openPilotStatistics();
        String[] inputArray = inputString.split(", ");
        System.out.println(Arrays.toString(inputArray));
        List<String> actualHeaderNames = pilotStatistics.getHeaderNames("(.//table[@class=\"f1cup\"])[2]");
        System.out.println(actualHeaderNames);

        Assert.assertEquals("Unexpected list of headers in table", inputString, actualHeaderNames.toString());
    }
}
