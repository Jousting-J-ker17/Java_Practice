/*
 * A program for converting inches to meters tables. 
 */

class InchToMetersTables {
    public static void main(String args[]) {
        double inches, meters; // holds number of inches and conversion to meters
        int counter;

        counter = 0;
        for (inches = 1; inches <= 100; inches++) {
            meters = inches * 39.37; // convert inches to meters
            System.out.println(inches + " inches is " + meters + " meters");

            counter++;
            // every 10th line is blank
            if (counter == 10) {
                System.out.println();
                counter = 0; // restarts the counter
            }
        }

    }
}