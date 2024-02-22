import java.util.Scanner;

public class Exercise_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lastNum = 1;
        System.out.println("How many lines?");
        int howLong = sc.nextInt();

        for(int i = 1; i <= howLong; i++){
            String text = "";

            for(int j = 1; j <= i; j++){

                text += String.valueOf(lastNum) + " ";
                lastNum++;

            }

            System.out.println(text);

        }

    }

}
