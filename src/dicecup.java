import java.util.*;

public class dicecup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        printNumbers(num1, num2);
    }

    private static void printNumbers(int num1, int num2) {

        if (num1 > num2) {
            for (int i = (num2 + 1); i <= (num1 + 1); i++) {
                System.out.println(i);
            }
        } else {
            for (int i = (num1 + 1); i <= (num2 + 1); i++) {
                System.out.println(i);
            }
        }
    }
}