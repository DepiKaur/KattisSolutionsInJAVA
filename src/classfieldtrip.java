import java.util.Arrays;
import java.util.Scanner;

public class classfieldtrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        String input = input1 + input2;
        String[] parts = input.split("");

        Arrays.stream(parts)
                .sorted()
                .forEach(System.out::print);
    }
}