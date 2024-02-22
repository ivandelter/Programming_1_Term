import java.util.Scanner;

public class Exercise_7_Resolved {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of rows");
        int num = sc.nextInt();

        // First half
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num - i; j--){
                System.out.print(" ");
            }
            System.out.println("*");
            System.out.println();

            for(int j = 1; j < i * 2 - 1; j++){
                System.out.print("*");
            }
        }

        // Second half
        for(int i = 1; 1 <= num - 1; i++){
            for(int j = 1; j <= i; j--){
                System.out.print(" ");
            }
            System.out.println("*");
            for(int j = 1; j < (num - i - 1) * 2; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
