import java.util.ArrayList;
import java.util.Scanner;

public class modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            int input = sc.nextInt() % 42;
            if(!nums.contains(input)) {
                nums.add(input);
            }
        }
        System.out.println(nums.size());
    }
}