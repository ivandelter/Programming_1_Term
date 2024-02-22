import java.util.Scanner;

public class Exercise_1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int howManyStudents = 10;
        int howManyMarks = 5;
        int sumMarks = 0;
        int countOverEight = 0;
        int minStudentValue = 10;
        int minStudentCode = 0;

        for(int i = 0; i < howManyStudents; i++){
            // We have to save their min, max and avg
            int max = 0, min = 10, sumAvg = 0;

            // Ask for the code
            System.out.println("Which is your code?");
            int code = sc.nextInt();

            // Ask for his 5 marks
            for(int j = 1; j <= howManyMarks; j++){
                System.out.println("Which is the mark of the subject " + j);
                int mark = sc.nextInt();
                // Saving the mark for the average
                if(j == 1){
                    sumMarks += mark;
                }
                sumAvg += mark;
                // Checking their min and max
                if(mark > max) max = mark;
                if(mark < min) min = mark;
            }
            System.out.println("-----------------------------------------");

            // Know if has an score over 8
            if(sumAvg / howManyMarks >= 8) countOverEight++;
            // Know if is the current student with the lower mark
            if(sumAvg / howManyMarks < minStudentValue){
                minStudentValue = sumAvg / howManyMarks;
                minStudentCode = code;
            }
        }

        sc.close();

        System.out.println("The average mark of the first subject is: " + sumMarks);
        System.out.println("Students with a mark greater than 8: " + countOverEight);
        System.out.println("The student code with lower mark: " + minStudentCode);

    }

}
