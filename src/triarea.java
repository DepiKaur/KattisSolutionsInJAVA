import java.util.Scanner;

public class triarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        double areaOfTriangle = 0.5 * b * h;
        System.out.println(areaOfTriangle);
    }
}