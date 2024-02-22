public class Exercise_2 {

    public static void main(String[] args){

        int[] a = new int[100];
        float sum = 0;
        float avg = 0;

        // Insert all the numbers
        for(int i = 1; i <= a.length; i++){
            a[i - 1] = i;
        }

        // Sum
        for(int i = 0; i < a.length; i++){
            sum += (float) a[i];
        }

        // Average
        avg = sum / (float) a.length;

        System.out.println("The sum from 1 to 100 is: " + sum);
        System.out.println("The average from 1 to 100 is: " + avg);

    }

}
