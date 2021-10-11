package practice.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static By button(String buttonText) {
        return By.xpath(String.format("//div[contains(@class, 'cta')]/a[text()='%s']", buttonText));
    }
}
