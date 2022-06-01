import java.util.Scanner;
public class calculator
{
    public static void main(String[] args) {
        boolean equationComplete = false;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number:");
        double numberA = number.nextDouble();
        while(!equationComplete) {
            System.out.println("What would you like to do with that number? (add, subtract, multiply, or divide)");
            Scanner operator = new Scanner(System.in);
            String operation = operator.nextLine();
            System.out.println("What number would you like to " + operation + " " + numberA + " with/to?");
            Scanner second = new Scanner(System.in);
            double numberB = second.nextDouble();
            double combination;
            if (operation.equalsIgnoreCase("add")) {
                combination = numberA + numberB;
                System.out.println(numberA + " + " + numberB + " = " + combination);
                equationComplete = true;
            } else if (operation.equalsIgnoreCase("subtract")) {
                combination = numberA - numberB;
                System.out.println(numberA + " - " + numberB + " = " + combination);
                equationComplete = true;
            } else if (operation.equalsIgnoreCase("multiply")) {
                combination = numberA * numberB;
                System.out.println(numberA + " X " + numberB + " = " + combination);
                equationComplete = true;
            } else if (operation.equalsIgnoreCase("divide")) {
                combination = numberA / numberB;
                System.out.println(numberA + " / " + numberB + " = " + combination);
                equationComplete = true;
            } else {
                System.out.println("invalid operation. Please enter a valid operation.");
            }
        }


    }





}
