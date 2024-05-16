import java.util.*;

public class gcvwr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int t = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        int totalWeightOfItems = 0;
        for (int i = 0; i < n; i++) {
            totalWeightOfItems += sc.nextInt();
        }

        double diff = (g-t) * 0.9;
        int maxAllowedWeight = (int) diff;

        System.out.println(maxAllowedWeight - totalWeightOfItems);
    }
}
