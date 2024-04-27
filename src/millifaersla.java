import java.util.*;

public class millifaersla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x < y && x < z) System.out.println("Monnei");
        if (y < x && y < z) System.out.println("Fjee");
        if (z < y && z < x) System.out.println("Dolladollabilljoll");
    }
}