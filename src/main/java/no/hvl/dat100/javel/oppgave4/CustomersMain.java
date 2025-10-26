package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers kunder = new Customers(4);

        System.out.println(kunder.countNonNull());

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println(kunder.getCustomer(3));

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println(kunder.addCustomer(null));

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println(kunder.removeCustomer(3));

        System.out.println("--------------------------------------------------------------------------------------------");



    }
}
