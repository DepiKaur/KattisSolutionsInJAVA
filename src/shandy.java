import java.util.*;

public class shandy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 < num2) {
            System.out.println(num1 * 2);
        } else {
            System.out.println(num2 * 2);
        }
    }
}