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


}
