package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public interface ProductPage {
    SelenideElement
        productsBtn = $(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")),
        allProductPage = $(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2")),
        viewProductBtn = $(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a/i")),
        writeReviewField = $(By.xpath("/html/body/section/div/div/div[2]/div[3]/div[1]/ul/li/a")),
        userNameField = $(By.id("name")),
        userEmailField = $(By.id("email")),
        reviewField = $(By.id("review")),
        submitBtn = $(By.id("button-review")),
        reviewConfirmation = $(By.xpath("//*[@id=\"review-section\"]/div/div/span")),
        addToCart = $(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")),
        viewCartBtn = $(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a")),
        blueTopCheck = $(By.xpath("//*[@id=\"product-1\"]/td[2]/h4/a")),
        deleteBtn = $(By.xpath("//*[@id=\"product-1\"]/td[6]/a/i")),
        emptyCartCheck = $(By.xpath("//*[@id=\"empty_cart\"]"));
}
