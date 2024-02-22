package Bidimensional;

import java.util.Scanner;

public class Exercise_5 {

    public static int[][] fillDiagonals(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(j == i){
                    matrix[i][j] = 1;
                } else if(j == matrix[i].length - i - 1){
                    matrix[i][j] = 1;
                }else{
                    if(matrix[i][j] != 1) matrix[i][j] = 0;
                }
            }
        }

        return matrix;

    }

    public static void print(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int[][] matrix = new int[7][7];

        print(fillDiagonals(matrix));

    }

}
