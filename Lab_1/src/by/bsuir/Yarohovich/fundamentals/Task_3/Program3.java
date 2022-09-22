package by.bsuir.Deschenya.fundamentals.Task_3;

import java.util.ArrayList;
import java.util.Scanner;
import by.bsuir.Deschenya.fundamentals.Task_1.Program1;

public class Program3 {    
    public static void main(String[] args) throws Exception {        

        Section var = inputData();
        ArrayList<Float> argList = createArgumentList(var.getA(), var.getB(), var.getH());
        ArrayList<Double> valueList = createValueList(argList);
        outputResult(argList, valueList);               
    }

    private static Section inputData() {
        Scanner in = new Scanner(System.in);
        float a, b, h;

        System.out.print("Input A: ");
        a = Program1.getFloatValue(in);        

        System.out.print("Input B: ");
        b = Program1.getFloatValue(in);        

        System.out.print("Input H: ");
        h = Program1.getFloatValue(in);        
        
        in.close();
        return new Section(a, b, h);
    }

    private static ArrayList<Float> createArgumentList(float a, float b, float h) {

        ArrayList<Float> argumentList = new ArrayList<Float>();
        float i = a;
        
        while (i < b) {
            argumentList.add(i);
            i += h;
        }
        argumentList.add(b);

        return argumentList;
    }

    private static ArrayList<Double> createValueList(ArrayList<Float> argumentList) {

        ArrayList<Double> valueList = new ArrayList<Double>();        
        
        for (Float arg : argumentList) {
            valueList.add(Math.tan(arg));
        }

        return valueList;
    }

    private static void outputResult(ArrayList<Float> argumenList, ArrayList<Double> valueList) {
        
        System.out.format("%4s\t  %5s\t", "X", "F");
        System.out.println();

        for(int i = 0; i < argumenList.size(); ++i) {
            System.out.format("%+5.1f\t  %+7.5f\t", argumenList.get(i), valueList.get(i));
            System.out.println();
        }
    }
}
