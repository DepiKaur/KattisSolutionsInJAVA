import java.util.*;

public class fyi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] inputParts = input.split("");

        if (inputParts[0].equals("5") && inputParts[1].equals("5") && inputParts[2].equals("5")) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}