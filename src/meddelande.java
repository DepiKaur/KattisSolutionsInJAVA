import java.util.*;

public class meddelande {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols =sc.nextInt();
        sc.nextLine();

        String secretMessage = "";
        for (int i = 0; i < rows; i++) {
            String input = sc.nextLine();
            secretMessage = secretMessage + input;
        }

        System.out.println(secretMessage.replace(".", "").trim());
    }
}