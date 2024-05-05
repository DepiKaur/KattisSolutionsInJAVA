import java.util.*;

public class cold {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        String numbersString = sc.nextLine();

        String[] numbersArray = numbersString.split("\\s+");
        int counter = 0;
        for (String s : numbersArray) {
            int num = Integer.parseInt(s);
            if (num < 0) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}