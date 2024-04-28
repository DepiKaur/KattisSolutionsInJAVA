import java.util.*;

public class oddecho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        List<String> allWordsList = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            String s = sc.nextLine();
            allWordsList.add(s);
        }

        for (int i = 0; i < allWordsList.size(); i = i +2) {
            System.out.println(allWordsList.get(i));
        }
    }
}