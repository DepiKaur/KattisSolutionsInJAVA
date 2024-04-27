import java.util.*;

public class takkfyrirmig {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<String> namesList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String name = sc.next();
            namesList.add(name);
        }

        for (String name : namesList) {
            System.out.println("Takk " + name);
        }
    }
}