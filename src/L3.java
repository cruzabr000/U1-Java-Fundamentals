public class L3 {


 /* literal value is a value written directly into code
 an Expresion is a value written using variables or operators.
  */

    public static void main(String[] args){

        int liteteralValue = 5;
        int literalValue2 = 6;
        int expression = 5 + 6;
        int expression2 = 5+ 6;
        int expression3 = liteteralValue + liteteralValue;

        double literalExample1 = 3.4;
        boolean literalExample2 = true;
        String literalExample3 = "APPLE";

        double expressionExample = 5 + 6;
        boolean expressionExample2 = 5 > 6;
        //bad example
        //A sString expression is called String Concentration. You can combine String using the +.
        String expressionExample3 = "A  fruit eat is an " + literalExample3;

        //Exapmle program
        String message1 = "The store has ";
        String message2 = " apples in stock.";
        int numApples = 20;

        System.out.println("The store has 20 apples in stock.");
        System.out.println("The store has " + numApples + " apples in stock");
        System.out.println(message1 + numApples + message2);

    }
    //add the main method header below.
}


