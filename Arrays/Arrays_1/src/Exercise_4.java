import java.util.Scanner;

public class Exercise_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many students will you ask for?");
        System.out.print("> ");
        int howMany = sc.nextInt();
        //int howMany = 10;
        System.out.println("---------------------------------------------");
        float[] grades = new float[howMany];
        String[] names = new String[howMany];
        String[] marks = new String[howMany];

        // Ask for the grade and name
        for(int i = 0; i < howMany; i++){
            System.out.println("Which is the student name?");
            System.out.print("> ");
            names[i] = sc.next();
            sc.nextLine();
            System.out.println("Which is the grade of " + names[i] + "?");
            System.out.print("> ");
            grades[i] = sc.nextFloat();
            if(grades[i] < 4.99){
                marks[i] = "D";
            } else if(grades[i] >= 5 && grades[i] <= 6.99){
                marks[i] = "C";
            } else if(grades[i] >= 7 && grades[i] <= 8.99){
                marks[i] = "B";
            } else if(grades[i] >= 8 && grades[i] <= 10){
                marks[i] = "A";
            } else{
                marks[i] = "S";
            }
            System.out.println("---------------------------------------------");
        }

        sc.close();

        for(int i = 0; i < howMany; i++){
            System.out.println("Name: " + names[i] + " ||  Grade: " + grades[i] + "  || Mark: " + marks[i]);
        }

    }

}
