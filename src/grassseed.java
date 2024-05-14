import java.util.*;

public class grassseed {
    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.UK);

        double costPerSqMt = sc.nextDouble();
        int numOfLawns = sc.nextInt();

        double totalCost = 0.0;
        for (int i = 0; i < numOfLawns; i++) {
            double width = sc.nextDouble();
            double height = sc.nextDouble();
            double cost = (width * height) * costPerSqMt;
            totalCost += cost;
        }

        System.out.println(totalCost);
    }
}