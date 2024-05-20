import java.util.*;

public class fimmtudagstilbod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year <= 2020) {
            System.out.println("1000");
        } else {
            int diff = getCostAccordingToYear(year);
            System.out.println(1000 + (diff * 100));
        }
    }

    private static int getCostAccordingToYear (int year) {
        int diff = 0;
        if (year > 2020) {
            diff = year - 2020;
        }
        return diff;
    }
}