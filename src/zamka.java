import java.util.*;

public class zamka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lowerLimit = sc.nextInt();
        int upperLimit = sc.nextInt();
        int num = sc.nextInt();

        List<Integer> numbersList = new ArrayList<>();

        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (num == getSumOfDigits(i)) {
                numbersList.add(i);
            }
        }

        Collections.sort(numbersList);

        System.out.println(numbersList.get(0));
        System.out.println(numbersList.get(numbersList.size() - 1));
    }

    private static int getSumOfDigits(int num) {
        int sum = 0;
        int remainder = 0;

        while (num > 0) {
            remainder = num % 10;
            num = num / 10;
            sum += remainder;
        }

        return sum;
    }
}