import java.util.*;

public class spritt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfClassrooms = sc.nextInt();
        int numOfBottles = sc.nextInt();
        sc.nextLine();

        List<Integer> bottlesForEachClassroomList = new ArrayList<>(numOfClassrooms);
        for (int i = 0; i < numOfClassrooms; i++) {
            int num = sc.nextInt();
            bottlesForEachClassroomList.add(num);
        }

        int totalBottles = 0;
        for (int bottle : bottlesForEachClassroomList) {
            totalBottles = totalBottles + bottle;
        }

        if (totalBottles <= numOfBottles) {
            System.out.println("Jebb");
        } else {
            System.out.println("Neibb");
        }
    }
}