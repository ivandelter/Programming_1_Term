import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args){

        // 3. Ask for 2 numbers, and if they aren’t equal, tell which one is the biggest one
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        String result;

        if(num1 != num2){
            result = num1 > num2 ? (num1 + " > " + num2) : (num2 + " > " + num1);
        } else{
            result =  "They are equal";
        }

        System.out.println(result);

    }
}
