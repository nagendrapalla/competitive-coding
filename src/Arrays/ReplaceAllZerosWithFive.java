package Arrays;

public class ReplaceAllZerosWithFive {

    public static void main(String[] args) {
        int input = 1004;
        int output = convertFive(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    static int recConvertFive(int num) {
        if (num == 0) return 0;
        int lastDigit = num % 10;
        lastDigit = lastDigit == 0 ? 5 : lastDigit;
        return recConvertFive(num / 10) * 10 + lastDigit;
    }

    static int convertFive(int num) {
        if (num == 0) {
            return 5;
        } else {
            return recConvertFive(num);
        }
    }

}
