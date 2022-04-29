// SE_ASS2_Group5
// Marian Chen - 6258052
// Maja Gójska - 6274446

package designpat.websearch;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Perform "web search" (from a file), notify the interested observers of each
 * query.
 */
public class WebSearchModel {

    private final File sourceFile;
    private final List<QueryObserver> observers = new ArrayList<>();

    public interface QueryObserver {
        void onQuery(String query);
    }

    public interface PolicyObject {
        /**
         * @param query the line read from the file
         * @return true if the model should notify the observer about this query,
         *          otherwise false if the observer is not interested in this string (the query)
         */
        public boolean ifNotify(String query);
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
        // TODO: Should also accept PolicyObject object
        // Find a solution to store the Policy together with the Observer so that each observer can have its own attached filter. 
        observers.add(queryObserver);
    }

    private void notifyAllObservers(String line) {
        for (QueryObserver observer : observers) {
            observer.onQuery(line);
        }
    }
}
