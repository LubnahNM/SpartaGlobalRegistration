package com.sparta.lnm;

import com.sparta.lnm.page.RegistrationForm;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.text.ParseException;

public class RegistrationPOMTester {


    static WebDriver webDriver = new ChromeDriver();
    static RegistrationForm registrationForm = new RegistrationForm(webDriver);


    @Test
    @DisplayName("Test that if first name is not entered, error message appears")
    public void checkFirstNameEntered(){
        Assertions.assertTrue(registrationForm.checkFirstNameEntered());
        webDriver.close();
    }

    @Test
    @DisplayName("Test to see that first name contains no numbers")
    public void checkFirstNameCorrectForm(){
        Assertions.assertTrue(registrationForm.checkFirstNameEntered("Lubnah"));
    }

    @Test
    @DisplayName("If numbers are entered an error message should appear")
    public void checkIncorrectNameEntered(){
        Assertions.assertTrue(registrationForm.checkFirstNameEntered("Lub4n@h"));
    }

    @Test
    @DisplayName("check if lastname is not entered error message appears")
    public void checkLastNameEntered(){
        Assertions.assertTrue(registrationForm.checkLastName());
        webDriver.close();
    }

    @Test
    @DisplayName("check if lastname is correctly entered no error message appears")
    public void checkCorrectLastNameEntered(){
        Assertions.assertTrue(registrationForm.checkLastName("Masembe"));
    }

    @Test
    @DisplayName("check if lastname is correctly entered no error message appears")
    public void checkIncorrectLastNameEntered(){
        Assertions.assertTrue(registrationForm.checkLastName("M@s3mbe"));
    }


    @Test
    @DisplayName("Test if age is not entered, error message appears")
    public void checkAgeNotEntered(){
        Assertions.assertTrue(registrationForm.checkAgeEntered());
    }

    @Test
    @DisplayName("Test if correct age  is inputted the error message will not show")
    public void checkAgeEntered(){
        Assertions.assertTrue(registrationForm.checkAgeEntered("23"));
    }

    @Test
    @DisplayName("check that negative age an error message appears")
    public void negativeAge(){
        Assertions.assertTrue(registrationForm.checkAgeEntered("-2"));
    }
    @Test
    @DisplayName("check if valid date is entered no error message appears")
    public void checkDateOfBirthEntered(){
        Assertions.assertTrue(registrationForm.checkDateOfBirth("02/04/1996"));
    }

    @Test
    @DisplayName("check if invalid date entered then error message appears")
    public void checkIncorrectDateOfBirtEntered(){
        Assertions.assertTrue(registrationForm.checkDateOfBirth("02/04/2020"));
    }

    @Test
    @DisplayName("Test if address is not entered, error message appears")
    public void checkAddressNotEntered(){
        Assertions.assertTrue(registrationForm.checkAddress());
    }
    @Test
    @DisplayName("Test if correct address is entered, error message does not appear")
    public void checkCorrectAddressEntered(){
        Assertions.assertTrue(registrationForm.checkAddress("123 Main"));
    }

    @Test
    @DisplayName("Test if incorrect address is entered, error message appears")
    public void checkIncorrectAddressEntered(){
        Assertions.assertTrue(registrationForm.checkAddress("4& SouthEnd"));
    }

    @Test
    @DisplayName("Test if postcode is not entered, error message appears")
    public void checkPostCodeEntered(){
        Assertions.assertTrue(registrationForm.checkPostCode());
    }

    @Test
    @DisplayName("check that the email address has not been entered, error message appears")
    public void checkEmailEntered(){
        Assertions.assertTrue(registrationForm.checkEmail());
    }

    @Test
    @DisplayName("check that the email address is valid, error message does not appear")
    public void checkCorrectEmailEntered(){
        Assertions.assertTrue(registrationForm.checkEmail("lmasembe@spartaglobal.com"));
    }

    @Test
    @DisplayName("check that the email address is invalid, error message does appear")
    public void checkIncorrectEmailEntered(){
        Assertions.assertTrue(registrationForm.checkEmail("lmasembe@spartagloba..com"));
    }

    @Test
    @DisplayName("Test if phone number is not entered, error message appears")
    public void checkPhoneNumberEntered(){
        Assertions.assertTrue(registrationForm.checkPhoneNumber());
        webDriver.close();
    }

    @Test
    @DisplayName("Test if valid phone number is entered, error message does not appear")
    public void checkCorrectPhoneNumberEntered(){
        Assertions.assertTrue(registrationForm.checkPhoneNumber("02083746379"));

    }

    @Test
    @DisplayName("Test if invalid phone number is entered, error message appears")
    public void checkIncorrectPhoneNumberEntered(){
        Assertions.assertTrue(registrationForm.checkPhoneNumber("020837489"));

    }

    @Test
    @DisplayName("check that the Female button")
    public void selectFemale(){
        Assertions.assertTrue(registrationForm.checkFemaleButton());
    }

    @Test
    @DisplayName("check that the Male button works")
    public void selectMale(){
        Assertions.assertTrue(registrationForm.checkMaleButton());
    }

    @Test
    @DisplayName("check that the SDET Button works")
    public void sDETButton(){
        Assertions.assertTrue(registrationForm.checkSDETButton());
    }

    @Test
    @DisplayName("check that the DevOps")
    public void devOPsButton(){
        Assertions.assertTrue(registrationForm.checkDevOpsButton());
    }


}
