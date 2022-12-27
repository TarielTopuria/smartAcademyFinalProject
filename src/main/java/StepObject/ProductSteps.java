package StepObject;

import DataObject.ProductReviewData;
import PageObject.ProductReviewPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.testng.Assert;


public class ProductReviewSteps implements ProductReviewData, ProductReviewPage {
    @Step("Click on 'Signup / Login' button and Verify 'Login to your account' is visible")
    public ProductReviewSteps goToProducts(){
        productsBtn.click();

        Assert.assertTrue(allProductPage.isDisplayed(), "Verify user is navigated to ALL PRODUCTS page successfully");
        return this;
    }

    @Step("Click on 'View Product' button and Verify 'Write Your Review' is visible")
    public ProductReviewSteps viewProductBtnPress(){
        viewProductBtn.click();
        Assert.assertTrue(writeReviewField.isDisplayed(), "Verify 'Write Your Review' is visible");
        return this;
    }

    @Step("Enter name. Value: {reviewerName}")
    public ProductReviewSteps nameInput(String reviewerName){
        userNameField.sendKeys(reviewerName);
        Assert.assertTrue(userNameField.is(Condition.not(Condition.empty)), "Verify that name field is not empty");
        return this;
    }

    @Step("Enter email. Value: {reviewerEmail}")
    public ProductReviewSteps emailInput(String reviewerEmail){
        userEmailField.sendKeys(reviewerEmail);
        Assert.assertTrue(userNameField.is(Condition.not(Condition.empty)), "Verify that email field is not empty");
        return this;
    }

    @Step("Input review. Value: {review}")
    public ProductReviewSteps reviewInput(String review){
        reviewField.sendKeys(review);
        Assert.assertTrue(userNameField.is(Condition.not(Condition.empty)), "Verify that review field is not empty");
        return this;
    }

    @Step("Click 'Submit' button")
    public ProductReviewSteps submitReview(){
        submitBtn.click();
        return this;
    }
}
