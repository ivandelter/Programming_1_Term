package Unidimensional;

import java.util.Scanner;

public class Exercise_12 {

    public static int[] createArray(Scanner sc, int howMany){
        int[] array = new int[howMany];

        for(int i = 0; i < array.length; i++){
            System.out.println("Insert an integer for position " + i);
            System.out.print("> ");
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static int counter(int[] array, String description){
        int counter = 0;

        for(int i = 0; i < array.length; i++){
            if(description.equals("even")){
                if(array[i] % 2 == 0) counter++;
            }else{
                if(array[i] % 2 > 0) counter++;
            }
        }

        return counter;
    }

    public static int[] arrayValues(int[] array, int length, String description){
        int[] newArray = new int[length];
        int pos = 0;

        for(int i = 0; i < array.length; i++){
            if(description.equals("even")){
                if(array[i] % 2 == 0){
                    newArray[pos] = array[i];
                    pos++;
                }
            }else{
                if(array[i] % 2 > 0){
                    newArray[pos] = array[i];
                    pos++;
                }
            }
        }

        return newArray;
    }

    public static int[] arrayIndexes(int[] array, int length, String description){
        int[] newArray = new int[length];
        int pos = 0;

        for(int i = 0; i < array.length; i++){
            if(description.equals("even")){
                if(array[i] % 2 == 0){
                    newArray[pos] = i;
                    pos++;
                }
            }else{
                if(array[i] % 2 > 0){
                    newArray[pos] = i;
                    pos++;
                }
            }
        }

        return newArray;
    }

    public static void printArray(int[] arrayValues, int[] arrayIndexes, String description){
        System.out.println("--------------------------------------------");
        System.out.println("Printing " + description);
        for(int i = 0; i < arrayValues.length; i++){
            System.out.println("Index: " + arrayIndexes[i] + "  -  Value: " + arrayValues[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int howMany = 10;
        int[] inputs = createArray(sc, howMany);

        int countEvens = counter(inputs, "even");
        int countOdds = counter(inputs, "odd");

        int[] evenValues = arrayValues(inputs, countEvens, "even");
        int[] evenIndexes = arrayIndexes(inputs, countEvens, "even");
        int[] oddsValues = arrayValues(inputs, countOdds, "odd");
        int[] oddsIndexes = arrayIndexes(inputs, countOdds, "odd");

        printArray(evenValues, evenIndexes, "evens array");
        printArray(oddsValues, oddsIndexes, "odds array");
    }

}
