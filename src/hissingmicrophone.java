import java.util.*;

public class hissingmicrophone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String givenWord = sc.nextLine();

        if (givenWord.contains("ss")) {
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
    }
}