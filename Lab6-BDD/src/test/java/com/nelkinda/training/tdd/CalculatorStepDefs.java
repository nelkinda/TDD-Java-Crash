package com.nelkinda.training.tdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorStepDefs {
    private final Calculator calculator = new Calculator();

    @Given("^the calculator is reset$")
    public void theCalculatorIsReset() {
        calculator.reset();
    }

    @When("entering {string}")
    public void entering(final String input) {
        calculator.enter(input);
    }

    @Then("the display shows {string}")
    public void theDisplayShows(final String expectedDisplay) {
        Assertions.assertEquals(expectedDisplay, calculator.getDisplay());
    }
}
