package Bidimensional;

import java.util.Scanner;

public class Exercise_3 {

    public static int[][] createMatrix(Scanner sc, int length){
        int[][] matrix = new int[length][length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println("Input pos [" + i + "][" + j + "]");
                System.out.print("> ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("----------------------------------------------");

        return matrix;
    }

    public static int getSum(int[][] m1, int[][] m2){
        int sum = 0;

        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                sum += m1[i][j] + m2[i][j];
            }
        }

        return sum;
    }

    public static void displaySum(int[][] m1, int[][] m2){

        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                System.out.print((m1[i][j] + m2[i][j]) + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] m1 = createMatrix(sc, 3);
        int[][] m2 = createMatrix(sc, 3);

        System.out.println("The sum of both arrays is: ");
        displaySum(m1, m2);

    }

}
