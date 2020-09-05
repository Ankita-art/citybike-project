package es.citybik.citybik;


import es.citybik.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


/**
 * Created by Ankita
 */
public class TestLocation extends TestBase {

    @Test
    public void testLocation() {
        given()
                .when()
                .get("/networks/visa-frankfurt")
                .then()
                .statusCode(200)
                .log().ifValidationFails()
                .body("network.location.city", equalTo("Frankfurt"));
    }

    @Test
    public void testLatitude() {

        float latitude = given()
                .when()
                .get("/networks/visa-frankfurt")
                .then()
                .statusCode(200).extract().path("network.location.latitude");
        String latitudeS = Float.toString(latitude);
        // assertEquals("50.1072", latitudeS);
        System.out.println(latitudeS);
    }

    @Test
    public void testLongitude() {

        float longitude = given()
                .when()
                .get("/networks/visa-frankfurt")
                .then()
                .statusCode(200).extract().path("network.location.longitude");
        String longitudeS = Float.toString(longitude);
        System.out.println(longitudeS);
    }


}

