import java.util.*;

public class bestagjofin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<String> guestsList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            guestsList.add(s);
        }

        Map<Integer, String> giftInfoMap = new HashMap<>(n);
        List<Integer> funValueOfGiftList = new ArrayList<>(n);
        for (String s : guestsList) {
            String[] parts = s.split("\\s+");
            funValueOfGiftList.add(Integer.parseInt(parts[1]));
            giftInfoMap.put(Integer.parseInt(parts[1]), parts[0]);
        }

        Collections.sort(funValueOfGiftList);
        int giftWithHighestFunValue = funValueOfGiftList.get(funValueOfGiftList.size() - 1);

        for (Map.Entry<Integer, String> entry : giftInfoMap.entrySet()) {
            if (entry.getKey() == giftWithHighestFunValue) {
                System.out.println(entry.getValue());
            }
        }
    }
}