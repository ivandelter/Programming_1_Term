package Unidimensional;

import java.util.Scanner;

public class Exercise_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] storage = new int[5];
        int sumPositive = 0;
        int howManyPositive = 0;
        int sumNegative = 0;
        int howManyNegative = 0;
        int countZero = 0;

        for(int i = 0; i <= storage.length - 1; i++){
            System.out.println("Please, enter an integer number for the position " + (i));
            System.out.print("> ");
            storage[i] = sc.nextInt();
        }

        for(int i = 0; i < storage.length - 1; i++){
            if(storage[i] == 0){
                countZero++;
            } else if(storage[i] < 0){
                sumNegative += storage[i];
                howManyNegative++;
            } else{
                sumPositive += storage[i];
                howManyPositive++;
            }
        }

        sc.close();

        System.out.println(countZero > 0 ? "There is a total of " + countZero + " zeros" : "You didn't entered any 0");
        System.out.println(howManyPositive > 0 ? "The average of the positive numbers is " + ((float)sumPositive / (float)howManyPositive) : "You didn't entered any positive number");
        System.out.println(howManyNegative > 0 ? "The average of the negative numbers is " + ((float)sumNegative / (float)howManyNegative) : "You didn't entered any negative number");
        // In the negatives it always misses by -0.5 -> -1, -2, -3 => -1.5 when it should be -2

    }

}
