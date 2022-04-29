// SE_ASS2_Group5
// Marian Chen - 6258052
// Maja Gójska - 6274446

package designpat.websearch;

/**
 * Watches the search queries
 */
public class Snooper {

    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;

        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                // If statements
                System.out.println("Query: " + query);
            }
        });
    }
}
