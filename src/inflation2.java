import java.util.*;

public class inflation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOFDishes = sc.nextInt();
        sc.nextLine();

        String dishes = sc.nextLine();
        String[] dishesParts = dishes.split("\\s+");
        List<Integer> integerList = new ArrayList<>(numOFDishes);

        for (String s : dishesParts) {
            int num = Integer.parseInt(s);
            integerList.add(num);
        }

        int numOfDays = sc.nextInt();
        sc.nextLine();

        int sum = 0;

        for (int i = 0; i < numOfDays; i++) {
            String input = sc.nextLine();
            String[] splittedInput = input.split("\\s+");
            int secondNum = Integer.parseInt(splittedInput[1]);
            List<Integer> modifiedList = new ArrayList<>();

            if (splittedInput.length == 2 && splittedInput[0].equalsIgnoreCase("inflation")) {
                modifiedList = getListAfterInflation(integerList, secondNum);
            } else if (splittedInput.length == 3 && splittedInput[0].equalsIgnoreCase("set"))  {

                int thirdNum = Integer.parseInt(splittedInput[2]);
                modifiedList = getListAfterSet(integerList, secondNum, thirdNum);
            }
            sum = getSumOfIntegersInList(modifiedList);
            System.out.println(sum);
            integerList = modifiedList;
        }
    }

    private static List<Integer> getListAfterInflation(List<Integer> inputList, int secondNum) {
        List<Integer> modifiedList = new ArrayList<>(inputList.size());
        for (Integer integer : inputList) {
            modifiedList.add(integer + secondNum);
        }
        return modifiedList;
    }

    private static List<Integer> getListAfterSet(List<Integer> givenList, int secondNum, int thirdNum) {
        if (givenList.contains(secondNum)) {
            Collections.replaceAll(givenList, secondNum, thirdNum);
        }
        return givenList;
    }

    private static int getSumOfIntegersInList(List<Integer> givenList) {
        int sum = 0;
        for (Integer i : givenList) {
            sum = sum + i;
        }
        return sum;
    }
}