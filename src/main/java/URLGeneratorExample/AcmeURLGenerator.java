package URLGeneratorExample;

public class AcmeURLGenerator implements URLGenerator {
    public String urlForRequest(int id) {
        System.out.println("...this is the point where Acme's service might be called.");
        return "http://www.acme.com/landing-page?id=" + Integer.toHexString(id);
    }
}
