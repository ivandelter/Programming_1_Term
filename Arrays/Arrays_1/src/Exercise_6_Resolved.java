import java.util.Scanner;

public class Exercise_6_Resolved {

    public static double[] addGrades(Scanner sc) {
        System.out.println("How many grades do you want to input?");
        System.out.print("> ");
        int num = sc.nextInt();
        double[] grades;
        grades = new double[num];

        for(int i = 0; i < num; i++){
            System.out.println("Input the grade of the student");
            System.out.print("> ");
            double grade = sc.nextDouble();

            // Check if the grade is correct
            while(grade < 0.0 || grade > 10.0){
                System.out.println("That's not a valid grade, insert a correct one");
                System.out.print("> ");
                grade = sc.nextDouble();
            }
            grades[i] = grade;
        }

        return null;
    }

    public static double average(double[] array){
        double sum = 0.0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return sum / array.length;
    }

    public static void print(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void showStudentsAboveAverage(double[] array, double avg){
        for(int i = 0; i < array.length; i++){
            if(avg < array[i]){
                System.out.print(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] grades = addGrades(sc);
        System.out.println("The original array");
        print(grades);

        double avg = average(grades);
        System.out.println("The average is: " + avg);
        System.out.println("The grades above average are");
        showStudentsAboveAverage(grades, avg);
    }
}
