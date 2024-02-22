import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean keepLoop = true;
        long factorial = 1;
        int summation = 0;
        int greaterHundred = 0;
        int howManyInputs = 0;
        int sumOfAvg = 0;

        while(keepLoop){

            if(summation != 0) System.out.println("-----------------------------------------------------------");
            System.out.println("Please, enter an integer or 0 to stop the process");
            int num = sc.nextInt();
            summation += num;
            howManyInputs++;
            if(num < 10) sumOfAvg += num;

            if(num == 0){
                if(summation == 0){
                    System.out.println("The factorial of 0 is 0");
                    System.out.println("The summation is 0");
                }
                keepLoop = false;
            }else{
                if(num > 19){
                    System.out.println("The number you entered returns a factorial too big to calculate");
                } else{
                    for(int i = 1; i <= num; i++){
                        factorial *= i;
                    }

                    System.out.println("The factorial of " + num + " is " + factorial);
                }
                if(summation > 100){
                    greaterHundred++;
                }
            }

        }

        System.out.println("The summation of all inputs is: " + summation);
        System.out.println("There have been " + greaterHundred + " summations over 100");
        System.out.println("The average of numbers smaller than 10 is: " + (sumOfAvg / howManyInputs + 1));

        sc.close();

    }
}
