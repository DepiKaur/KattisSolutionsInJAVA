import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cutthenegativity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = rows;

        int[][] twoDimensionalArray = new int[rows][columns];

        // store user-input in the form of 2-D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoDimensionalArray[i][j] = sc.nextInt();
            }

            sc.nextLine();
        }

        List<List<Integer>> list = getLists(rows, columns, twoDimensionalArray);

        System.out.println(list.size());
        for (List<Integer> numberList : list) {
            System.out.println(numberList.get(0) + " " + numberList.get(1) + " " + numberList.get(2));
        }
    }

    private static List<List<Integer>> getLists(int rows, int columns, int[][] twoDimensionalArray) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (twoDimensionalArray[i][j] != -1) {
                    List<Integer> desiredNumbersList = new ArrayList<>(rows);
                    desiredNumbersList.add(i+1);
                    desiredNumbersList.add(j+1);
                    desiredNumbersList.add(twoDimensionalArray[i][j]);
                    list.add(desiredNumbersList);
                }
            }
        }
        return list;
    }
}