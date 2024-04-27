import java.util.Scanner;

public class twostones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input % 2 == 0){
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}