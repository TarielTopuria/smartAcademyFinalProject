package StepObject;

import DataObject.ProductData;
import PageObject.ProductPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;


public class ProductSteps implements ProductData, ProductPage {
    @Step("Click on 'Signup / Login' button and Verify 'Login to your account' is visible")
    public ProductSteps goToProducts(){
        productsBtn.click();

        Assert.assertTrue(allProductPage.isDisplayed(), "Verify user is navigated to ALL PRODUCTS page successfully");
        return this;
    }

    @Step("Click on 'View Product' button and Verify 'Write Your Review' is visible")
    public ProductSteps viewProductBtnPress(){
        viewProductBtn.click();
        Assert.assertTrue(writeReviewField.isDisplayed(), "Verify 'Write Your Review' is visible");
        return this;
    }

    @Step("Enter name. Value: {reviewerName}")
    public ProductSteps nameInput(String reviewerName){
        userNameField.sendKeys(reviewerName);
        Assert.assertTrue(userNameField.is(Condition.not(Condition.empty)), "Verify that name field is not empty");
        return this;
    }

    @Step("Enter email. Value: {reviewerEmail}")
    public ProductSteps emailInput(String reviewerEmail){
        userEmailField.sendKeys(reviewerEmail);
        Assert.assertTrue(userNameField.is(Condition.not(Condition.empty)), "Verify that email field is not empty");
        return this;
    }

    @Step("Input review. Value: {review}")
    public ProductSteps reviewInput(String review){
        reviewField.sendKeys(review);
        Assert.assertTrue(userNameField.is(Condition.not(Condition.empty)), "Verify that review field is not empty");
        return this;
    }

    @Step("Click 'Submit' button")
    public ProductSteps submitReview(){
        submitBtn.click();
        return this;
    }

    @Step("add Product to cart")
    public ProductSteps addToCart(){
        addToCart.click();
        return this;
    }

    @Step("View Cart after adding Product")
    public ProductSteps viewCart(){
        viewCartBtn.click();
        Assert.assertTrue(blueTopCheck.isDisplayed());
        return this;
    }

    @Step("View Cart after adding Product")
    public ProductSteps deleteProduct(){
        deleteBtn.click();
        return this;
    }
}
