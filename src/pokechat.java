import java.util.*;

public class pokechat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String encodedMsg = sc.nextLine();

        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < encodedMsg.length(); i += 3) {
            String s;
            if (i == (encodedMsg.length() - 1) - 3) {
                s = encodedMsg.substring(i);
            } else {
                s = encodedMsg.substring(i, i + 3);
            }

            int num = Integer.parseInt(s);
            numList.add(num);
        }

        for (Integer num : numList) {
            System.out.print(input.charAt(num - 1));
        }
    }
}