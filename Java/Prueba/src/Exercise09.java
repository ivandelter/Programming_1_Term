import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {

        // Ask the user for 50 numbers and print all except the negative ones and the odd ones
        Scanner sc = new Scanner(System.in);
        byte max = 50;

        for(int i = 0; i < max; i++){
            System.out.println("Write a number");
            int number = sc.nextInt();
            if(number > 0 && number % 2 == 0){
                System.out.println(number);
            }
        }

        sc.close();

    }
}
