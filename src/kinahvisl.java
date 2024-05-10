import java.util.*;

public class kinahvisl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initialWord = sc.nextLine();
        String finalWord = sc.nextLine();

        int counter = 0;
        for (int i = 0; i < initialWord.length(); i++) {
            if (initialWord.charAt(i) != finalWord.charAt(i)) {
                counter++;
            }
        }

        System.out.println(counter + 1);
    }
}