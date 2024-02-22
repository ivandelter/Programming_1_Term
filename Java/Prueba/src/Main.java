import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        int num1 = 6;
        double num2 = 8.5;
        boolean isTrue = true;
        char vowel = 'a';
        String text = "asdfkjsdfk";

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(isTrue);
        System.out.println(vowel);
        System.out.println(text);

        Scanner sc = new Scanner(System.in);

        System.out.println("Write a number");
        int getNumber = sc.nextInt();
        System.out.println("You have written " + getNumber);

        sc.close();

    }
}