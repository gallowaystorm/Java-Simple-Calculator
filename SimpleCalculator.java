
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;


public class SimpleCalculator {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        String mathFunction;
        
        //welcome message
        System.out.println("Hello!");
        System.out.println("Welcome to Storm's Simple Calculator");
        System.out.println("Please enter two numbers below:");
        
        //white space
        System.out.println("");
        
        //prompt for numbers
        System.out.print("Number 1: ");
        num1 = input.nextDouble();
        
        //white space
        System.out.println("");
        
        System.out.print("Number 2: ");
        num2 = input.nextDouble();
        
        //white space
        System.out.println("");
        
        System.out.print("What function do you wish to do? (add, subtract, multiply, divide): ");
        mathFunction = input.next();
        
        //white space
        System.out.println("");
        
        if (mathFunction.equals("add")){
            add(num1, num2);
        } else if (mathFunction.equals("subtract")){
            subtract(num1, num2);
        } else if (mathFunction.equals("multiply")){
            multiply(num1, num2);
        } else if (mathFunction.equals("divide")) {
            divide(num1, num2);
        }
    }
    
    public static void add(double num1, double num2){
            double total = num1 + num2;
            System.out.printf("The anwer is: %.2f", total);
        }
    public static void subtract(double num1, double num2){
            double total = num1 - num2;
            System.out.printf("The anwer is: %.2f", total);
        }
    public static void multiply(double num1, double num2){
            double total = num1 * num2;
            System.out.printf("The anwer is: %.2f", total);
        }
    public static void divide(double num1, double num2){
            double total = num1 / num2;
            System.out.printf("The anwer is: %.2f", total);
        }
}
