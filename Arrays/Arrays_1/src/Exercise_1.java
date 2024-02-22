import java.util.Scanner;

public class Exercise_1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        for(int i = 0; i < a.length; i++){
            System.out.println("Please, insert a number for the position " + (i + 1));
            System.out.print("> ");
            a[i] = sc.nextInt();
        }

        System.out.println("Data of the array");
        for(int i = 0; i < a.length; i++){
            System.out.println("Index: " + i + " || Value: " + a[i]);
        }
        sc.close();

    }

}
