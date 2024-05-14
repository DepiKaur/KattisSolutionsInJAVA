import java.util.Scanner;

public class pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();

        int total = 0;
        for (int i = 0; i < times; i++) {
            String s = sc.nextLine();
            int num = Integer.parseInt(s.substring(0, s.length()-1));
            int power = Integer.parseInt(String.valueOf(s.charAt(s.length()-1)));
            int product = getProduct(num, power);
            total += product;
        }

        System.out.println(total);
    }

    private static int getProduct(int num, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= num;
        }
        return result;
    }
}