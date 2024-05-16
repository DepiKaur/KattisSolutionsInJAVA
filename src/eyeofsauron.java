import java.util.*;

public class eyeofsauron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int indexOfOpeningBracket = -1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ('(')) {
                indexOfOpeningBracket = i;
            }
        }

        int lengthOfFirstSubstring = indexOfOpeningBracket;
        int lengthOfSecondSubstring = input.length() - lengthOfFirstSubstring - 2;

        if (lengthOfFirstSubstring == lengthOfSecondSubstring) {
            System.out.println("correct");
        } else {
            System.out.println("fix");
        }
    }
}