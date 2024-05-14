import java.util.*;

public class lastfactorialdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();

        List<String> factorialsList = new ArrayList<>();

        for (int i = 0; i < times; i++) {
            int num = sc.nextInt();
            sc.nextLine();
            int factorial = calculateFactorial(num);
            factorialsList.add("" + factorial);
        }

        for (String s : factorialsList) {
            System.out.println(s.charAt(s.length()-1));
        }
    }

    private static int calculateFactorial(int num) {
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}