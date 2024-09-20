package searching;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class GoogleHomePage {
    public GoogleHomePage open() {
        Configuration.browser = "chrome";
        Configuration.timeout = 100 * 1000;
        Selenide.open("https://www.google.com/");

        if (Selenide.$("#W0wltc").is(Condition.visible)) {   // solve problem with cookies !!!!
            Selenide.$("#W0wltc").pressEnter();
        }

        return this;
    }

    public GoogleSearchResultPage search(String term) {
        Selenide.$x("//textarea[@id='APjFqb']") // #APjFqb - unique ID of search text input field
                .setValue(term)
                .pressEnter();
        return new GoogleSearchResultPage();
    }
}
