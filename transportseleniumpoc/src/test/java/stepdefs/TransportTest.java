package stepdefs;

import commonUtils.ActionsBaseHooks;
import commonUtils.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageClasses.TripPage;

import static junit.framework.TestCase.assertTrue;

public class TransportTest extends Base {


    @Given("^Phileas is planning a trip$")
    public void phileas_is_planning_a_trip() throws Throwable {
        ActionsBaseHooks base = new ActionsBaseHooks();
        base.getUrl("https://transportnsw.info/trip#/");
        System.out.print("Navigated to Url");

    }

    @When("^he executes a trip plan from \"([^\"]*)\" to \"([^\"]*)\"$")
    public void he_executes_a_trip_plan_from_to(String from, String to) throws Throwable {
        TripPage tripPage = PageFactory.initElements(driver, TripPage.class);
        tripPage.setTextToField("from", from);
        tripPage.setTextToField("to", to);
        tripPage.clickFirstBox();
        tripPage.clickGoButton();
    }

    @Then("^a list of trips should be provided$")
    public void a_list_of_trips_should_be_provided() throws Throwable {
        TripPage tripPage = PageFactory.initElements(driver, TripPage.class);
        assertTrue(tripPage.listItemsPresent());
        //driver.close();

    }
}
