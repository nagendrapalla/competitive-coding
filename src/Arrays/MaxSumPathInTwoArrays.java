package Arrays;

public class MaxSumPathInTwoArrays {

    public static void main(String[] args) {
        int[] ar2 = {1, 1, 1, 1, 2, 2, 4, 4, 5, 5, 5, 6, 7, 7, 8, 8, 9};
        int[] ar1 = {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9};

        int res = maxPathSum(ar1, ar2);
        System.out.println("Res: " + res);
    }

    static int maxPathSum(int[] ar1, int[] ar2) {
        int result = 0, sum1 = 0, sum2 = 0;
        int i = 0, j = 0;

        int arLen1 = ar1.length;
        int arLen2 = ar2.length;

        while (i < arLen1 && j < arLen2) {
            if (ar1[i] < ar2[j])
                sum1 += ar1[i++];

            else if (ar1[i] > ar2[j])
                sum2 += ar2[j++];

            else {
                result += Math.max(sum1, sum2);
                sum1 = 0;
                sum2 = 0;
                while (i < arLen1 && j < arLen2 && ar1[i] == ar2[j]) {
                    result += ar2[j++];
                    i++;
                }
            }
        }

        while (i < arLen1)
            sum1 += ar1[i++];

        while (j < arLen2)
            sum2 += ar2[j++];

        result += Math.max(sum1, sum2);
        return result;
    }

}
