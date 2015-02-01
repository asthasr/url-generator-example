package URLGeneratorExample;

public class DefaultURLGenerator implements URLGenerator {
    private Partner partner;

    public DefaultURLGenerator(Partner partner) {
        this.partner = partner;
    }

    public String urlForRequest (int id) {
        System.out.println("We would now check the database for an URL template for " + partner.toString() + ".");
        System.out.println("Let's use an if statement instead...");

        String template = "";

        if (partner.equals(Partner.COLLINS)) {
            template = "https://www.collins-corp.com/emails?custid=%d";
        } else if (partner.equals(Partner.DELLINGER)) {
            template = "http://www.dellinger.com/customer_landing_page.php?email_id=%d";
        }

        return String.format(template, id);
    }
}
