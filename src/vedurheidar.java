import java.util.*;

public class vedurheidar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        sc.nextLine();
        int numOfRoads = sc.nextInt();
        sc.nextLine();


        for(int i = 0; i < numOfRoads; i++) {
            String input = sc.nextLine();
            String[] roadInfo = input.split("\\s+");
            String roadName = roadInfo[0];
            int maxSafeSpeed = Integer.parseInt(roadInfo[1]);

            if (speed > maxSafeSpeed) {
                System.out.println(roadName + " lokud");
            } else {
                System.out.println(roadName + " opin");
            }
        }
    }
}