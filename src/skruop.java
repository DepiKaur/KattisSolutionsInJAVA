import java.util.*;

public class skruop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        List<String> commandsList = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            String command = sc.nextLine();
            commandsList.add(command);
        }

        int level = getLevel(commandsList);
        System.out.println(level);
    }

    private static int getLevel(List<String> commandsList) {
        int level = 7;
        for (String command : commandsList) {
            if (command.equalsIgnoreCase("Skru op!")) {
                if (level < 10 && level >= 0) {
                    level++;
                } else if (level > 10){
                    level = 10;
                }
            }

            if (command.equalsIgnoreCase("Skru ned!")){
                if (level <= 0) {
                    level = 0;
                } else {
                    level--;
                }
            }
        }
        return level;
    }
}