/*
 * A program for converting gallons to liters. 
 */

class GalToLit {
    public static void main(String args[]) {
        double gallons; // holds number of gallons
        double liters; // holds conversion to liters

        gallons = 10; // start with 10 gallons

        liters = gallons * 3.7854; // conversion to liters

        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}