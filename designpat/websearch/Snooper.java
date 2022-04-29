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

        // First observer
        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                if(ifNotify(query))
                    System.out.println("Oh yes! " + query);
            }
            @Override
            public boolean ifNotify(String query) {
                if(query.toLowerCase().contains("friend"))
                    return true;
                else
                    return false;
            }
        });

        // Second observer
        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                if(ifNotify(query))
                    System.out.println("So long.... " + query);
            }
            @Override
            public boolean ifNotify(String query) {
                if(query.length() > 60)
                    return true;
                else
                    return false;
            }
        }); 
    }
}
