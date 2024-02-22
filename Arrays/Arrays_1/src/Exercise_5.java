public class Exercise_5 {

    public static void main(String[] args){

        int[] array1 = {1, 2, 3, 4, 5};

        int[] array2 = new int[array1.length];
        int count = 0;

        for(int i = array1.length - 1; i >= 0; i--){
            array2[count] = array1[i];
            count++;
        }

        String result = "";
        for(int i = 0; i <= array2.length - 1; i++){
            result += array2[i] + ", ";
        }

        if(result.endsWith(", ")){
            result = result.substring(0, result.length() - 2);
        }

        System.out.println(result);

    }

}