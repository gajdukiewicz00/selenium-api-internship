package pl.innowise.internship.pages;

import org.openqa.selenium.JavascriptExecutor;
import pl.innowise.internship.elements.ButtonElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage {

    private final By clickButton =  By.id("submit");
    private final By output =  By.id("output");

    ButtonElement buttonElement = new ButtonElement(By.id("submit"));


    public void openLoginPage() {
        open("https://demoqa.com/text-box");
    }

    public void fillText(String text){
        buttonElement.sendKeys(text);
        WebElement button = driver.findElement(clickButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
        buttonElement.click();
    }

    public void verifyButtonClicked(){
        driver.findElement(output).isDisplayed();
    }

}
