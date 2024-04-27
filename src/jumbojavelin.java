import java.util.Scanner;

public class jumbojavelin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number > 1 && number <= 100) {
            int sum = 0;
            for(int i = 1; i<=number; i++){
                int newNumber = sc.nextInt();
                if(newNumber >= 1 && newNumber <= 50){
                    sum += newNumber;
                }
            }
            System.out.println(sum - (number-1));
        }
    }
}