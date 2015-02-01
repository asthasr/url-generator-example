package URLGeneratorExample;

import java.util.Random;

public class URLGeneratorExample {
    public static void main(String... args) {
        /*
         * We will assume that we have four integration partners. They are defined in an enum, "Partner." We will also
         * assume that we have the same id for a request for each of the partners: 1138.
         */
        int requestId = new Random().nextInt(100000);

        // Each of the partners will have a different method of generating a URL. Let's grab a generator for ACME...
        URLGenerator generator = URLGenerator.forPartner(Partner.ACME);

        // We can then print out the url that Acme expects.
        System.out.println("Acme: " + generator.urlForRequest(requestId) + "\n\n");

        // Great! What about Brown?
        generator = URLGenerator.forPartner(Partner.BROWN);
        System.out.println("Brown: " + generator.urlForRequest(requestId) + "\n\n");

        // Collins and Dellinger?
        generator = URLGenerator.forPartner(Partner.COLLINS);
        System.out.println("Collins: " + generator.urlForRequest(requestId) + "\n\n");

        generator = URLGenerator.forPartner(Partner.DELLINGER);
        System.out.println("Dellinger: " + generator.urlForRequest(requestId) + "\n\n");
    }

}
