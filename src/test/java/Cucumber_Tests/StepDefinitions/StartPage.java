package Cucumber_Tests.StepDefinitions;

import Cucumber_Tests.PageInstance;
import cucumber.api.java.en.Given;

/**
 * Created by bondar on 4/27/2015.
 */
public class StartPage extends PageInstance{
    @Given("^I on page ‘http://www.f(\\d+)-world.ru/champ(\\d+)/stats.php’$")
    public void I_on_page_http_www_f_world_ru_champ_stats_php(int arg1, int arg2){
        startPage.open();
    }
}
