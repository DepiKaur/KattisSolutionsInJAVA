import java.util.*;

public class blandadbest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<String> typesOfMeatList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String meatType = sc.nextLine();
            typesOfMeatList.add(meatType);
        }

        if (typesOfMeatList.contains("nautakjot")) {
            if (!typesOfMeatList.contains("kjuklingur")) {
                System.out.println("nautakjot");
            } else {
                System.out.println("blandad best");
            }
        } else {
            System.out.println("kjuklingur");
        }
    }
}