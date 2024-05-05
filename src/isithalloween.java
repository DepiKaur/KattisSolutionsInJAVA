import java.util.*;

public class isithalloween {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] splittedInput = input.split("\\s+");
        if (splittedInput[0].equalsIgnoreCase("OCT")&& splittedInput[1].equals("31")) {
            System.out.println("yup");
        } else if (splittedInput[0].equalsIgnoreCase("DEC")&& splittedInput[1].equals("25")) {
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }
    }
}
