import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args){

        // Ask the user for characters (until $ is entered) and print out how many vowels have been entered (Both uppercase and lowercase are valid)
        Scanner sc = new Scanner(System.in);
        String text;
        boolean keepAlive = true;
        int count = 0;

        /*
        text = "a";
        while(!text.equals("$")){
            text = sc.nextLine();
            text = text.toLowerCase();
            if(text.equals("a") || text.equals("e") || text.equals("i") || text.equals("o") || text.equals("u")) count++;
        }
        System.out.println("You have entered " + count + " vowels.");
        */

        while(keepAlive){
            System.out.println("Enter a character. If you want to stop enter $.");
            text = sc.nextLine();
            switch(text.toLowerCase()){
                case "a":
                    count++;
                    break;
                case "e":
                    count++;
                    break;
                case "i":
                    count++;
                    break;
                case "o":
                    count++;
                    break;
                case "u":
                    count++;
                    break;
                case "$":
                    keepAlive = false;
                    System.out.println("You have stopped the program.");
                    break;
            }
        }

        System.out.println("You have entered " + count + " vowels.");

        sc.close();

    }
}
