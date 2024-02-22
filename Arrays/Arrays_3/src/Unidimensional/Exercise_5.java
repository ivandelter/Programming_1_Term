package Unidimensional;

public class Exercise_5 {

    public static void showArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(i == array.length - 1 ? array[i] : array[i] + ", ");
        }
        System.out.println();
    }

    public static void insertFromFirst(int[] array, int[] selectedArray, int firstPos, int pos){
        array[pos] = selectedArray[firstPos];
    }

    public static void insertFromSecond(int[] array, int[] selectedArray, int secondPos, int pos){
        array[pos] = selectedArray[secondPos];
    }

    public static void main(String[] args) {

        int[] first = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] second = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112 };
        int[] finalArray = new int[first.length + second.length];
        int countPos = 0;
        int count = 0;

        for(int i = 0; i < finalArray.length; i++){
            if(count < 3){
                insertFromFirst(finalArray, first, countPos * 3 + count, i);
                count++;
            } else{
                insertFromSecond(finalArray, second,  countPos * 3 + count - 3, i);
                if(count >= 5){
                    count = 0;
                    countPos++;
                }else{
                    count++;
                }
            }
        }

        System.out.println("First array");
        showArray(first);
        System.out.println("Second array");
        showArray(second);
        System.out.println("---------------------------------");

        System.out.println("Final array");
        showArray(finalArray);

    }

}
