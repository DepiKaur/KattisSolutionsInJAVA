import java.util.*;

public class skammstofun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();

        String[] inputParts = input.split("\\s+");
        for (String s : inputParts) {
            if (isUpperCase(s)) {
                System.out.print(s.charAt(0));
            }
        }
    }

    private static boolean isUpperCase(String word) {
        String regEx = "[A-Z]\\w*";
        String firstCharacter = "" + word.charAt(0);
        return firstCharacter.matches(regEx);
    }
}