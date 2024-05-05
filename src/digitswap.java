import java.util.*;

public class digitswap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] inputParts = input.split("");
        String firstNum = inputParts[0];
        String secondNum = inputParts[1];
        System.out.println(secondNum + firstNum);
    }
}