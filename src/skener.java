import java.util.*;

public class skener {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfRows = sc.nextInt();
        int numOfCols = sc.nextInt();

        int Vertical = sc.nextInt();
        int Horizontal = sc.nextInt();

        String[][] input = new String[numOfRows][numOfCols];

        for (int r = 0; r < numOfRows; r++) {
            String row = sc.next();

            for (int c = 0; c < numOfCols; c++)
                input[r][c] = row.substring(c, c + 1);
        }

        for (int i = 0; i < input.length; i++) {
            for (int y = 0; y < Vertical; y++) {

                for (int j = 0; j < input[0].length; j++) {
                    for (int x = 0; x < Horizontal; x++) {
                        System.out.print(input[i][j]);
                    }
                }
                System.out.println();

            }
        }
    }
}