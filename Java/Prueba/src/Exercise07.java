import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {

        // Ask the user for 100 numbers and print the ones that are odd
        Scanner sc = new Scanner(System.in);
        int max = 100;

        for(int i = 0; i < max; i++){
            System.out.println("Write a number and I'll tell you only if it's odd");
            int num = sc.nextInt();
            if(num % 2 > 0){
                System.out.println(num);
            }
        }

        sc.close();

    }
}
