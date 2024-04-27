import java.util.Scanner;

public class storafmaeli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 10 == 0) {
            System.out.println("Jebb");
        } else {
            System.out.println("Neibb");
        }
    }
}