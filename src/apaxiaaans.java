import java.util.*;

public class apaxiaaans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String desiredString = input.charAt(0) + "";

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i-1) != input.charAt(i)) {
                desiredString += input.charAt(i);
            }
        }

        System.out.println(desiredString);
    }
}