import java.util.*;

public class nsum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();

        String[] inputParts = input.split("\\s+");
        int sum = 0;
        for (String s : inputParts) {
            int number = Integer.parseInt(s);
            sum = sum + number;
        }

        System.out.println(sum);
    }
}
