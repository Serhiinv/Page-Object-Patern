package searching;

import org.testng.annotations.Test;

public class GoogleSearchTest {

    //page object pattern training
    @Test
    public void verifyThatGoogleSearchWorks_PO() {
        GoogleSearchResultPage searchResultPage = new GoogleHomePage().open().search("funny kitten");
        searchResultPage.verifySearchResultAtList(9);
    }

    @Test
    public void verifyThatGoogleSearchWorks_PO_atLeastNLinks() {
        GoogleSearchResultPage searchResultPage = new GoogleHomePage().open().search("funny dogs");
        searchResultPage.verifySearchResultAtList(5);
    }

    @Test
    public void verifyThatGoogleSearchWorks_PO_3sLinkContainTerm() {
        GoogleSearchResultPage searchResultPage = new GoogleHomePage().open().search("funny dogs");
        searchResultPage.verifySearchResultLinkNumberContain(3, "dog");
    }

}