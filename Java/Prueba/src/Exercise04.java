public class Exercise04 {
    public static void main(String[] args) {

        // Write a program that can multiply the values from 5 to 10 and print the result
        int i;
        int x = 1;

        for(i = 5; i <= 10; i++){
            x *= i;
        }

        System.out.println("Result: " + x);

    }
}
