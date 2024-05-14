import java.util.*;

public class busskortet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        sc.nextLine();
        int counter = 0;

        if (amount > 0) {
            amount = (int) Math.ceil(amount / 100.0);
            counter += amount/5;
            amount %= 5;

            counter += amount/2;
            amount %= 2;

            counter += amount;
            System.out.println(counter);
        }
    }
}