import java.util.*;

public class everywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();

        List<String> placesVisitedList = new ArrayList<>();

        for (int i = 0; i < times; i++) {
            int counter = 0;
            int num = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < num; j++) {
                String s = sc.nextLine();
                if (!placesVisitedList.contains(s)) {
                    placesVisitedList.add(s);
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}