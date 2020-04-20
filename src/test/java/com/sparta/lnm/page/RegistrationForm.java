package com.sparta.lnm.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.awt.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.List;
//change the fields at the top
public class RegistrationForm {
    WebDriver driver;
    By firstName = new By.ById("firstName");
    By lastName = new By.ById("lastName");
    By age = new By.ByXPath("/html/body/div/form/div[3]/div/input");
    By dateOfBirth = new By.ByXPath("/html/body/div/form/div[4]/div/input");
    By degree = new By.ByXPath("/html/body/div/form/div[7]/div/input");
    By address = new By.ById("inputAddress");
    By county = new By.ById("inputCounty");
    By email = new By.ById("inputemailaddress");
    By phoneNumber = new By.ById("exampleFormControlInput1");

    public RegistrationForm(WebDriver driver){
        this.driver = driver;
        this.driver.manage().window().maximize();
        this.driver.get("http://localhost:9292");
    }

    public boolean checkFirstNameEntered(){
        driver.findElement(By.className("btn-primary")).click();
        String dataFound = iterateThroughClasses(0).getText();
        if(dataFound.equals("Please enter your first name.")){
            return true;
        }
        return false;
    }

    public boolean checkFirstNameEntered(String firstName){
        WebElement data = driver.findElement(this.firstName);
        data.sendKeys(firstName);
        driver.findElement(By.className("btn-primary")).click();
        String dataFound = iterateThroughClasses(0).getText();
        System.out.println(dataFound);
        if(firstName.matches("^[a-zA-Z]*$") && dataFound.equals("")) {
            return true;
        }
        else if(dataFound.equals("Please enter your first name.")){
            return true;
        }

        return false;
    }
    public boolean checkLastName() {
        driver.findElement(By.className("btn-primary")).click();
        String dataFound = iterateThroughClasses(1).getText();
        if(dataFound.equals("Please enter your last name.")){
            return true;
        }
        return false;
    }

    public boolean checkLastName(String lastName){
        WebElement data = driver.findElement(this.lastName);
        data.sendKeys(lastName);
        driver.findElement(By.className("btn-primary")).click();
        String dataFound = iterateThroughClasses(1).getText();
        System.out.println(dataFound);
        if(lastName.matches("^[a-zA-Z]*$") && dataFound.equals("")) {
            return true;
        }
        else if(dataFound.equals("Please enter your last name.")){
            return true;
        }

        return false;
    }

    public boolean checkAgeEntered(){
        driver.findElement(By.className("btn-primary")).click();
        String dataFound = iterateThroughClasses(2).getText();
        if(dataFound.equals("Please enter your age.")){
            return true;
        }
        return false;
    }

    public boolean checkAgeEntered(String age){
        WebElement data = driver.findElement(this.age);
        data.sendKeys(age);
        driver.findElement(By.className("btn-primary")).click();
        String dataFound = iterateThroughClasses(2).getText();
        int value = Integer.parseInt(age);
        if(value>0 && dataFound.equals("")){
            return true;
        }
        else if(dataFound.equals("Please enter your age.")){
            return true;
        }

        return false;
    }

    public boolean checkDateOfBirth(String date){
        WebElement data = driver.findElement(dateOfBirth);
        data.sendKeys(date);
        driver.findElement(By.className("btn-primary")).click();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateInput = LocalDate.parse(date,formatter);
        LocalDate dateNow = LocalDate.now();
        int numberOfDays = Math.toIntExact(Duration.between(dateInput.atStartOfDay(), dateNow.atStartOfDay()).toDays());

        if(numberOfDays>0){
            return true;
        }
        return false;
    }

    public boolean checkAddress(){
        driver.findElement(By.className("btn-primary")).click();
        String dataFound = iterateThroughClasses(3).getText();
        if(dataFound.equals("Please enter an address.")){
            return true;
        }
        return false;
    }

    public boolean checkAddress(String address){
        WebElement data = driver.findElement(this.address);
        data.sendKeys(address);
        driver.findElement(By.className("btn-primary")).click();
        String dataFound = iterateThroughClasses(3).getText();
        if(address.matches("[A-Za-z0-9 _]+") && dataFound.equals("")) {
            return true;
        }
        else if(dataFound.equals("Please enter an address.")){
            return true;
        }

        return false;

    }


    public boolean checkPostCode(){
        driver.findElement(By.className("btn-primary")).click();
        String dataFound = iterateThroughClasses(4).getText();
        if(dataFound.equals("Please enter a postcode.")){
            return true;
        }
        return false;
    }

    public boolean checkEmail(){
        driver.findElement(By.className("btn-primary")).click();
        String dataFound = iterateThroughClasses(5).getText();
        if(dataFound.equals("Please enter an email.")){
            return true;
        }
        return false;
    }

    public boolean checkEmail(String email){
        WebElement data = driver.findElement(this.email);
        data.sendKeys(email);
        driver.findElement(By.className("btn-primary")).click();
        String dataFound = iterateThroughClasses(5).getText();

        if((email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) && dataFound.equals("")) {
            return true;
        }
        else if(dataFound.equals("Please enter an email.")){
            return true;
        }

        return false;
    }

    public boolean checkPhoneNumber(){
        driver.findElement(By.className("btn-primary")).click();
        String dataFound = iterateThroughClasses(6).getText();
        if(dataFound.equals("Please enter a phone number.")){
            return true;
        }
        return false;
    }

    public boolean checkPhoneNumber(String phoneNumber){
        WebElement data = driver.findElement(this.phoneNumber);
        data.sendKeys(phoneNumber);
        driver.findElement(By.className("btn-primary")).click();
        String dataFound = iterateThroughClasses(6).getText();

        if((phoneNumber.matches("^[0-9]{10,11}$")) && dataFound.equals("")) {
            return true;
        }
        else if(dataFound.equals("Please enter a phone number.")){
            return true;
        }

        return false;
    }

    public boolean checkFemaleButton(){
        WebElement male = iterateThroughButtons( 0);
        WebElement female = iterateThroughButtons(1);
        if(!female.isSelected()){
            female.click();
            if(!male.isSelected()){
                return true;
            }
        }
        return false;
    }

    public boolean checkMaleButton(){
        WebElement male = iterateThroughButtons( 0);
        WebElement female = iterateThroughButtons( 1);
        if(!male.isSelected()){
            male.click();
            if(!female.isSelected()) {
                return true;
            }
        }
        return false;
    }

    public boolean checkSDETButton(){
        WebElement sDET = iterateThroughButtons(2);
        WebElement devOps = iterateThroughButtons(3);

        if(!sDET.isSelected()){
            sDET.click();
            if(!devOps.isSelected()){
                return true;
            }
        }
        return false;
    }

    public boolean checkDevOpsButton(){
        WebElement sDET = iterateThroughButtons(2);
        WebElement devOps = iterateThroughButtons(3);
        if(!devOps.isSelected()){
            devOps.click();
            if(!sDET.isSelected()){
                return true;
            }
        }
        return false;
    }

//    public boolean checkDegreeFilled(){
//
//        driver.findElement(By.className("btn-primary")).click();
//        String colourString = driver.findElement(degree).getCssValue("border-color");
//        //colourString.
//        Color Color = java.awt.Color.decode("#dc3545");
//        String rgb = "rgb(" + Color.getRed() + ", " + Color.getGreen() + ", " + Color.getBlue() + ")";
//        if(colourString.equals(rgb)){
//            return true;
//        }
//        System.out.println(colourString);
//        System.out.println(rgb);
//        return false;
//
//    }

    private WebElement iterateThroughClasses(int elementPosition){
        List<WebElement> element = driver.findElements(By.className("invalid-feedback"));
        return element.get(elementPosition);
    }

    private WebElement iterateThroughButtons(int elementPosition){
        List<WebElement> button = driver.findElements(By.className("custom-control-inline"));
        return button.get(elementPosition);
    }


}

