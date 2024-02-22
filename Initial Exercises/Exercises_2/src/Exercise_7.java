import java.util.Scanner;

public class Exercise_7 {

    public static void main(String[] args){

        // A program that determines if a number (introduced by the user) is perfect
        /*
            A perfect number is a positive number such that the sum of its
            positive, proper divisors equals the number (A number M is called a
            proper divisor of N if M < N)
             Examples of perfect numbers: 6, 28, …
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i < (num/2+1); i++){
            if(num % i == 0) sum += i;
        }

        if(sum == num){
            System.out.println(num + " is a perfect number.");
        } else{
            System.out.println(num + " is not a perfect number");
        }

        sc.close();

    }

}
