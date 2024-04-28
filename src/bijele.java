import java.util.*;

public class bijele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> givenValues = new ArrayList<>(6);

        for (int i = 0; i < 6; i++) {
            int num = sc.nextInt();
            givenValues.add(num);
        }

        List<Integer> allowedValues = new ArrayList<>(List.of(1,1,2,2,2,8));

        for (int i = 0; i < 6; i++) {
            System.out.print(allowedValues.get(i) - givenValues.get(i) + " ");
        }
    }
}