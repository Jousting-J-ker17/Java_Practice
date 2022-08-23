/*
 * A program for converting gallons to liters tables. 
 */

class GalToLitTable {
    public static void main(String args[]) {
        double gallons, liters; // holds number of gallons // holds conversion to liters
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // convert gallons to liters
            System.out.println(gallons + " gallons is " + liters + " liters");

            counter++;
            // every 10th line is blank
            if (counter == 10) {
                System.out.println();
                counter = 0; // restarts the counter
            }
        }

    }
}