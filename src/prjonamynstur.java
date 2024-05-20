import java.util.*;

public class prjonamynstur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        sc.nextLine();

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            String s = sc.nextLine();
            sum += calculateYarn(s);
        }

        System.out.println(sum);
    }

    private static int calculateYarn(String s) {
        String[] parts = s.split("");
        int result = 0;

        for (String part: parts) {
            switch(part) {
                case "." -> result += 20;
                case "O" -> result += 10;
                case "\\", "/" -> result += 25;
                case "A" -> result += 35;
                case "^" -> result += 5;
                case "v" -> result += 22;
            }
        }

        return result;
    }
}