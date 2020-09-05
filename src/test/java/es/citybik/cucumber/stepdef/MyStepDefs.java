package es.citybik.cucumber.stepdef;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import es.citybik.steps.CityBikSteps;

import net.thucydides.core.annotations.Steps;

import static org.hamcrest.Matchers.equalTo;


/**
 * Created by Ankita
 */

public class MyStepDefs {
    @Steps
    CityBikSteps cityBikSteps;
    Float latitude;
    Float longitude;

    @When("^I send a GET request to the networks with visa-frankfurt$")
    public void iSendAGETRequestToTheNetworksWithVisaFrankfurt() {

    }

    @Then("^I verify that id \"([^\"]*)\" is in Germany$")
    public void iVerifyThatIdIsInGermany(String id) {
        cityBikSteps.networkInfoById().statusCode(200);

        cityBikSteps.networkInfoById().body("network.location.city", equalTo("Frankfurt"));
        cityBikSteps.networkInfoById().body("network.location.country", equalTo("DE"));


    }


    @And("^in return i get corresponded latitude and longitude$")
    public void inReturnIGetCorrespondedLatitudeAndLongitude() {

        latitude = cityBikSteps.networkInfoById().extract().path("network.location.latitude");

        longitude = cityBikSteps.networkInfoById().extract().path("network.location.longitude");

        System.out.println("The latitude of Germany is : = " + latitude);
        System.out.println("The longitude of Germany is : = " + longitude);


    }


}
