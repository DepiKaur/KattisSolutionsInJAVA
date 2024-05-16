import java.util.*;

public class knotknowledge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numOfKnots = sc.nextInt();
        sc.nextLine();

        List<Integer> knotsList = new ArrayList<>();

        for (int i = 0; i < numOfKnots; i++) {
            int x = sc.nextInt();
            knotsList.add(x);
        }

        List<Integer> secondList = new ArrayList<>();

        for (int i = 0; i < numOfKnots - 1; i++) {
            int x = sc.nextInt();
            secondList.add(x);
        }

        for (Integer knot: knotsList) {
            if (!secondList.contains(knot)) {
                System.out.println(knot);
            }
        }
    }
}
