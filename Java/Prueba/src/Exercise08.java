import java.util.Scanner;

public class Exercise08 {
    
    public static void main(String[] args) {

        // Ask the user for 100 numbers and print the sum of the odd numbers
        int sum = 0;
        int max = 100;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < max; i++){
            System.out.println("Write a number and I'll sum it if it's odd");
            int num = sc.nextInt();
            if(num % 2 > 0){
                sum += num;
            }
        }

        System.out.println("The total sum is: " + sum);
        sc.close();

    }
}
