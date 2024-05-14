import java.util.*;

public class pet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> totalList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int num4 = sc.nextInt();

            totalList.add(num1 + num2 + num3 + num4);
        }

        int maxTotal = Collections.max(totalList);
        int indexOfMaxInList = totalList.indexOf(maxTotal);
        System.out.println((indexOfMaxInList + 1) + " " + maxTotal);
    }
}