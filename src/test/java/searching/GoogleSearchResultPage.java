package searching;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.text;

public class GoogleSearchResultPage {
    public void verifySearchResultAtList(int expectedResultAmount) {
        Selenide.$$("h3")
                .shouldHave(CollectionCondition.sizeGreaterThanOrEqual(expectedResultAmount));
    }

    public void verifySearchResultLinkNumberContain(int linkNumber, String term) {
        Selenide.$$("h3").get(linkNumber - 1).shouldHave(text(term));
    }
}
