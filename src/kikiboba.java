import java.util.*;

public class kikiboba {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] array = word.split("");

        int bCounter = 0, kCounter = 0;
        for (String s : array) {
            if(s.equals("b")) {
                bCounter++;
            } else if (s.equals("k")) {
                kCounter++;
            }
        }

        if (bCounter == 0 && kCounter == 0) {
            System.out.println("none");
        } else if (kCounter > bCounter) {
            System.out.println("kiki");
        } else if (bCounter > kCounter) {
            System.out.println("boba");
        } else {
            System.out.println("boki");
        }
    }
}