import java.util.*;

public class cosmicpathoptimization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();

        int sum = 0;

        for (int i = 0; i < input; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        System.out.println(sum / input);
    }
}
