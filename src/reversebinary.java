import java.util.*;

public class reversebinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        // integer to binary conversion
        String binaryNum = Integer.toBinaryString(num);
        String reversedBinaryNum = "";

        // reversing the obtained binary number
        for (int i = binaryNum.length() - 1; i >= 0; i--) {
            reversedBinaryNum += binaryNum.charAt(i);
        }

        // creating number from binary
        int desiredInteger = Integer.parseInt(reversedBinaryNum, 2);
        System.out.println(desiredInteger);
    }
}
