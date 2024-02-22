package Unidimensional;

import java.util.Scanner;

public class Exercise_4 {

    public static int[] setArray(Scanner sc, int size){
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Insert a number for the position " + i);
            System.out.print("> ");
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int howLong = 10;
        int[] first = setArray(sc, howLong);
        int[] second = setArray(sc, howLong);

        sc.close();

        for(int i = 0; i < howLong; i++){
            System.out.print(i != howLong - 1 ? first[i] + ", " + second[i] + ", " : first[i] + ", " + second[i]);
        }

        System.out.println();

    }

}
