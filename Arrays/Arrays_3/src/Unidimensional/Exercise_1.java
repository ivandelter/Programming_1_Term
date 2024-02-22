package Unidimensional;

import java.util.Scanner;

public class Exercise_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] storage = new int[5];

        for(int i = 0; i <= storage.length - 1; i++){
            System.out.println("Please, enter an integer number for the position " + (i));
            System.out.print("> ");
            storage[i] = sc.nextInt();
        }

        int[] reversed = new int[5];
        int count = 0;
        for(int i = 4; i >= 0; i--){
            reversed[count] = storage[i];
            count++;
        }

        sc.close();

        for(int i = 0; i < reversed.length; i++){
            System.out.print(i < reversed.length - 1 ? reversed[i] + ", ": reversed[i]);
        }
        System.out.println();

    }

}
