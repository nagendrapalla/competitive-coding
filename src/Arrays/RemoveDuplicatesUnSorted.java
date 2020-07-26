package Arrays;

import java.util.*;

public class RemoveDuplicatesUnSorted {

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 7, 5};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }

    static int[] removeDuplicates(int[] arr) {
        int prod = arr[0];
        int res_ind = 1;
        for (int i = 1; i < arr.length; i++) {
            if (prod % arr[i] != 0) {
                arr[res_ind++] = arr[i];
                prod = arr[i];
            }
        }
        return Arrays.copyOf(arr, res_ind);
    }

}
