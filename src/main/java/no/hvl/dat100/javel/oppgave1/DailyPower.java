package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {

        for(double price : prices) {
            System.out.print(price + " kr ");
        }

        System.out.println();

    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        for(double usages : usage) {
            System.out.print(usages + " kWh ");
        }

        System.out.println();

    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;

        for(double usages : usage){
            sum += usages;
        }

        System.out.println("Total strømbruk for dagen er: " + sum + " kWh");

        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;
        double tempPrice = 0;

        for(int i = 0; i < usage.length; i++) {
            tempPrice += prices[i];
        }

        if(usage.length > 0) {
            price = tempPrice / usage.length;
        } else {
            return 0.0;
        }

        return price;
    }

    // e) compute power support for a given usage and price
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

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;
        double tempSupport;

        for(int i = 0; i < usage.length; i++){
            tempSupport = getSupport(usage[i], prices[i]);
            support += tempSupport;
        }

        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;
        double nyPrice = 0;

        for(int i = 0; i < usage.length; i++) {
            nyPrice = (usage[i]) * (NORGESPRIS_KWH);
            price += nyPrice;
        }

        System.out.println(price + " kr");

        return price;
    }

    // g) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        for(int i = 1; i < usage.length - 2; i++) {
            if(usage[i] > usage[i - 1] && usage[i] > usage[i + 1]){
                temp_max = usage[i];
            }
        }

        System.out.print(temp_max + " kWh");

        return temp_max;
    }

    public static double findAvgPower(double[] usage) {

        double average = 0;
        double tempAverage = 0;

        for(int i = 0; i < usage.length; i++){
            tempAverage = usage[i];
            average = average + tempAverage;
        }

        average = average/usage.length;

        System.out.println(average + " kWh");

        return average;
    }
}