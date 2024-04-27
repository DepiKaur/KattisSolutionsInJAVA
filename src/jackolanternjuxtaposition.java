import java.util.Scanner;

public class jackolanternjuxtaposition {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int result = N*T*M;
        System.out.println(result);
    }
}