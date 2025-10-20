package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for(double[] rad : usage){

            for(double element : rad){
                System.out.print(element + " kWh  ");
            }

            System.out.println();

        }

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for(double[] rad : prices){

            for(double element : rad){
                System.out.print(element + " kr  ");
            }

            System.out.println();
        }

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for(double[] rad : usage){

            for(double element : rad){
                sum += element;
            }
        }

        System.out.println("Totalt strømforbruk for måneden er " + sum + " kWh  ");

        System.out.println("-------------------------------------------------------------------------------------------");

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double sum = 0;

        for(double[] rad : powerusage){
            for(double element : rad){
                sum += element;
            }
        }

        if(sum > threshold){
            exceeded = true;
            System.out.println("Strømbruk for måneden er over grensen: " + threshold);
        } else {
            System.out.println("Strømbruk for måneden er IKKE over grensen " + threshold);
        }

        System.out.println("-------------------------------------------------------------------------------------------");

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;
        double tempPris = 0;
        double tempTimer = 0;

        for(int r = 0; r < usage.length; r++){

            for(int k = 0; k < usage[r].length; k++){
                tempPris += prices[r][k];
                tempTimer++;
            }
        }

        price = tempPris/tempTimer;

        System.out.println("Spot pris for måneden er " + price + " kr pr kWh  ");

        System.out.println("-------------------------------------------------------------------------------------------");

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;
        double tempSupport = 0;

            for (int r = 0; r < usage.length; r++) {

                for (int k = 0; k < usage[r].length; k++) {
                    tempSupport = getSupport(usage[r][k],prices[r][k]);
                    support += tempSupport;

                }
            }

        System.out.println("total støtte for måneden er: " + support + " kr  ");

        System.out.println("-------------------------------------------------------------------------------------------");

        return support;
    }

    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {

        double support = 0;
        double nyPrice;
        double prisOver;

        if (price > THRESHOLD) {
            prisOver = price - THRESHOLD;
            nyPrice = prisOver * usage;
            support = nyPrice * PERCENTAGE;
        }

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;
        double tempPris = 0;
        double norgesPris = 0.5;

        for(int r = 0; r < usage.length; r++){

            for(int k = 0; k < usage[r].length; k++){
                tempPris = usage[r][k] * norgesPris;
                price += tempPris;
            }
        }

        System.out.println("Prisen av strøm for denne måneden med Norgespris er: " + price + " kr  ");

        System.out.println("-------------------------------------------------------------------------------------------");

        return price;
    }
}


