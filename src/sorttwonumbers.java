import java.util.Scanner;

public class sorttwonumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        if (a < b){
            System.out.println(a + " " + b);
        } else {
            System.out.println(b + " " + a);
        }
    }
}