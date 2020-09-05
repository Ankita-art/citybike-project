package es.citybik.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Ankita
 */
public class TestBase {




    @BeforeClass
    public static void inIt() {

        RestAssured.baseURI = "http://api.citybik.es";
        RestAssured.basePath = "/v2";


    }
}
