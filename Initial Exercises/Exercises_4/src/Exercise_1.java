import java.util.Scanner;

public class Exercise_1 {

    public static void pyramid(int length){
        for(int i = 1; i <= length; i++){
            String text = "";

            for(int j = 1; j <= i; j++){

                text += j;

            }

            System.out.println(text);

        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("How many lines?");
        int howLong = sc.nextInt();

        pyramid(howLong);

        sc.close();

    }

}
