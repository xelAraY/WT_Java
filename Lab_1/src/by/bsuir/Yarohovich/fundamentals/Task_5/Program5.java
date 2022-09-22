package by.bsuir.Deschenya.fundamentals.Task_5;

import by.bsuir.Deschenya.fundamentals.Task_4.Program4;

public class Program5 {
    public static void main(String[] args) throws Exception {
        int n = Program4.inputData();
        int[] array = Program4.generateArray(n, 10);
        Program4.outputArray(array);
        int k = getMinK(array);
        printResult(k);
    }

    private static int getMinK(int[] array) {
        int length = array.length;
        int maxLength[] = new int[length];

        for (int i = 0; i < length; ++i) {
            maxLength[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (array[j] < array[i])
                    maxLength[i] = Math.max(maxLength[i], 1 + maxLength[j]);
            }
        }

        int lengthOfIncNum = maxLength[0];
        for (int i = 0; i < length; ++i) {
            lengthOfIncNum = Math.max(lengthOfIncNum, maxLength[i]);
        }

        return length - lengthOfIncNum;
    }

    private static void printResult(int number) {
        System.out.format("Number of elements to delete = %d", number);
    }

}
