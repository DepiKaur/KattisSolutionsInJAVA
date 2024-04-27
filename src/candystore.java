import java.util.*;

public class candystore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();

        List<String> namesList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            namesList.add(s);
        }

        List<String> initialsToQueryList = new ArrayList<>(q);
        for (int i = 0; i < q; i++) {
            String s = sc.nextLine();
            initialsToQueryList.add(s);
        }

        for (String initial : initialsToQueryList) {
            int occurrence = timesInitialOccursInNamesList(initial, namesList);
            if (occurrence == 0) {
                System.out.println("nobody");
            } else if (occurrence > 1) {
                System.out.println("ambiguous");
            } else if (occurrence == 1) {
                System.out.println(convertInitialsToName(initial, namesList));
            }
        }
    }

    private static String convertNameToInitials(String name) {
        String[] partsArray = name.split("\\s+");
        char firstInitial = partsArray[0].charAt(0);
        char secondInitial = partsArray[1].charAt(0);
        return firstInitial + String.valueOf(secondInitial);
    }

    private static String convertInitialsToName(String initials, List<String> namesList) {
        String result = null;
        for (String name : namesList) {
            if (initials.equals(convertNameToInitials(name))) {
                result = name;
            }
        }
        return result;
    }

    private static int timesInitialOccursInNamesList(String initial, List<String> namesList) {
        int counter = 0;
        for (String name : namesList) {
            String nameToInitial = convertNameToInitials(name);
            if (initial.equals(nameToInitial)) {
                counter++;
            }
        }
        return counter;
    }
}