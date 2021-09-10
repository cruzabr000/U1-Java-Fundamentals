public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.

    Example: 55 mph for 45 minutes -> 41.25 miles
    */
    public static void main(String[] args) {

    int mph = 55;
    int minuts = 45;
    double realminuts = minuts /60.0;
    double distance = mph * realminuts;

    System.out.println(" the miles it needs to travels is "+ distance);


    }
}
