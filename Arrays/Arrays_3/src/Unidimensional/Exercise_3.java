package Unidimensional;

import java.util.Scanner;

public class Exercise_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] storage = new int[10];
        int count = storage.length - 1;

        for(int i = 0; i < 10; i++){
            System.out.println("Insert a number for the position " + i);
            System.out.print("> ");
            storage[i] = sc.nextInt();
        }

        sc.close();

        for(int i = 0; i < 5; i++){
            System.out.print(i != 4 ? storage[i] + ", " + storage[count] + ", " : storage[i] + ", " + storage[count]);
            count--;
        }

        System.out.println();

    }

}
