package Arrays;

import java.util.ArrayList;

public class MaxAndSecondMax {

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        int s = arr.length;
        System.out.println(largestAndSecondLargest(s, arr).toString());
    }

    static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {
        int max = -1, max2 = -1;

        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] > max) {
                max2 = (max2 == max) ? -1 : max;
                max = arr[i];
            } else if ((arr[i] < max) && (arr[i] > max2)) {
                max2 = arr[i];
            }
        }

        ArrayList<Integer> v = new ArrayList();
        v.add(max);
        v.add(max2);

        return v;
    }

}