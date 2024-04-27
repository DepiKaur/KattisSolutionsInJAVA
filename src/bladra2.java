import java.util.*;

public class bladra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int a = sc.nextInt();
        int t = sc.nextInt();

        double firstValue = (v * t);
        double secondValue = 0.5 * (a * (t * t));
        double result = firstValue + secondValue;
        System.out.println(result);
    }
}