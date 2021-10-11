package practice.tasks.interactions;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import practice.pages.HomePage;

public class ClickOn extends PageObject {
    public void homeButton(String text) {
        $(HomePage.button(text)).click();
    }

    public void elementBy(By element){
        $(element).click();
    }
}
