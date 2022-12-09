package selfmadeBinarySearch;

import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class Demonstration {
    public static int positionSearch(double[] array, double key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
    }

    public static int useBinSerach(double[] sortedArray, double key) {
        return binarySearch(sortedArray, key, 0, sortedArray.length);
    }

    public static int binarySearch(double[] sortedArray, double key, int first, int last) {
        int middle = (first + last) / 2;
        if (last < first)
            return -1;
        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return binarySearch(sortedArray, key, first, middle - 1);
        } else {
            return binarySearch(sortedArray, key, middle + 1, last);
        }
    }

    public static double[] generateArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (0 + Math.random() * 10);
        }
        return array;
    }

    public static void main(String[] args) {
        double[] array = generateArray(6);
        Arrays.sort(array);
        for (double c : array) {
            System.out.println(c);
        }
        System.out.println(positionSearch(array, 5));
        System.out.println(useBinSerach(array, 7));
    }
}
