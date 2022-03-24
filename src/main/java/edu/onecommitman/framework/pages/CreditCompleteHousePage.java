package edu.onecommitman.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditCompleteHousePage extends BasePage{

    @FindBy(xpath = "//div/label[text() =\"Стоимость недвижимости\"]/../input")
    private WebElement realEstatePrice;

    @FindBy(xpath = "//div/label[text() =\"Первоначальный взнос\"]/../input")
    private WebElement initialFee;

    @FindBy(xpath = "//div/label[text() =\"Срок кредита\"]/../input")
    private WebElement creditTerm;
}
