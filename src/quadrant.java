import java.util.Scanner;

public class quadrant{
    public static void main(String[] args){

        //create a scanner object
        Scanner sc = new Scanner(System.in);

        //read in the value of point (x,y)
        int x = sc.nextInt();
        sc.nextLine();
        int y = sc.nextInt();

        if(x > 0 && y > 0){
            System.out.println("1");
        } else if(x < 0 && y > 0){
            System.out.println("2");
        } else if(x < 0 && y < 0){
            System.out.println("3");
        } else if(x > 0 && y < 0){
            System.out.println("4");
        }

    }
}