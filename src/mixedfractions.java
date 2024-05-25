import java.util.*;

public class mixedfractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isDone = true;

        while (isDone) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (num1 == 0 && num2 == 0) {
                isDone = false;
            } else {
                printMixedFraction(num1, num2);
            }
        }
    }

    private static void printMixedFraction(int numerator, int denominator) {
        int wholeNum = numerator / denominator;
        numerator = numerator % denominator;
        System.out.println(wholeNum + " " + numerator + " / " + denominator);
    }
}