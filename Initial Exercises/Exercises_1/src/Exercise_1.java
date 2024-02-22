import java.util.Scanner;

public class Exercise_1 {

    public static void main(String[] args) {
        // 1. Ask for 2 numbers aabnd write "True" if the first one is the biggest one

        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter the first number");
        num1 = sc.nextInt();

        System.out.println("Enter the second number");
        num2 = sc.nextInt();

        String result = num1 > num2 ? "True" : "False";
        System.out.println(result);
    }

}
