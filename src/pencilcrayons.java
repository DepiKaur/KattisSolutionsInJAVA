import java.util.*;

public class pencilcrayons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfBoxes = sc.nextInt();
        int numOfColorsInEachBox = sc.nextInt();
        sc.nextLine();

        int result = 0;
        for (int i = 0; i < numOfBoxes; i++) {
            String input = sc.nextLine();
            String[] allColorsInBox = input.split("\\s+");
            List<String> allColorsList = Arrays.asList(allColorsInBox);
            List<String> distinctColorsList = getDistinctColorsInBox(allColorsList);

            if (allColorsList.size() != distinctColorsList.size()) {
                int difference = allColorsList.size() - distinctColorsList.size();
                result += difference;
            }
        }

        System.out.println(result);
    }

    private static List<String> getDistinctColorsInBox(List<String> allColors) {
        List<String> distinctColorsList = new ArrayList<>();

        for (String color : allColors) {
            if (!distinctColorsList.contains(color)) {
                distinctColorsList.add(color);
            }
        }

        return distinctColorsList;
    }
}