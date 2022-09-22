package by.bsuir.Deschenya.fundamentals.Task_4;

import java.util.Random;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) throws Exception {   

        int n = inputData();
        int[] array = generateArray(n, 100);  
        outputArray(array);
        printPrimeNumbers(array);     
    }

    public static int inputData() {

        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Input N: ");
        n = getIntValue(in);        
        
        in.close();
        return n;
    }

    public static int getIntValue(Scanner in) {    

        while (!in.hasNextInt()) {
            System.out.println("That not a number!");
            in.next();
            System.out.println("Try again.");
        } 
        return in.nextInt();       
    }

    public static int[] generateArray(int length, int maxNum) {

        int[] array = new int[length];
        Random rand = new Random();

        for(int i = 0; i < length; i++) {
            array[i] = rand.nextInt(maxNum);
        }    

        return array;
    }

    private static void printPrimeNumbers(int[] array) {   

        boolean isPrime;

        System.out.println("Indexes of prime numbers:");

        for (int i = 0; i < array.length; i++) {
            isPrime = true;

            for (int j = 2; j <= Math.sqrt(array[i]); ++j) {
                if (array[i] % j == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();                
    }

    public static void outputArray(int[] array) {

        System.out.println("Array: ");

        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}