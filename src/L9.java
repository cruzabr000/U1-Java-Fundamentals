import javax.swing.JOptionPane;


public class L9{

public static void main(String[] args) {
    String firstName;
    String lastName;

    firstName = JOptionPane.showInputDialog("What is your name?");
    lastName = JOptionPane.showInputDialog("what is your last name?");

    JOptionPane.showMessageDialog(null, "Hello " + firstName +" " + lastName + "!!");

    //all inputs is considered String data
    //pro tip: separate like data-type variables with a coma
    int mph, minutes;
    double distance, hours;
    String inputString;

            mph = Integer.parseInt(JOptionPane.showInputDialog("what was your speed?"));
            minutes = Integer.parseInt(JOptionPane.showInputDialog("How long IN MINUTS, did you travel?"));

    hours = minutes/60.0;

    distance = hours * mph;

    JOptionPane.showMessageDialog(null,"You traveled " + distance + "miles");













    System.exit(0);














}










}
