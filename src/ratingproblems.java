import java.util.*;

public class ratingproblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumOfRatings = sc.nextInt();
        int availableNumOfRatings = sc.nextInt();

        int total = 0;
        for (int i = 0; i < availableNumOfRatings; i++) {
            int rating = sc.nextInt();
            total += rating;
        }

        double min, max;

        if (totalNumOfRatings > availableNumOfRatings) {
            int diff = totalNumOfRatings - availableNumOfRatings;
            min = (double) (total + ((-3) * diff)) /totalNumOfRatings;
            max = (double) (total + (3 * diff)) /totalNumOfRatings;
        } else {
            min = (double) total/totalNumOfRatings;
            max = (double) total/totalNumOfRatings;
        }

        System.out.println(min + " " + max);
    }
}