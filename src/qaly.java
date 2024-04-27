import java.util.Scanner;

public class qaly {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float q, y;
        float total = 0;

        for(int i = 0; i < n; i++) {
            q = sc.nextFloat();
            y = sc.nextFloat();
            total += q * y;
        }
        System.out.println(total);

    }
}