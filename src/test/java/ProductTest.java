import DataObject.ProductData;
import PageObject.ProductPage;
import StepObject.ProductSteps;
import Utilis.ChromeRunner;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends ChromeRunner implements ProductData, ProductPage {
    ProductSteps steps = new ProductSteps();

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("Positive test case: Add review on product")
    public void addReview(){
        steps
                .goToProducts()
                .viewProductBtnPress()
                .nameInput(userName)
                .emailInput(userEmail)
                .reviewInput(reviewText)
                .submitReview();
        Assert.assertTrue(reviewConfirmation.isDisplayed());
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Positive test case: Add product to cart and then delete")
    public void addProductToCart(){
        steps
                .goToProducts()
                .viewProductBtnPress()
                .addToCart()
                .viewCart()
                .deleteProduct();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(viewCartURL, currentUrl, "Check if Current url and cart url is the same");
    }
}
