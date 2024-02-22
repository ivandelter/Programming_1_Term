package Unidimensional;

import java.util.Scanner;

public class Exercise_8 {

    public static int[] createArray(Scanner sc, int size){
        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            System.out.println("Insert an integer for position " + i);
            System.out.print("> ");
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static int[] changePositions(int[] array){

        int[] newArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            if(i == array.length - 1){
                newArray[0] = array[i];
            } else{
                newArray[i + 1] = array[i];
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
        int size = 10;
        int[] array = createArray(sc, size);

        sc.close();
        System.out.println("Your array is");
        printArray(array);
        changePositions(array);
        System.out.println("The array after changes is");
        printArray(array);

    }

}
