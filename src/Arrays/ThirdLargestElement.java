package Arrays;

public class ThirdLargestElement {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 3};
        int len = arr.length;
        System.out.println("Third Highest Number: " + thirdLargest(arr, len));
    }

    static int thirdLargest(int a[], int n) {
        if (n < 3) {
            return -1;
        }

        int first = 0, second = 0, third = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > first) {
                third = second;
                second = first;
                first = a[i];
            } else if (a[i] > second) {
                third = second;
                second = a[i];
            } else if (a[i] > third) {
                third = a[i];
            }
        }
        return third;
    }

}