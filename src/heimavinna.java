import java.util.Scanner;

public class heimavinna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int total = 0;
        if (s.contains(";")) {
            String[] parts = s.split(";");
            total = calculateNumOfProblemsInArray(parts);
        } else if (s.contains("-")){
            total = calculateNumOfProblems(s);
        } else {
            total++;
        }
        System.out.println(total);
    }

    private static int calculateNumOfProblems(String stringWithHypen) {
        String[] parts = stringWithHypen.split("-");
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[1]);

        return (num2-num1) + 1;
    }

    private static int calculateNumOfProblemsInArray(String[] array) {
        int counter = 0;

        for (String s : array) {
            if (s.contains("-")) {
                counter += calculateNumOfProblems(s);
            } else {
                counter++;
            }
        }
        return counter;
    }
}