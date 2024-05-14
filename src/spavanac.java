import java.util.*;

public class spavanac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        int totalMinutes = (hour * 60) + min;
        int desiredMinutes;
        if (totalMinutes >= 45) {
            desiredMinutes = totalMinutes - 45;
        } else {
            desiredMinutes = (24 * 60)  + totalMinutes - 45;
        }

        System.out.println((desiredMinutes/60) + " " + (desiredMinutes % 60));
    }
}