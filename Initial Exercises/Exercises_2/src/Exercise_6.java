import java.util.Scanner;

public class Exercise_6 {

    public static void main(String[] args){

        // Read a number from the keyboard and print all its divisors
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        //for(int i = 1; i <= num/2+1; i++){
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i + " is divisor of " + num);
            }
        }

        sc.close();

    }

}
