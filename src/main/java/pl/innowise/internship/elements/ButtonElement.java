package pl.innowise.internship.elements;

import org.openqa.selenium.By;


public class ButtonElement extends BaseElement {

    public ButtonElement(By locator) {
        super(locator);
    }

    public void clickIfVisible(){
        if(isDisplayed()){
            click();
        }
    }
}
