import java.util.*;

public class ofugsnuid {
    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        List<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            numbersList.add(sc.nextInt());
        }

        Collections.reverse(numbersList);
        for (Integer i : numbersList) {
            System.out.println(i);
        }
    }
}
