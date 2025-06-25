import java.util.*;
public class Problem1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number (b): ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter the typeofoperation (+, -, *, /): ");
        String typeofoperation = sc.nextLine();
        Calculator calc = new Calculator(a, b, typeofoperation);
        calc.performCalculation();
        sc.close();
    }
}

class Calculator 
{
    private double a;
    private double b;
    private String typeofoperation;

    public Calculator(double a, double b, String typeofoperation) {
        this.a = a;
        this.b = b;
        this.typeofoperation = typeofoperation;
    }
    public void performCalculation() {
        double result = 0;
        switch (typeofoperation) {
            case "+":
            case "addition":
            case "Addition":
                result = addition();
                System.out.printf("Result: %.2f + %.2f = %.2f%n", a, b, result);
                break;
                
            case "-":
            case "subtraction":
            case "Subtraction":
                result = subtraction();
                System.out.printf("Result: %.2f - %.2f = %.2f%n", a, b, result);
                break;
                
            case "*":
            case "multiplication":
            case "Multiplication":
                result = multiplication();
                System.out.printf("Result: %.2f * %.2f = %.2f%n", a, b, result);
                break;
                
            case "/":
            case "division":
            case "Division":
                if (b == 0) {
                    System.out.println("Division by zero is not allowed!");
                } else {
                    result = division();
                    System.out.printf("Result: %.2f / %.2f = %.2f%n", a, b, result);
                }
                break;
                
            default:
                System.out.println("Error: Invalid typeofoperation! Please use +, -, * or /");
        }
    }
    private double addition() {
        return a + b;
    }
    
    private double subtraction() {
        return a - b;
    }
    
    private double multiplication() {
        return a * b;
    }
    
    private double division() {
        return a / b;
    }
}