import java.util.Scanner;

public class Exercise_9 {
    public static void border (int w){
        for(int i = 1; i <= w; i++){
            System.out.print("* ");
        }
        System.out.println();
    }
    public static void line(int n){
        System.out.print("*");
        for(int i = 1; i <= (n - 1) + 2 + 1; i++){
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How high do you want the box to be?");
        int width = 5;
        int howLong = sc.nextInt();

        border(width);
        for(int i = 1; i <= howLong; i++){
            line(howLong);
        }
        border(width);

    }

}
