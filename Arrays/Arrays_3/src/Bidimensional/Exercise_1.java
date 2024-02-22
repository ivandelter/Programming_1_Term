package Bidimensional;

public class Exercise_1 {

    public static int[][] createMatrix(int x){
        int[][] matrix = new int[x][x];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = i + j;
            }
        }

        return matrix;
    }

    public static void print(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(j == matrix[i].length - 1 ? matrix[i][j] : matrix[i][j] + ", ");
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {

        int[][] m = createMatrix(5);

        print(m);

    }

}
