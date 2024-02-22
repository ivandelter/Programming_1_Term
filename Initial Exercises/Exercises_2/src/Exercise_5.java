import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args){

        // Ask for positive numbers and print out the maximum and the minimum. Stop when an incorrect value (zero or negative) is entered
        Scanner sc = new Scanner(System.in);
        int maximum = 0;
        int minimum = 0;
        int asked;
        boolean keepAlive = true;

        while(keepAlive){
            System.out.println("Enter a positive number or a negative one to stop");
            asked = sc.nextInt();
            if(asked <= 0) {
                keepAlive = false;
            }else{
                if(maximum == 0) maximum = asked;
                if(minimum == 0) minimum = asked;
                if(asked > maximum) maximum = asked;
                if(asked < minimum) minimum = asked;
            }

        }

        System.out.println("The maximum has been: " + maximum);
        System.out.println("The minimum has been: " + minimum);

        sc.close();

    }

}
