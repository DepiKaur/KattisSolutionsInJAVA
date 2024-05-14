import java.util.*;

public class detaileddifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            String s1 = sc.nextLine();
            System.out.println(s1);
            String s2 = sc.nextLine();
            System.out.println(s2);
            createPattern(s1, s2);
            System.out.println("\n");
        }
    }

    private static void createPattern(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                System.out.print(".");
            } else {
                System.out.print("*");
            }
        }
    }
}