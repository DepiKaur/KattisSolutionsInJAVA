import java.util.*;

public class bela {
    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String dominantSuit = sc.next();
        sc.nextLine();

        int result = 0;

        for (int i = 0; i < (4 * num); i++) {
            String input = sc.nextLine();
            int value = calculateValue(input, dominantSuit);
            result += value;
        }

        System.out.println(result);
    }

    private static int calculateValue(String input, String suit) {
        int value;
        switch (input.charAt(0)) {
            case 'A' -> value = 11;
            case 'K' -> value = 4;
            case 'Q' -> value = 3;
            case 'J' -> value = calculateForJ(input, suit);
            case 'T' -> value = 10;
            case '9' -> value = calculateFor9(input, suit);
            default -> value = 0;
        }
        return value;
    }

    private static int calculateForJ(String input, String suit) {
        if (input.charAt(1) == suit.charAt(0)) {
            return 20;
        }
        return 2;
    }

    private static int calculateFor9(String input, String suit) {
        if (input.charAt(1) == suit.charAt(0)) {
            return 14;
        }
        return 0;
    }
}