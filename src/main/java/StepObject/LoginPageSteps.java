package StepObject;

import DataObject.LoginData;
import PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

public class LoginPageSteps implements LoginPage, LoginData {
    @Step("Click on 'Signup / Login' button and Verify 'Login to your account' is visible")
    public LoginPageSteps goToRegistration(){
        authReg.click();
        Assert.assertTrue(loginAccountVisibility.isDisplayed(), "Verify 'Login to your account' is visible");
        return this;
    }

    @Step("Enter correct email address. Email: {emailAddress}")
    public LoginPageSteps emailInput(String emailAddress){
        emailInput.sendKeys(emailAddress);
        Assert.assertTrue(emailInput.is(Condition.not(Condition.empty)), "Verify that email field is not empty");
        return this;
    }

    @Step("Enter correct password. Email: {password}")
    public LoginPageSteps passwordInput(String password){
        passwordInput.sendKeys(password);
        Assert.assertTrue(passwordInput.is(Condition.not(Condition.empty)), "Verify that password field is not empty");
        return this;
    }

    @Step("Press Login Button and verify logging in")
    public LoginPageSteps logInBtnPress(){
        loginBtn.click();
        Assert.assertTrue(loggedVerification.isDisplayed(), "Verify that 'Logged in as username' is visible");
        return this;
    }

    @Step("Press Login Button and verify logging in")
    public LoginPageSteps incorrectLogInBtnPress(){
        loginBtn.click();
        return this;
    }

    @Step("Press LogOut Button")
    public LoginPageSteps logOutBtnPress(){
        logOutBtn.click();
        return this;
    }
}
