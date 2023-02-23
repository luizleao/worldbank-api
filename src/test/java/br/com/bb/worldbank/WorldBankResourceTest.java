package br.com.bb.worldbank;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class WorldBankResourceTest {

    @Test
    public void testGetIndicatorsEndpoint() {
        given()
          .when().get("/worldbank/indicators?country=BRA")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}