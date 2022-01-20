package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TripProposalPage {
    private final SelenideElement buttonBuyByDebit = $(byText("Купить"));
    private final SelenideElement buttonBuyCredit = $(byText("Купить в кредит"));
    private final SelenideElement paymentBySelectedWayHeader = $("#root > div > h3");


    public FillingInCardData selectBuyByDebitCard() {
        buttonBuyByDebit.click();
        paymentBySelectedWayHeader.shouldHave(Condition.text("Оплата по карте"));
        return new FillingInCardData();
    }

    public FillingInCardData selectBuyByCreditCard() {
        buttonBuyCredit.click();
        paymentBySelectedWayHeader.shouldHave(Condition.text("Кредит по данным карты"));
        return new FillingInCardData();
    }
}
