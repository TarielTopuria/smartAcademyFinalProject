import DataObject.ProductReviewData;
import PageObject.ProductReviewPage;
import StepObject.ProductReviewSteps;
import Utilis.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductReviewTest extends ChromeRunner implements ProductReviewData, ProductReviewPage {
    ProductReviewSteps steps = new ProductReviewSteps();

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
    @Description("Positive test case: Add product to cart")
    public void addProductToCart(){
        steps
                .goToProducts()
                .viewProductBtnPress()
                .nameInput(userName)
                .emailInput(userEmail)
                .reviewInput(reviewText)
                .submitReview();
        Assert.assertTrue(reviewConfirmation.isDisplayed());
    }
}
