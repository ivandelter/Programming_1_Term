package Bidimensional;

import java.util.Scanner;

public class Exercise_6 {

    public static int[][] createMatrix(Scanner sc, int length){
        int[][] matrix = new int[length][length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println("Input pos [" + i + "][" + j + "]");
                System.out.print("> ");
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    public static int calcRow(int[] row){

        int sum = 0;

        for(int i = 0; i < row.length; i++){
            sum += row[i];
        }

        return sum;
    }

    public static int calcCol(int[][] array, int pos, int size){

        int sum = 0;

        for(int i = 0; i < size; i++){
            sum += array[i][pos];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How long do you want the array to be?");
        System.out.print("> ");
        int size = sc.nextInt();

        System.out.println("---------------------------------------");
        int[][] array = createMatrix(sc, size);

        System.out.println("---------------------------------------");
        for(int i = 0; i < size; i++){
            System.out.println("Sum of row [" + i + "]: " + calcRow(array[i]));
            System.out.println("Sum of col [" + i + "]: " + calcCol(array, i, size));
            System.out.println("---------------------------------------");
        }

    }

}
