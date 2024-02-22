public class Exercise06 {
    public static void main(String[] args) {

        // Write the sum of all the numbers that are divisible by 3 between 10 and 20
        int i;
        int x = 0;

        for(i = 10; i <= 20; i++){
            if(i % 3 == 0) x += i;
        }

        System.out.println(x);

    }
}
