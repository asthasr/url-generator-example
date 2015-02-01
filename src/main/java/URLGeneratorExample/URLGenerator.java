package URLGeneratorExample;

public interface URLGenerator {
    String urlForRequest(int id);

    static <G extends URLGenerator> G forPartner(Partner p) {
        switch(p) {
            case ACME:
                return (G)new AcmeURLGenerator();
            case BROWN:
                return (G)new BrownURLGenerator();
            default:
                return (G)new DefaultURLGenerator(p);
        }
    }
}
