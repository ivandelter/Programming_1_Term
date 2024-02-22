import java.util.Scanner;

public class Exercise_4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean keepLoop = true;
        String keepPlaying;

        while(keepLoop){

            System.out.println("Enter the first number please");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number please");
            int num2 = sc.nextInt();

            if(num2 == 0){
                System.out.println("The power of " + num1 + "^" + num2 + " equals to 1");
            } else if(num2 > 0){
                int result = num1;
                for(int i = 1; i < num2; i++){
                    result *= num1;
                }
                System.out.println("The power of " + num1 + "^" + num2 + " equals to " + result);
            } else{
                int result = num1;
                for(int i = -1; i > num2; i--){
                    result *= num1;
                }
                System.out.println("The power of " + num1 + "^" + num2 + " equals to " + result);
            }

            System.out.println("Do you want to keep playing? Stop Playing (N) | Keep Playing (Anything)");
            keepPlaying = sc.next();
            sc.nextLine();
            keepPlaying.toLowerCase();
            if(keepPlaying.equals("n")) keepLoop = false;
            if(keepLoop == true) System.out.println("---------------------------------------------------");
        }

        sc.close();

    }

}
