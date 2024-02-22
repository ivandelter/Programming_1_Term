import java.util.Scanner;

public class exercise_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] dniDictionary = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        System.out.println("Enter only the numbers of your DNI");
        System.out.print("> ");
        int dni = sc.nextInt();
        System.out.println("Your DNI: " + dni + "" + dniDictionary[dni % 23]);


        // int[] dniA = new int[8];

        /*for(int i = 1; i <= 8; i++){
            dniA[8 - i] = dni % 10;
            dni /= 10;

        }

        for(int i = 0; i < dniA.length; i++){

            System.out.print(dniA[i]);
        }*/

        sc.close();

    }

}
