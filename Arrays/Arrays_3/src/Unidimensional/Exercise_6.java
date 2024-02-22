package Unidimensional;

import java.util.Scanner;

public class Exercise_6 {

    public static int[] createArray(Scanner sc, int size){
        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            System.out.println("Insert an integer for position " + i);
            System.out.print("> ");
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static void checkOrder(int[] array){
        boolean doDecreasing = false;

        // Check if is increasing
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i + 1]){
                doDecreasing = true;
            } else{

            }
        }
        if(doDecreasing == false) System.out.println("The array is in increasing order");;

        if(doDecreasing){
            boolean isDecreasing = true;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] < array[i + 1]){
                    isDecreasing = false;
                }
            }

            System.out.println(isDecreasing == true ? "The array is in decreasing order" : "The array is unordered");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*System.out.println("Insert the size of the array");
        System.out.print("> ");
        int size = sc.nextInt();*/
        int size = 10;
        int[] array = createArray(sc, size);

        checkOrder(array);

    }

}
