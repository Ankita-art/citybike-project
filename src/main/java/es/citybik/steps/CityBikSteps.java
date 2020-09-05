package es.citybik.steps;

import es.citybik.constants.EndPoint;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

/**
 * Created by Ankita
 */
public class CityBikSteps {
    @Step("Getting the networks for frankfurt")
    public ValidatableResponse networkInfoById() {
        return SerenityRest.rest()
                .given()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoint.GET_CITYBIK_ID)
                .then()
                .log().all();


    }


}

