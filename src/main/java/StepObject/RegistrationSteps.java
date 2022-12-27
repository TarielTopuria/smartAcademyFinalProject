package StepObject;

import DataObject.RegistrationData;
import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;


public class RegistrationSteps implements RegistrationPage, RegistrationData {
    @Step("Click Registration Button and verifying that 'New User Signup!' is visible")
    public RegistrationSteps goToRegistration(){
        authReg.click();
        Assert.assertTrue(newUserSignupText.isDisplayed());
        return this;
    }

    @Step("Entering name in the name field. Value: {name}")
    public RegistrationSteps nameInput(String name){
        nameInput.sendKeys(name);
        return this;
    }


    @Step("Enter email in email field. Value: {email}")
    public RegistrationSteps emailInput(String email){
        emailInput.sendKeys(email);
        return this;
    }

    @Step("Click 'Signup' button")
    public RegistrationSteps clickSignUp(){
        signUPBtn.click();
        return this;
    }

    @Step("Selecting title")
    public RegistrationSteps titleSelect(){
        titleBtn.click();
        return this;
    }

    @Step("Entering fist Name. Value: {firstName}")
    public RegistrationSteps fNameInput(String firstName){
        nameLabel.clear();
        Assert.assertTrue(nameLabel.is(Condition.empty));
        nameLabel.sendKeys(firstName);
        return this;
    }

    @Step("Verify that Email field is not Empty")
    public RegistrationSteps emailCheck(){
        Assert.assertTrue(emailField.is(Condition.not(Condition.empty)), "Verify if email field is not empty");
        return this;
    }

    @Step("Entering password and Verify if email field is not empty. Value: {password}")
    public RegistrationSteps passwordInput(String password){
        passwordInput.sendKeys(password);
        Assert.assertTrue(passwordInput.is(Condition.not(Condition.empty)), "Verify if email field is not empty");
        return this;
    }

    @Step("Entering Date of Birth: Day: {}, Month: {}, Year: {}")
    public RegistrationSteps birthDayInput(String day, String month, String year){
        DayOfBirthInput.selectOptionByValue(day);
        Assert.assertTrue(DayOfBirthInput.is(Condition.not(Condition.empty)), "Verify if day field is not empty");
        MonthOfBirthInput.selectOptionByValue(month);
        Assert.assertTrue(MonthOfBirthInput.is(Condition.not(Condition.empty)), "Verify if month field is not empty");
        YearOfBirthInput.selectOptionByValue(year);
        Assert.assertTrue(YearOfBirthInput.is(Condition.not(Condition.empty)), "Verify if year field is not empty");
        return this;
    }

    @Step("Select checkbox 'Sign up for our newsletter!'")
    public RegistrationSteps newsLetterCheck(boolean value){
        if(value){
            newsLetterCheck.click();
        }
        return this;
    }

    @Step("Select checkbox 'Receive special offers from our partners!'")
    public RegistrationSteps offersCheck(){
        offersCheck.click();
        return this;
    }

    @Step("Fill additional details: First name: {firstName}, Last name: {lastName}, Company: {company}, Address: {address}, Country: {country}, State: {state}, City: {city}, Zipcode {zip}, Mobile Number {number}")
    public RegistrationSteps additionalInfoInput(String firstName, String lastName, String company, String address, String country, String state, String city, String zip, String number){
        fNameInput.sendKeys(firstName);
        Assert.assertTrue(fNameInput.is(Condition.not(Condition.empty)),"Verify if first name field is not empty");
        lNameInput.sendKeys(lastName);
        Assert.assertTrue(lNameInput.is(Condition.not(Condition.empty)), "Verify if last name field is not empty");
        companyInput.sendKeys(company);
        Assert.assertTrue(companyInput.is(Condition.not(Condition.empty)), "Verify if company field is not empty");
        addressInput.sendKeys(address);
        Assert.assertTrue(addressInput.is(Condition.not(Condition.empty)), "Verify if address field is not empty");
        countrySelect.selectOptionByValue(country);
        Assert.assertTrue(countrySelect.is(Condition.not(Condition.empty)),"Verify if country field is not empty");
        stateInput.sendKeys(state);
        Assert.assertTrue(stateInput.is(Condition.not(Condition.empty)), "Verify if state field is not empty");
        cityInput.sendKeys(city);
        Assert.assertTrue(cityInput.is(Condition.not(Condition.empty)), "Verify if city field is not empty");
        zipCodeInput.sendKeys(zip);
        Assert.assertTrue(zipCodeInput.is(Condition.not(Condition.empty)), "Verify if zip code field is not empty");
        mobileNumberInput.sendKeys(number);
        Assert.assertTrue(mobileNumberInput.is(Condition.not(Condition.empty)),"Verify if mobile number field is not empty");
        return this;
    }

    @Step("Click 'Create Account button' and Verify that 'ACCOUNT CREATED!' is visible")
    public RegistrationSteps accountCreate(){
        createAccountButton.click();
        Assert.assertTrue(accCreated.isDisplayed(), "Verify if 'ACCOUNT CREATED!' is visible");
        return this;
    }

    @Step("Click 'Continue' button")
    public RegistrationSteps continueBtnClick(){
        continueButton.click();
        if(dismissButton.isDisplayed()){
            dismissButton.click();
        }
        return this;
    }

    @Step("Click 'Delete Account' button and Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button")
    public RegistrationSteps accountDeleteBtn(){
        deleteAcc.click();
        Assert.assertTrue(accDeleted.isDisplayed(), "Verify if 'Logged in as username' is visible");
        return this;
    }
}
