import DataObject.RegistrationData;
import PageObject.RegistrationPage;
import StepObject.RegistrationSteps;
import Utilis.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationPageTest extends ChromeRunner implements RegistrationData, RegistrationPage {
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
        Assert.assertTrue(authReg.isDisplayed(), "Verify if account deleted successfully");
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Negative test case for registration with existing email")
    public void registrationWithExistingEmail() {
        steps
                .goToRegistration()
                .nameInput(fName)
                .emailInput(existingEmail)
                .clickSignUp();
    }
}
