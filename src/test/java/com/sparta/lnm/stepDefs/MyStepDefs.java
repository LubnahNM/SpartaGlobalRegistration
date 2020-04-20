package com.sparta.lnm.stepDefs;

import com.sparta.lnm.page.RegistrationForm;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepDefs {
    WebDriver webDriver = new ChromeDriver();
    RegistrationForm registrationForm = new RegistrationForm(webDriver);

    @Given("I am on the registration page")
    public void iAmOnTheRegistrationPage() {

    }

    @When("I forget to input information")
    public void iForgetToInputInformation() {
        webDriver.findElement(By.className("btn-primary")).click();
    }

    @Then("I will be notified to input my name")
    public void iWillBeNotifiedToInputMyName() {
        Assertions.assertTrue(registrationForm.checkFirstNameEntered());
    }

    @When("I accidentally type my name with a number")
    public void iAccidentallyTypeMyNameWithANumber() {
        Assertions.assertTrue(registrationForm.checkFirstNameEntered("Lub4n@h"));
    }

    @Then("I will be notified to input my last name")
    public void iWillBeNotifiedToInputMyLastName() {
        Assertions.assertTrue(registrationForm.checkLastName());
    }

    @When("I accidentally type number in my lastname")
    public void iAccidentallyTypeNumberInMyLastname() {
        Assertions.assertTrue(registrationForm.checkLastName("M@s3mbe"));
    }

    @Then("I will be notified to input my age")
    public void iWillBeNotifiedToInputMyAge() {
        Assertions.assertTrue(registrationForm.checkAgeEntered());
    }

    @When("I accidentally enter a negative age")
    public void iAccidentallyEnterANegativeAge() {
        Assertions.assertTrue(registrationForm.checkAgeEntered("-2"));
    }

    @Then("I will be notified to input my address")
    public void iWillBeNotifiedToInputMyAddress() {
        Assertions.assertTrue(registrationForm.checkAddress());
    }

    @When("I input a wrong character type in the address")
    public void iInputAWrongCharacterTypeInTheAddress() {
        Assertions.assertTrue(registrationForm.checkAddress("4& SouthEnd"));
    }

    @Then("I will be notified to input my postcode")
    public void iWillBeNotifiedToInputMyPostcode() {
        Assertions.assertTrue(registrationForm.checkPostCode());
    }

    @Then("I will be notified to input my email address")
    public void iWillBeNotifiedToInputMyEmailAddress() {
        Assertions.assertTrue(registrationForm.checkEmail());
    }

    @When("I fill in my email in an incorrect format")
    public void iFillInMyEmailInAnIncorrectFormat() {
        Assertions.assertTrue(registrationForm.checkEmail("lmasembe@spartagloba..com"));
    }

    @Then("I will be notified to input my phone number")
    public void iWillBeNotifiedToInputMyPhoneNumber() {
        Assertions.assertTrue(registrationForm.checkPhoneNumber());
    }

    @When("I enter a invalid number")
    public void iEnterAInvalidNumber() {
        Assertions.assertTrue(registrationForm.checkPhoneNumber("020837489"));
    }

    @Then("I can select that I am a female")
    public void iCanSelectThatIAmAFemale() {
        Assertions.assertTrue(registrationForm.checkFemaleButton());
    }
}
