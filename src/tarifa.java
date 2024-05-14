import java.util.*;

public class tarifa {
    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int num = sc.nextInt();

        int remaining = 0;
        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            remaining += (max - x);
        }
        System.out.println(max + remaining);
    }
}