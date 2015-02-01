package URLGeneratorExample;

public class BrownURLGenerator implements URLGenerator {
    public String urlForRequest(int id) {
        System.out.println("...this is the point where Brown's service might be called.");
        return "http://www.brown-inc.com/requests/" + Integer.toString(id);
    }
}
