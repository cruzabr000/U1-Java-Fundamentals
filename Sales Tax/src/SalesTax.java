public class SalesTax {

    /*
    Create a program which takes a quantity, price and tax percentage and outputs the total cost with tax.
     */

public static void main(String[]args) {
    int quantity = 6;
    double price = 9.99;
    final double TAX = 0.07;
    final double TAXRATE = TAX/100.0;

    //calculations
    double subTotal = price * quantity;
    //discount and increases

    /*
    FORMULA  AMOUNT  * +/- RATE
    COST INCREASE USE +
    COST DECREASE USE -

     */
    double tax = subTotal *  + TAXRATE;
    double totalCost = tax * subTotal;

            System.out.println("You bought " + quantity + "shirt at " + price + " a piece");
    System.out.println("SubTotal: " +subTotal);
    System.out.println("tax " + tax);
    System.out.println("Total: " + totalCost);







}



}
