import java.util.*;

public class triplesevens {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        sc.nextLine();

        int counter = 0;
        for (int i=0; i<3; i++) {
            String rowInput = sc.nextLine();
            String[] numbersArray = rowInput.split("\\s+");
            List<String> numbersList = Arrays.asList(numbersArray);
            if (numbersList.contains("7")) {
                counter++;
            }
        }

        if (counter == 3) {
            System.out.println("777");
        } else {
            System.out.println("0");
        }
    }
}