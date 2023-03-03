package org.cubeVentures.pageObjects;

import org.cubeVentures.utils.web.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntrepreneursPage extends BasePage {
    /**
     * The name field to the newsletter 'Entrepreneurs'.
     */
    @FindBy(id = "input_comp-ldw8d2js")
    private WebElement nameField;

    /**
     * The email field to the newsletter 'Entrepreneurs'.
     */
    @FindBy(id = "input_comp-ldw8ng9s")
    private WebElement emailField;

    /**
     * The subscribe button field to the newsletter 'Entrepreneurs'.
     */
    @FindBy(id = "comp-ldw8ctun")
    private WebElement subscribeButton;

    /**
     * Constructor method for the BasePage class.
     *
     * @param driver The driver that controls the behaviour
     *               of a web browser.
     */
    public EntrepreneursPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Checks if the name field is displayed.
     *
     * @return True if the name field is displayed,
     * otherwise the return is false.
     */
    public boolean isNameFieldDisplayed() {
        super.waitForVisibility(nameField);
        return nameField.isDisplayed();
    }

    /**
     * Checks if the email field is displayed.
     *
     * @return True if the email field is displayed,
     * otherwise the return is false.
     */
    public boolean isEmailFieldDisplayed() {
        super.waitForVisibility(emailField);
        return emailField.isDisplayed();
    }

    /**
     * Checks if the subscribe button is displayed.
     *
     * @return True if the subscribe button is displayed,
     * otherwise the return is false.
     */
    public boolean isSubscribeButtonDisplayed() {
        super.waitForVisibility(subscribeButton);
        return subscribeButton.isDisplayed();
    }

}
