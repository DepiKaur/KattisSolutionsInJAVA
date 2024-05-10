import java.util.*;

public class monopol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfOpponentHouses = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        String[] inputArray = input.split("\\s+");

        List<Integer> integerList = new ArrayList<>(numOfOpponentHouses);

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].equalsIgnoreCase("2") || inputArray[i].equalsIgnoreCase("12")) {
                integerList.add(1);
            }

            if (inputArray[i].equalsIgnoreCase("3") || inputArray[i].equalsIgnoreCase("11")) {
                integerList.add(2);
            }

            if (inputArray[i].equalsIgnoreCase("4") || inputArray[i].equalsIgnoreCase("10")) {
                integerList.add(3);
            }

            if (inputArray[i].equalsIgnoreCase("5") || inputArray[i].equalsIgnoreCase("9")) {
                integerList.add(4);
            }

            if (inputArray[i].equalsIgnoreCase("6") || inputArray[i].equalsIgnoreCase("8")) {
                integerList.add(5);
            }

            if (inputArray[i].equalsIgnoreCase("7")) {
                integerList.add(6);
            }
        }

        int sum = 0;
        for (Integer i : integerList) {
            sum = sum + i;
        }

        System.out.println((double)sum/36);
    }
}
