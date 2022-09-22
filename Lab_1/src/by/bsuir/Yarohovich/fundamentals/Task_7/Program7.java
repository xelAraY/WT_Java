package by.bsuir.Deschenya.fundamentals.Task_7;

import by.bsuir.Deschenya.fundamentals.Task_4.Program4;

public class Program7 {
    public static void main(String[] args) throws Exception {
        int n = Program4.inputData();
        int[] array = Program4.generateArray(n, 10);
        Program4.outputArray(array); 
        int[] resultArray = shellSort(array);       
        Program4.outputArray(resultArray);
    }

    private static int[] shellSort(int[] array) {
        int length = array.length;        
        int i = 0;

        while (i < length - 1) {
            if (array[i] <= array[i + 1]) {
                i++;
            }
            else if (array[i] > array[i + 1]) {
                int temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
                i = (i == 0) ? 0 : i - 1;                
            }
        }

        return array;
    }
}
