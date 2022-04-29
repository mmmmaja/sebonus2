// SE_ASS2_Group5
// Marian Chen - 6258052
// Maja Gójska - 6274446

package designpat.websearch;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ! Observer pattern
 * Perform "web search" (from a file), notify the interested observers of each
 * query.
 */
public class WebSearchModel {

    private final File sourceFile;
    private final List<QueryObserver> observers = new ArrayList<>();


    public interface QueryFilterPolicyObject {
        /**
         * describes the interface for a policy object that will define a query filter
         *
         * @param query the line read from the file
         * @return true if the model should notify the observer about this query
         * returns false if the observer is not interested in this string (the query)
         */
        public boolean ifNotify(String query);

    }

    public interface QueryObserver extends QueryFilterPolicyObject {
        void onQuery(String query);
    }

    public WebSearchModel(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void pretendToSearch() {
        // Source:
        // https://stackoverflow.com/questions/5868369/how-can-i-read-a-large-text-file-line-by-line-using-java
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                notifyAllObservers(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addQueryObserver(QueryObserver queryObserver) {
        observers.add(queryObserver);
    }

    private void notifyAllObservers(String line) {
        for (QueryObserver observer : observers) {
            observer.onQuery(line);
        }
    }
}
