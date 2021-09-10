public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
    public static void main(String[]args) {
        double gameprice = 60.00;
        double sale = 0.20;
        double gameSale = sale * gameprice;
        double finalgamePrice = gameprice - gameSale;

        System.out.println("your current price is " + finalgamePrice);










    }
}
