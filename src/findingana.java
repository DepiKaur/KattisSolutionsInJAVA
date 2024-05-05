import java.util.*;

public class findingana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int indexOfA = word.indexOf("a");

        System.out.println(word.substring(indexOfA));
    }
}