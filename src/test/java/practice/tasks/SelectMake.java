package practice.tasks;

import net.serenitybdd.core.pages.PageObject;
import practice.pages.NewCarsPage;

public class SelectMake extends PageObject {
    public void inTheDropdown(String makeName) {
        $(NewCarsPage.COMBOBOX_SELECT_MAKE).click();
        $(NewCarsPage.makeItemList(makeName)).click();
    }
}
