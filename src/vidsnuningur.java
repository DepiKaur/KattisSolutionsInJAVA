import java.util.*;

public class vidsnuningur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i=0; i < s.length(); i++) {
            System.out.print(s.charAt(s.length()-1-i));
        }
    }
}