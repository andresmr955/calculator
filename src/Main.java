import java.util.Scanner;
/**
 * Clase Calculator: Simula una calculadora básica en Java.
 * Permite realizar operaciones de suma, resta, multiplicación y división.

 **/
 public class Main {
    private Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("Welcome to Andre's Calculator");
        /**We create 3 input fields to get the inputs from the customer.**/
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choice an operator: + , / , * , - ");
        String operator = scanner.next();

        /**We create the variable where we are going to put the variable**/
        double result;

        switch (operator) {
            case "+":
                result = add(num1,num2);
                break;
            case "-":
                result = substract(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                result = divide(num1, num2);
                break;
            default:

                /**We use this line that is a Java Class, we use it to throw an exception  **/
                throw new IllegalArgumentException("Operador no valido");

        }
        System.out.println("The result is:  " + result);
    }

    public double add(double a, double b){
        return a+ b;
    }
    public double substract(double a, double b){
        return a - b;
    }
    public double multiply(double a, double b){
        return a * b;
    }
    public double divide(double a, double b){
    if (b != 0){
        return a / b;
        } else {
        throw new ArithmeticException("Division por cero.");
    }
    }
    public static  void main(String[] args) {
        Main calculator = new Main();
        calculator.start();
    }
 }


