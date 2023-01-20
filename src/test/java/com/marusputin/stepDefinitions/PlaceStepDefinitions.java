package com.marusputin.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.En;

public class PlaceStepDefinitions implements En {
    public PlaceStepDefinitions() {
        Given("xyz", () -> {

        });
    }

    @When("uuu")
    public void uuu() {
        System.out.println("sdf");
    }

    @Then("mmm")
    public void mmm() {
        System.out.println("sdf");
    }
}
