import java.util.*;

public class upprodun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        int M = sc.nextInt();
        sc.nextLine();

        int a = M/N;
        int b = M%N;

        for (int i = 0; i < b; i++) {
            printStarsInRow(a+1);
            System.out.println();
        }

        for (int i = 0; i < (N-b); i++) {
            printStarsInRow(a);
            System.out.println();
        }
    }

    private static void printStarsInRow(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
