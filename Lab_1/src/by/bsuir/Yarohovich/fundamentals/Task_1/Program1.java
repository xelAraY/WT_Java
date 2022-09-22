package by.bsuir.Deschenya.fundamentals.Task_1;

import java.util.Scanner;

public class Program1 {    
    public static void main(String[] args) throws Exception {        

        Variable var = inputData();
        double result = calculate(var.getX(), var.getY());
        outputResult(result);                
    }

    public static Variable inputData() {
        Scanner in = new Scanner(System.in);
        float x, y;

        System.out.print("Input X: ");
        x = getFloatValue(in);    

        System.out.print("Input Y: ");
        y = getFloatValue(in);        
        
        in.close();
        return new Variable(x, y);
    }

    public static float getFloatValue(Scanner in) {        
        while (!in.hasNextFloat()) {
            System.out.println("That not a number!");
            in.next();
            System.out.println("Try again.");
        } 
        return in.nextFloat();       
    }

    private static double calculate(float x, float y) {
        double numerator; 
        double denominator; 

        numerator = 1 + Math.sin(x + y);
        denominator = 2 + Math.abs(x - (2 * x / (1 + x * x * y * y)));
        double f = (numerator / denominator) + x;
        return f;
    }

    private static void outputResult(double result) {
        System.out.printf("The result of the function is %.4f", result);        
    }
}
