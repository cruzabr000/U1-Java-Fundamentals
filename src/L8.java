import javax.swing.*;
import java.io.StringReader;
import java.util.Scanner;

public class L8 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
       // String name;
        //int hours;
        //double payRate;
       // double grossPay;

        //Create a Scanner object to read input
       // Scanner read = new Scanner(System.in);

        //Get the user's name
        //System.out.println("What is your name?");
        //name = read.nextLine();

        //Get the number of hours worked
        //System.out.println("How many hours did you work?");
        //hours = read.nextInt();

       // System.out.println("What is your hourly pay rate?");
        //payRate = read.nextDouble();

        //Calculate the gross pay
       // grossPay = hours * payRate;

        //System.out.println("Hello " + name);
       // System.out.println("Your gross pay is $" + grossPay);

        //bugaboo 31
        //int age;
        //String name;

        //System.out.println("What is your age?");
        //age = read.nextInt();

        //System.out.println("what is your name?");
        //name = read.next();

        //System.out.println("what is your graduation year?");
        //int year = read.nextInt();

        //System.out.println("Hello " + name + ", you are " + " years old!");

        //read.nextLine();
//bagaboo #2
        String FirstName;
        String lastName;

        System.out.println("What is your full name with age?");
        FirstName = read.next();
        lastName = read.next();
       String  age = read.nextLine();

        System.out.println("Hello " + FirstName + " " + lastName + " you are " + age + " years old ");
    }
}
