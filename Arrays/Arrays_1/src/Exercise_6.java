import java.util.Scanner;

public class Exercise_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many students are there in your class?");
        System.out.print("> ");
        int howMany = sc.nextInt();

        // Beginning
        double[] grades = new double[howMany];
        String[] students = new String[howMany];

        // After getting the information
        double gradesSum = 0;

        for(int i = 0; i < howMany; i++){
            System.out.println(i == 0 ? "Enter the name of the student" : "Enter the name of the next student");
            System.out.print("> ");
            students[i] = sc.next();
            sc.nextLine();
            System.out.println("Enter the grade of " + students[i]);
            System.out.print("> ");
            double grade = sc.nextDouble();
            grades[i] = grade;
            gradesSum += grade;
        }

        double gradesAvg = gradesSum / howMany;
        int studentsAboveCount = 0;

        for(int i = 0; i < grades.length; i++){
            if(grades[i] > gradesAvg) studentsAboveCount++;
        }

        Double[] gradesAbove = new Double[studentsAboveCount];
        String[] studentsAbove = new String[studentsAboveCount];
        int countSaved = 0;

        for(int i = 0; i < grades.length; i++){
            if(grades[i] > gradesAvg){
                gradesAbove[countSaved] = grades[i];
                studentsAbove[countSaved] = students[i];
                countSaved++;
            }
        }

        System.out.println("---------------------------------------------");
        System.out.println("Average note of the class: " + String.format("%.2f", gradesAvg));
        System.out.println("---------------------------------------------");
        for(int i = 0; i < studentsAboveCount; i++){
            System.out.println(studentsAbove[i] + " has a grade above the average with a " + String.format("%.2f", gradesAbove[i]));
        }

    }

}
