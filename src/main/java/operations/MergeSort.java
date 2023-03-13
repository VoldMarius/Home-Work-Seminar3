package operations;

import java.util.Arrays;

public class MergeSort  {

    public static int[] sort(int[] array) {
        if (array.length < 2) {
            return array;
        } else {
            int[] left = sort(Arrays.copyOfRange(array,0, array.length/2));
            int[] right = sort(Arrays.copyOfRange(array,array.length / 2, array.length));
            return merge(left ,right);
        }
    }

    private static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        if (i == left.length) {
            while (j < right.length) {
                result[k] = right[j];
                j++;k++;
            }
        }
        if (j == right.length) {
            while (i < left.length) {
                result[k] = left[i];
                i++;k++;
            }
        }
        return result;
    }
}

