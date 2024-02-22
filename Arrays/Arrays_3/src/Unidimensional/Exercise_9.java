package Unidimensional;

import java.util.Scanner;

public class Exercise_9 {

    public static int[] createArray(Scanner sc, int size){
        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            System.out.println("Insert an integer for position " + i);
            System.out.print("> ");
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static int[] changePositions(int[] array, int move){

        int[] newArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            if(i + move > array.length - 1){
                newArray[(i + move) - i - 1] = array[i];
            }else{
                newArray[i + move] = array[i];
            }
        }

        for(int i = 0; i < array.length; i++){
            array[i] = newArray[i];
        }

        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*System.out.println("Insert the size of the array");
        System.out.print("> ");
        int size = sc.nextInt();*/
        int size = 5;
        int[] array = createArray(sc, size);
        System.out.println("How many position do you want to move each element of the array?");
        System.out.print("> ");
        int positions = sc.nextInt();

        sc.close();
        System.out.println("Your array is");
        printArray(array);
        changePositions(array, positions);
        System.out.println("The array after changes is");
        printArray(array);

    }

}
