import java.util.Scanner;

public class Exercise_9 {

    public static void main(String[] args){

        // Ask for 10 numbers to the user, and write how many of those numbers are bigger than 10
        Scanner sc = new Scanner(System.in);
        int num, i=1, result=0;

        while(i <= 10){
            num = sc.nextInt();
            if(num > 10) result++;
            i++;
        }

        System.out.println("There are " + result + " numbers bigger than 10");
    }

}
