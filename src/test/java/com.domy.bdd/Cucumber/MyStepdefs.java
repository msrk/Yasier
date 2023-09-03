package com.domy.bdd.Cucumber;

import com.domy.bdd.pages.MainPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {
   MainPage mainPage = new MainPage();
    RequestSpecification request;

    @Given("^go to video$")
    public void goToVideo() {
        mainPage.gotToFav();
    }

    @When("^add to favorties$")
    public void addToFavorties() {
        mainPage.addVideoToVaf();
    }

    @Then("^video is added$")
    public void videoIsAdded() {
        mainPage.vafVideo();
    }

    @Given("^we request movie (\\d+)$")
    public void weRequistMovie(int arg0) {
        RestAssured.baseURI="https://api.themoviedb.org/3/movie/"+String.valueOf(arg0);
        request = RestAssured.given()
                .queryParam("api_key", "9e19d579b0e9f39180407460e4ae06e6")
                .when();
    }



    @Then("^we get (\\d+) response$")
    public void weGetResponse(int arg0) {

        assertEquals(request.get ().statusCode(), arg0);
    }
}
