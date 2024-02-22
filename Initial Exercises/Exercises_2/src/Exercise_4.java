import java.util.Scanner;

public class Exercise_4 {

    public static void main(String[] args){

        // Ask for numbers until the user enters 0. Print how many odds and how many evens the sequence had
        Scanner sc = new Scanner(System.in);
        int i;
        int odds = 0;
        int evens = 0;
        boolean keepAlive = true;

        while(keepAlive){
            System.out.println("Enter a number. Enter 0 to stop");
            i = sc.nextInt();
            if(i == 0) keepAlive = false;
            if(i % 2 == 0){
                evens++;
            }else{
                 odds++;
            }
        }

        System.out.println("You have entered a total of " + odds + " odds numbers");
        System.out.println("You have entered a total of " + evens + " evens numbers");

        sc.close();

    }

}
