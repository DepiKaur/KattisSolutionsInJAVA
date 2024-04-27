import java.util.Scanner;

public class metronome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfTicks = sc.nextInt();

        System.out.println((double)numOfTicks/4);
    }
}