import DataObject.RegistrationData;
import StepObject.RegistrationSteps;
import Utilis.ChromeRunner;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationPage extends ChromeRunner implements RegistrationData {
    RegistrationSteps steps = new RegistrationSteps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Positive test case for registration")
    public void successfulRegistration() {
        steps
                .goToRegistration()
                .nameInput(fName)
                .emailInput(email)
                .clickSignUp()
                .titleSelect()
                .fNameInput(fName)
                .emailCheck()
                .passwordInput(passwordField)
                .birthDayInput(birthDay, birthMonth, birthYear)
                .newsLetterCheck(true)
                .offersCheck()
                .additionalInfoInput(fName, lName, companyField, addressField, countryField, stateField, cityField, zipField, mobNumberField)
                .accountCreate()
                .continueBtnClick()
                .accountDeleteBtn();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(BASEURL, currentUrl, "Verify if base url and last page url is same");
    }
}
