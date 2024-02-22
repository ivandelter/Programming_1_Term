package Unidimensional;

import java.util.Scanner;

public class Exercise_14 {

    public static int[] createAscendingArray(Scanner sc, int howLong){
        int[] array = new int[howLong];
        int i = 1;

        System.out.println("Input value for position 0");
        System.out.print("> ");
        array[0] = sc.nextInt();

        while(i < howLong){
            System.out.println("Insert an integer number bigger than " + array[i - 1]);
            System.out.print("> ");
            int value = sc.nextInt();
            if(value > array[i - 1]){
                array[i] = value;
                i++;
            }
        }

        return array;
    }

    public static void searchNumber(int[] array, int num){
        int i = 0;
        boolean found = false;

        while(i < array.length && !found){
            if(array[i] == num){
                found = true;
            } else{
                i++;
            }
        }

        System.out.println(found == true ? "The index of " + num + " is " + i : "The number was not found");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int howLong = 10;
        int[] array = createAscendingArray(sc, howLong);

        System.out.println("Input value to search");
        System.out.print("> ");
        int number = sc.nextInt();

        searchNumber(array, number);

    }

}
