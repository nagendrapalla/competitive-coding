package Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int rotations = 4;
        rotateArr(arr, rotations, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    static void rotateArr(int arr[], int d, int n) {
        int[] res = new int[n];
        System.arraycopy(arr, 0, res, 0, n);
        for (int i = 0; i < n; i++) {
            if (i < d) {
                arr[n - d + i] = res[i];
            } else {
                arr[i - d] = res[i];
            }
        }
    }

}
