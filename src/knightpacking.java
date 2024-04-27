import java.util.Scanner;

public class knightpacking {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n%2 == 1) {
            System.out.println("first");
        } else {
            System.out.println("second");
        }
    }
}