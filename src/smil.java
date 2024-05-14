import java.util.*;

public class smil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        List<Integer> asciiValuesList = new ArrayList<>(input.length());

        for (int i = 0; i < input.length(); i++) {
            int asciiValue = input.charAt(i);
            asciiValuesList.add(asciiValue);
        }

        List<Integer> desiredIndexList = new ArrayList<>();

        // checking for :) or ;)
        for (int i = 0; i < asciiValuesList.size() - 1; i++) {
            if (asciiValuesList.get(i) == 58 || asciiValuesList.get(i) == 59) {
                if (checkFirstSmileSequence(asciiValuesList, i)) {
                    desiredIndexList.add(i);
                }
            }
        }

        // checking for :-) or ;-)
        for (int i = 0; i < asciiValuesList.size() - 2; i++) {
            if (asciiValuesList.get(i) == 58 || asciiValuesList.get(i) == 59) {
                if (checkSecondSmileSequence(asciiValuesList, i)) {
                    desiredIndexList.add(i);
                }
            }
        }

        Collections.sort(desiredIndexList);
        for (Integer i : desiredIndexList) {
            System.out.println(i);
        }

    }

    private static boolean checkFirstSmileSequence(List<Integer> asciiValuesList, int index) {
            if (asciiValuesList.get(index + 1) == 41) {
                return true;
            }
        return false;
    }

    private static boolean checkSecondSmileSequence(List<Integer> asciiValuesList, int index) {
            if (asciiValuesList.get(index + 1) == 45 && asciiValuesList.get(index + 2) == 41) {
                return true;
            }
        return false;
    }
}
