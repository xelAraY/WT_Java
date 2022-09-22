package by.bsuir.Deschenya.fundamentals.Task_2;

import by.bsuir.Deschenya.fundamentals.Task_1.Variable;
import by.bsuir.Deschenya.fundamentals.Task_1.Program1;

public class Program2 {
    public static void main(String[] args) throws Exception {   

        Variable var = Program1.inputData(); 
        boolean result = isInArea(var.getX(), var.getY());
        outputResult(result);       
    }

    private static boolean isInArea(float x, float y) {
        final int maxY = 5;
        final int minY = -3;
        final int minX1 = -4;
        final int minX2 = -6;
        final int maxX1 = 4;
        final int maxX2 = 6;

        if (y <= maxY && y >= 0 && x <= maxX1 && x >= minX1) {
            return true;
        }       
        else if (y >= minY && y < 0 && x <= maxX2 && x >= minX2) {
            return true;
        }
        else {
            return false;
        }
    }

    private static void outputResult(boolean result) {
        System.out.println(result == false ? result + ":(" : result + ":)");
    }
}
