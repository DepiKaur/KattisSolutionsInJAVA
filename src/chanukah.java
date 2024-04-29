import java.util.*;

public class chanukah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<Integer, Integer> inputMap = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] parts = s.split("\\s+");
            int firstNum = Integer.parseInt(parts[0]);
            int secondNum = Integer.parseInt(parts[1]);
            inputMap.put(firstNum, secondNum);
        }

        for (Map.Entry<Integer, Integer> entry : inputMap.entrySet()) {
            int value = entry.getValue();
            int result = ((value*value) + (3*value))/2;
            System.out.println(entry.getKey() + " " + result);
        }
    }
}