package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {

        this.customers = new Customer[size];

    }

    // b) count number of non-null references
    public int countNonNull() {

        int count = 0;

        for(Customer liste : this.customers){

            if(liste != null){
                count++;
            }

        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        Customer c = null;

        for(Customer liste : this.customers){
            if(liste != null){
                if(liste.getCustomer_id() == customer_id){
                    return liste;
                }
            }
        }

        return c;
    }

    private int antallKunder = 0;

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        if(antallKunder < this.customers.length){
            this.customers[antallKunder] = c;
            antallKunder++;
        }

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        boolean deleted = false;
        Customer c = null;

       for(Customer liste : this.customers){
           if(liste.getCustomer_id() == customer_id){
               antallKunder--;
               return liste;
           }
       }

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] customers = null;

        // TODO

        return customers;
    }
}