import java.util.*;

public class greetings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String desiredString = s.substring(1, s.length()-1);
        System.out.println("h" + desiredString + desiredString + "y");
    }
}