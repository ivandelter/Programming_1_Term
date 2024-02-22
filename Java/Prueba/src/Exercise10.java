import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        // Ask the user for two numbers: the second one is going to be the power of the first one. Print the result. Do exercise using a loop
        Scanner sc = new Scanner(System.in);
        int num1, num2, counter, total;

        System.out.println("Write a number");
        num1 = sc.nextInt();

        System.out.println("Write a second number");
        num2 = sc.nextInt();

        total = 1;
        counter = 1;

        if(num2 == 0){
            System.out.println("Result is: " + 1);
            System.exit(0);
        }

        while(counter <= num2){
            total *= num1;
            counter++;
        }

        System.out.println(total);

        sc.close();

    }
}