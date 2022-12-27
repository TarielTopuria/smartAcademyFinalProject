import DataObject.LoginData;
import PageObject.LoginPage;
import StepObject.LoginPageSteps;
import Utilis.ChromeRunner;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends ChromeRunner implements LoginData, LoginPage {
    LoginPageSteps steps = new LoginPageSteps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Positive test case: Login User with correct email and password")
    public void successfulLogIn(){
        steps
                .goToRegistration()
                .emailInput(emailField)
                .passwordInput(passwordField)
                .logInBtnPress()
                .logOutBtnPress();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(logInPageURL, currentUrl, "Verify successful logging out and check if current url and base url is same");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Negative test case: Login User with correct email and incorrect password")
    public void loginWithIncorrectPassword(){
        steps
                .goToRegistration()
                .emailInput(emailField)
                .passwordInput(incorrectPasswordField)
                .incorrectLogInBtnPress();
        Assert.assertTrue(incorrectDataError.isDisplayed(), "Verify error 'Your email or password is incorrect!' is visible");
    }
}
