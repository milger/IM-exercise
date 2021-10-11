package practice.questions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import practice.pages.NewCarsPage;

import java.util.List;
import java.util.stream.Collectors;

public class FilteredCars extends PageObject {
    public List<String> cardTitleList() {
        return findAll(NewCarsPage.CARD_TITLE).stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }
}
