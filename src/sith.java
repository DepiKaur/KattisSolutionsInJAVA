import java.util.*;

public class sith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        int num1 = sc.nextInt();
        sc.nextLine();
        int num2 = sc.nextInt();
        sc.nextLine();
        int num3 = sc.nextInt();
        sc.nextLine();

        if (num1 < num2) {
            if (num1 - num2 == num3) {
                System.out.println("JEDI");
            } else if (num2 - num1 == num3) {
                System.out.println("SITH");
            }
        }else {
            System.out.println("VEIT EKKI");
        }
    }
}
