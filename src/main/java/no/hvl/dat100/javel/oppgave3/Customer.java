package no.hvl.dat100.javel.oppgave3;

public class Customer {

    //Objektvariabler
    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;

    //Konstruktør
    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;
    }

    //Get-Metoder
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getCustomer_id() { return customer_id; }
    public PowerAgreementType agreement() { return agreement; }

    //Set-Metider
    public void setName(String nyName) { name = nyName; }
    public void setEmail(String nyEmail) { email = nyEmail; }
    public void setCustomer_id(int nyCustomer_id) { customer_id = nyCustomer_id; }
    public void setagreement(PowerAgreementType nyAgreement) { agreement = nyAgreement; }

    public void vis(){
        System.out.println("Navn: " + name);
        System.out.println("Epost: " + email);
        System.out.println("Kunde ID: " + customer_id);
        System.out.println("Strøm avtale: " + agreement);
    }

    public static void visListe(Customer[] list){

        for(Customer en : list){
            en.vis();
            System.out.println();
        }
    }


}
