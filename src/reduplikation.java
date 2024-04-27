import java.util.Scanner;

public class reduplikation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();
        for (int i=0; i < b; i++) {
            System.out.print(a);
        }
    }
}