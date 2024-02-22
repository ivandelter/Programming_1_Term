import java.util.Scanner;

public class Exercise_2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("How many students will you ask for?");
        int howManyStu = sc.nextInt();
        System.out.println("----------------------------------");
        float s1SumPra = 0, s2SumPra = 0, s3SumPra = 0, s4SumPra = 0, s5SumPra = 0; // Sum of all Practical marks of each subject
        float s1SumThe = 0, s2SumThe = 0, s3SumThe = 0, s4SumThe = 0, s5SumThe = 0; // Sum of all theoretical marks of each subject
        int s1sex = 0, s2sex = 0, s3sex = 0, s4sex = 0, s5sex = 0; // Student code of the best practical mark by sex
        float s1Best = 0f, s2Best = 0f, s3Best = 0f, s4Best = 0f, s5Best = 0f; // Average subject duration
        float s1AvgDur = 0f, s2AvgDur = 0f, s3AvgDur = 0f, s4AvgDur = 0f, s5AvgDur = 0f;

        String code;
        float hpw;
        for(int i = 1; i <= howManyStu; i++){
            // Average mark between 5 and 15 hours
            int sumAvg = 0;
            int countAvg = 0;

            System.out.println("Which is your code?");
            code = sc.next();
            sc.nextLine();
            int sex = 0, askSex;
            boolean correctSex = false;
            System.out.println("Which is your sex? 0 male and 1 female");
            while(!correctSex){
                askSex = sc.nextInt();
                if(askSex == 0 || askSex == 1){
                    sex = askSex;
                    correctSex = true;
                } else{
                    System.out.println("Wrong value, type 0 for male and 1 for female");
                }
            }

            for(int j = 1; j <= 5; j++){
                System.out.println("[Student " + code + "  -  Subject " + j + "]");
                System.out.println("Which are the hours per week of the subject " + j);
                hpw = sc.nextFloat();

                float praMark = 0f, theMark = 0f;

                System.out.println("Which is your practical mark?");
                praMark = sc.nextFloat();
                System.out.println("Which is your theoretical mark?");
                theMark = sc.nextFloat();

                if(hpw >= 5 && hpw <= 15){
                    sumAvg += praMark + theMark / 2;
                    countAvg++;
                }

                if(j == 1){

                    if(hpw > 8.0){
                        s1SumPra += praMark;
                        s1SumThe += theMark;
                    }
                    if(praMark > s1Best){
                        s1sex = sex;
                    }
                    s1AvgDur += hpw;

                }else if(j == 2){

                    if(hpw > 8.0){
                        s2SumPra += praMark;
                        s2SumThe += theMark;
                    }
                    if(praMark > s2Best){
                        s2sex = sex;
                    }
                    s2AvgDur += hpw;

                }else if(j == 3){

                    if(hpw > 8.0){
                        s3SumPra += praMark;
                        s3SumThe += theMark;
                    }
                    if(praMark > s3Best){
                        s3sex = sex;
                    }
                    s3AvgDur += hpw;

                }else if(j == 4){

                    if(hpw > 8.0){
                        s4SumPra += praMark;
                        s4SumThe += theMark;
                    }
                    if(praMark > s4Best){
                        s4sex = sex;
                    }
                    s4AvgDur += hpw;

                }else{

                    if(hpw > 8.0){
                        s5SumPra += praMark;
                        s5SumThe += theMark;
                    }
                    if(praMark > s5Best){
                        s5sex = sex;
                    }
                    s5AvgDur += hpw;

                }

            }

            if(countAvg > 0) System.out.println("The average mark of all your subjects from 5 to 15 hours are: " + (sumAvg / countAvg));

            System.out.println("----------------------------------");

        }

        System.out.println("These are the results");
        System.out.println("----------------------------------");
        for(int i = 1; i <= 5; i++){

            if(i == 1){
                System.out.println("The average practical mark of subject " + i + " is: " + s1SumPra / howManyStu);
                System.out.println("The average theoretical mark of subject " + i + " is: " + s1SumThe / howManyStu);
                System.out.println(s1sex == 0 ? "The sex of the student with best practical note is: Male" : "The sex of the student with best practical note is: Female");
            } else if(i == 2){
                System.out.println("The average practical mark of subject " + i + " is: " + s2SumPra / howManyStu);
                System.out.println("The average theoretical mark of subject " + i + " is: " + s2SumThe / howManyStu);
                System.out.println(s2sex == 0 ? "The sex of the student with best practical note is: Male" : "The sex of the student with best practical note is: Female");
            }else if(i == 3){
                System.out.println("The average practical mark of subject " + i + " is: " + s3SumPra / howManyStu);
                System.out.println("The average theoretical mark of subject " + i + " is: " + s3SumThe / howManyStu);
                System.out.println(s3sex == 0 ? "The sex of the student with best practical note is: Male" : "The sex of the student with best practical note is: Female");
            }else if(i == 4){
                System.out.println("The average practical mark of subject " + i + " is: " + s4SumPra / howManyStu);
                System.out.println("The average theoretical mark of subject " + i + " is: " + s4SumThe / howManyStu);
                System.out.println(s4sex == 0 ? "The sex of the student with best practical note is: Male" : "The sex of the student with best practical note is: Female");
            }else{
                System.out.println("The average practical mark of subject " + i + " is: " + s5SumPra / howManyStu);
                System.out.println("The average theoretical mark of subject " + i + " is: " + s5SumThe / howManyStu);
                System.out.println(s5sex == 0 ? "The sex of the student with best practical note is: Male" : "The sex of the student with best practical note is: Female");
            }

        }

        sc.close();

    }

}
