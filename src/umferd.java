import java.util.*;

public class umferd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        List<String> stringsList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            stringsList.add(s);
        }

        int counter = 0;
        for (String s : stringsList) {
            String[] stringParts = s.split("(?!^)");

            for (int i = 0; i < m; i++) {
                if (stringParts[i].equals(".")) {
                    counter++;
                }
            }
        }

        System.out.println((double) counter / (m*n));

    }
}