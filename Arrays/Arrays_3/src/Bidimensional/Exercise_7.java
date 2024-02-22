package Bidimensional;

public class Exercise_7 {

    public static int[][] createMatrix(int first, int second){
        int[][] matrix = new int[first][second];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = 0;
            }
        }

        return matrix;
    }

    public static int[][] fillBorder(int[][] array){

        for(int i = 0; i < array.length; i++){

            for(int j = 0; j < array[i].length; j++){
                if(i == 0){
                    // Fill the top
                    array[i][j] = 1;
                }else if(i == array.length - 1){
                    // Fill the bottom
                    array[i][j] = 1;
                }else if(j == 0){
                    // Fill the left
                    array[i][j] = 1;
                }else if(j == array[i].length - 1){
                    // Fill the right
                    array[i][j] = 1;
                }
            }

        }

        return array;
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

        int sizeFirst = 8;
        int sizeSecond = 6;

        int[][] array = createMatrix(sizeFirst, sizeSecond);

        print(fillBorder(array));

    }

}
