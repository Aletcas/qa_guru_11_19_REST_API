package aletca.tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

import static aletca.listeners.CustomAllureListener.withCustomTemplates;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        RestAssured.baseURI = "https://demoqa.com";
        RestAssured.filters(withCustomTemplates());
    }
}
