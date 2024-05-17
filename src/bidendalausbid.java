import java.util.*;

public class bidendalausbid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        String[] parts1 = input1.split(":");
        int hours1 = Integer.parseInt(parts1[0]);
        int mins1 = Integer.parseInt(parts1[1]);
        int totalMinutes1 = (hours1 * 60) + mins1;

        String[] parts2 = input2.split(":");
        int hours2 = Integer.parseInt(parts2[0]);
        int mins2 = Integer.parseInt(parts2[1]);
        int totalMinutes2 = (hours2 * 60) + mins2;

        if (totalMinutes2 > totalMinutes1) {
            System.out.println(totalMinutes2 - totalMinutes1);
        } else if (totalMinutes1 > totalMinutes2){
            System.out.println(((24 * 60) - totalMinutes1) + totalMinutes2);
        } else {
            System.out.println(0);
        }
    }
}
