public class Exercise_7 {

    public static void main(String[] args){

        // Write a program that can add the first 5 positive integer numbers

        boolean keepAlive = true;
        int count = 0;
        int sum = 0;

        while(keepAlive){
            if(count > 0) sum += count;
            if(count > 5) keepAlive = false;
        }

    }

}