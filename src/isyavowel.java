import java.util.*;

public class isyavowel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] wordParts = word.split("");

        int counterForVowels = 0;
        int counterForY = 0;

        for (String s : wordParts) {
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
                counterForVowels++;
            } else if (s.equals("y")) {
                counterForY++;
            }
        }

        System.out.println(counterForVowels + " " + (counterForVowels + counterForY));
    }
}
