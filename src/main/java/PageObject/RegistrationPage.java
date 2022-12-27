package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public interface RegistrationPage {
    SelenideElement
        authReg = $(By.linkText("Signup / Login")),
        newUserSignupText = $(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2")),
        nameInput = $(By.name("name")),
        emailInput = $(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")),
        signUPBtn = $(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")),
        accInfo = $(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b")),
        titleBtn = $(By.id("id_gender1")),
        nameLabel = $(By.id("name")),
        emailField = $(By.id("email")),
        passwordInput = $(By.id("password")),
        DayOfBirthInput = $(By.id("days")),
        MonthOfBirthInput = $(By.id("months")),
        YearOfBirthInput = $(By.id("years")),
        newsLetterCheck = $(By.id("newsletter")),
        offersCheck = $(By.id("optin")),
        fNameInput = $(By.id("first_name")),
        lNameInput = $(By.id("last_name")),
        companyInput = $(By.id("company")),
        addressInput = $(By.id("address1")),
        countrySelect = $(By.id("country")),
        stateInput = $(By.id("state")),
        cityInput = $(By.id("city")),
        zipCodeInput = $(By.id("zipcode")),
        mobileNumberInput = $(By.id("mobile_number")),
        createAccountButton = $(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")),
        accCreated = $(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")),
        continueButton = $(By.linkText("Continue")),
        dismissButton = $(By.id("dismiss-button")),
        deleteAcc = $(By.linkText("Delete Account")),
        accDeleted = $(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")),
        existingEmailError = $(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p"));
}
