package org.cubeVentures.pageObjects;

import org.cubeVentures.utils.web.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    /**
     * The 'Entrepreneurs' icon used to access the entrepreneurs page.
     */
    @FindBy(id = "comp-ldwagtv011")
    private WebElement entrepreneursIcon;


    /**
     * Constructor method for the HomePage class.
     *
     * @param driver The driver that controls the behaviour
     *               of a web browser.
     */
    public HomePage(WebDriver driver) { super(driver); }

    /**
     * Checks if the entrepreneurs icon is displayed.
     *
     * @return True if the entrepreneurs icon is displayed,
     * otherwise the return is false.
     */
    public boolean isEntrepreneursIconDisplayed() {
        super.waitForVisibility(entrepreneursIcon);
        return entrepreneursIcon.isDisplayed();
    }


    /**
     * Checks visibility of a specific element and clicks on it.
     *
     * @param element The selected element of the webpage.
     */
    public void completeAccessToElement(WebElement element) {
        super.waitForVisibility(element);
        super.clickElement(element);
    }

    /**
     * Takes the user to the entrepreneurs page.
     *
     * @return The entrepreneurs page is opened.
     */
    public EntrepreneursPage entrepreneursPage() {
        completeAccessToElement(entrepreneursIcon);
        return new EntrepreneursPage(getDriver());
    }



}
