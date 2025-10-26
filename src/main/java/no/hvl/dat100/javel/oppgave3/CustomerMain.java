package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer[] list = new Customer[5];
        list[0] = new Customer("Ola Nordmann", "OlaNordmann@gmail.com", 1, PowerAgreementType.SPOTPRICE);
        list[1] = new Customer("Jon Doe", "JonDoe@Online.no", 2, PowerAgreementType.NORGESPRICE);
        list[2] = new Customer("Jane Doe", "JaneDoe@Outlook.com", 3, PowerAgreementType.POWERSUPPORT);
        list[3] = new Customer("Kari Nordmann", "KariNordmann@Yahoo.com", 4, PowerAgreementType.SPOTPRICE);
        list[4] = new Customer("Jon Smith", "JonSmith@iCloud.com", 5, PowerAgreementType.NORGESPRICE);

        Customer.visListe(list);

    }
}
