public class L6 {


    public static void main(String[] args) {
        int value1 = 4;
        double value2 = 1.2;
        int powerscore1;
        double powerscore2, squareroot1;

        //powerscore1 = Mathpow(value1, value2); //throw an error
        powerscore2 = Math.pow(value1, value2); //returns 5.278031643091577

        squareroot1 = Math.sqrt(value2); //return 1.0954451150103321

        System.out.println(powerscore2);
        System.out.println(squareroot1);

        int num1 = 20;
        int num2 = 17;
        int num3 = 10;

        //solution 1
        int max = Math.max(num1, num2);
        max = Math.max(max, num3);

        int min = Math.min(num1, num2);
        min = Math.min(min, num3);

        //solution 2
        int max2 = Math.max(Math.max(num1, num2), num3);
        int min2 = Math.min(Math.min(num1, num2), num3);

        System.out.println(max2 + " , " + min2);

        int applesInBasket = 0;
        //pick one apple
        applesInBasket++;

        //pick one apple
        applesInBasket++;

        //pick one apple
        applesInBasket++;

        System.out.println("You've picked " + applesInBasket + " apples");
    }
}





