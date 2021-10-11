package practice.pages;

import org.openqa.selenium.By;

public class NewCarsPage {
    public static final By BUTTON_FIND_YOUR_NEXT_CAR = By.cssSelector(".ButtonGreen.findYourCar");
    public static final By COMBOBOX_SELECT_MAKE = By.cssSelector(".CDCYWMMSearchSet .mmyzSearchSelectedMake");
    public static final By CARD_TITLE = By.cssSelector(".modelCardTitle");

    public static By makeItemList(String makeName) {
        return By.xpath(String.format("//*[@class='mmyzFlyoutInner']//a[text()='%s']", makeName));
    }
}
