import java.util.*;

public class fjoldibokstafa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String modifiedInput = input.replaceAll("[^a-zA-Z0-9]+","");

        System.out.println(modifiedInput.length());
    }
}