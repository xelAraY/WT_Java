package by.bsuir.Deschenya.fundamentals.Task_8;

import java.util.ArrayList;
import java.util.List;

public class Program9 {
    public static void main(String[] args) throws Exception {
        int[] array1 = { 0, 2, 8, 9, 13 };
        int[] array2 = { 0, 1, 3, 8, 11, 15, 16, 17 };
        StringBuilder builder = new StringBuilder();
        for (Integer item : mergeArrays(array1, array2)) {
            builder.append(item).append(" ");
        }
        System.out.print(builder.toString());
    }

    public static List<Integer> mergeArrays(int[] array1, int[] array2) {
        List<Integer> result = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        do {
            if (array1[i] <= array2[j]) {
                result.add(array1[i]);
                i++;
            } else {
                result.add(array2[j]);
                j++;
                res.add(result.size() - j);
            }
        } while (!(i == array1.length || j == array2.length));

        if (i == array1.length) {
            int index = j;
            result = addLastElements(result, array2, j);
            for (int k = 0; k <= index; k++) {
                res.add(array1.length);
            }
        }
        if (j == array2.length) {
            result = addLastElements(result, array1, i);
        }
        return res;
    }

    private static List<Integer> addLastElements(List<Integer> list, int[] array, int index) {
        while (index < array.length) {
            list.add(array[index]);
            index++;
        }
        return list;
    }

}
