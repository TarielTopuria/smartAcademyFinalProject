package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public interface LoginPage {
    SelenideElement
        authReg = $(By.linkText("Signup / Login")),
        loginAccountVisibility = $(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2")),
        emailInput = $(By.name("email")),
        passwordInput = $(By.name("password")),
        loginBtn = $(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")),
        loggedVerification = $(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")),
        logOutBtn = $(By.linkText("Logout")),
        incorrectDataError = $(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p"));
}
