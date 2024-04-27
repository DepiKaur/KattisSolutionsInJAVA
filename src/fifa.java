import java.util.*;


public class fifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumOfImprovements = sc.nextInt();
        int numOfImprovementsPerYear = sc.nextInt();

        int numOfYears = totalNumOfImprovements / numOfImprovementsPerYear ;
        System.out.println(2022 + numOfYears);
    }
}