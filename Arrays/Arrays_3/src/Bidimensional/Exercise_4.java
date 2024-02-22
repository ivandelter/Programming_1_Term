package Bidimensional;

import java.util.Scanner;

public class Exercise_4 {

    public static int[][] createMatrix(int row, int col){
        int[][] matrix = new int[row][col];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = i + j;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the size of the row");
        System.out.print("> ");
        int rowSize = sc.nextInt();

        System.out.println("Insert the size of the column");
        System.out.print("> ");
        int colSize = sc.nextInt();

        int[][] array = createMatrix(rowSize, colSize);

        // No terminado

    }

}
