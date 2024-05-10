import java.util.*;

public class hipphipphurra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < age; i++) {
            System.out.println("Hipp hipp hurra, " + name + "!");
        }
    }
}