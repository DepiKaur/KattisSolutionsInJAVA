import java.util.Scanner;

public class undeadoralive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.contains(":)") || input.contains(":(")) {
            if (input.contains(":)") && !input.contains(":(")) {
                System.out.println("alive");
            } else if (input.contains((":(")) && !input.contains((":)"))) {
                System.out.println("undead");
            } else {
                System.out.println("double agent");
            }
        } else {
            System.out.println("machine");
        }
    }
}
