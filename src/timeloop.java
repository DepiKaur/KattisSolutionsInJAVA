import java.util.Scanner;
public class timeloop {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= input; i++){
            System.out.println(i + " Abracadabra");
        }
    }
}