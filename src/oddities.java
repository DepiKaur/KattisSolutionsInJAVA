import java.util.*;

public class oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> givenNumbersList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            givenNumbersList.add(num);
        }

        for (int num : givenNumbersList) {
            if (num%2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        }
    }
}