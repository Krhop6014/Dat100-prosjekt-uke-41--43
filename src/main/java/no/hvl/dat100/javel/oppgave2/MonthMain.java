package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

import static no.hvl.dat100.javel.oppgave2.MonthPowerData.powerprices_month;
import static no.hvl.dat100.javel.oppgave2.MonthPowerData.powerusage_month;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = powerprices_month;

        double[][] power_usage_month = powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        MonthlyPower.print_PowerUsage(powerusage_month);

        MonthlyPower.print_PowerPrices(powerprices_month);

        MonthlyPower.computePowerUsage(powerusage_month);

        MonthlyPower.exceedThreshold(powerusage_month,908);

        MonthlyPower.computeSpotPrice(powerusage_month, powerprices_month);

        MonthlyPower.computeNorgesPrice(powerusage_month);

        MonthlyPower.computePowerSupport(powerusage_month, powerprices_month);

        /*
        TODO

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}