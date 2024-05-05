import java.util.*;

public class keysphonewallet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        List<String> itemsList = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            itemsList.add(sc.nextLine());
        }

        if (!itemsList.contains("keys")) {
            System.out.println("keys");
        }

        if (!itemsList.contains("phone")) {
            System.out.println("phone");
        }

        if (!itemsList.contains("wallet")) {
            System.out.println("wallet");
        }

        if (itemsList.contains("phone") && itemsList.contains("keys") && itemsList.contains("wallet")) {
            System.out.println("ready");
        }
    }
}
