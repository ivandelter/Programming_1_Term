import java.util.Scanner;

public class Exercise_8 {

    public static void main(String[] args){

        /*  Print N first divisors of M
            They can ask for more divisors than what the number actually has. In that
            case, we must print out the possible divisors, as well as an adequate error
            message
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Enter a number of divisors of the previous number you want to see");
        int div = sc.nextInt();
        int count = 0;

        if(div > num || div <= 0){
            System.out.println("Error: You have entered an invalid amount of divisor (bigger than the number, equals or smaller than 0).");
            System.out.println("Anyways, printing the possible ones.");
            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    count++;
                    System.out.println(i);
                }
            }
        } else{
            System.out.println("These are the first divisors: ");
            for(int i = 1; i <= div; i++){
                if(num % i == 0){
                    count++;
                    System.out.println(i);
                }
            }
        }

        if(count < div) System.out.println("There are less divisors than " + div);

        sc.close();

    }

}
