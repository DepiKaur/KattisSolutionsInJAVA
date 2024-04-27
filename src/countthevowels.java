import java.util.Scanner;

public class countthevowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        int counter = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'a'|| text.charAt(i) == 'e'|| text.charAt(i) == 'i'||
                    text.charAt(i) == 'o'|| text.charAt(i) == 'u') {
                counter++;
            }
        }
        System.out.println(counter);

    }
}