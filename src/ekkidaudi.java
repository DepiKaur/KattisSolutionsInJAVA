import java.util.*;

public class ekkidaudi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String[] parts1 = s1.split("\\|");
        String[] parts2 = s2.split("\\|");

        System.out.println(parts1[0] + parts2[0] + " " + parts1[1] + parts2[1]);
    }
}