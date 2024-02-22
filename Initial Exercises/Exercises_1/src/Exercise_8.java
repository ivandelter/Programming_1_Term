import java.util.Scanner;

public class Exercise_8 {

    public static void main(String[] args){

        // Read numbers from the keyboard until you find a number below 10
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        int num = 0;

        while(!found){
            System.out.println("Enter a number");
            num = sc.nextInt();

            if(num < 100){
                found = true;
            }
        }

        sc.close();

        System.out.println("Found a number below 100: " + num);

    }

}
