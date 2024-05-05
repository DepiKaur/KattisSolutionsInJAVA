import java.util.*;

public class twosum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputParts = input.split("\\s+");

        int sum = 0;
        for (String s : inputParts) {
            int num = Integer.parseInt(s);
            sum = sum + num;
        }

        System.out.println(sum);
    }
}
