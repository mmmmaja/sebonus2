package designpat.websearch;

public interface PolicyObject {

    /**
     * @param query the line read from the file
     * @return true if the model should notify the observer about this query
     * returns false if the observer is not interested in this string (the query)
     */
    public boolean ifNotify(String query);
}
