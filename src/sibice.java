import java.util.*;

public class sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArray = input.split("\\s+");

        int num = Integer.parseInt(inputArray[0]);
        int width = Integer.parseInt(inputArray[1]);
        int height = Integer.parseInt(inputArray[2]);

        int maxLength = (int) Math.sqrt((width * width) + (height * height));

        for (int i = 0; i < num; i++) {
            int givenLength = sc.nextInt();
            sc.nextLine();

            if (givenLength <= maxLength) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
