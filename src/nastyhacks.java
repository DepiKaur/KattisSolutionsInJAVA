import java.util.Scanner;

public class nastyhacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        for (int i = 0; i < times; i++) {
            int withoutAd = sc.nextInt();
            int withAd = sc.nextInt();
            int adExpenses = sc.nextInt();
            int profit = (withAd - adExpenses) - withoutAd;

            if (profit > 0) {
                System.out.println("advertise");
            } else if (profit == 0) {
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }
    }
}