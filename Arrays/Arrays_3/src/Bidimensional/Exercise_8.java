package Bidimensional;

import java.util.Scanner;

public class Exercise_8 {

    public static void registerParticipant(Scanner sc, String[][] participants, int occupied){
        // Name, PB 17, PB 18, PB 19
        System.out.println("Insert the name of the participant");
        System.out.print("> ");

        System.out.println("Insert the personal best mark of 2017");
        System.out.print("> ");
        Double seven = sc.nextDouble();
        participants[occupied][1] = Double.toString(seven);

        System.out.println("Insert the personal best mark of 2018");
        System.out.print("> ");
        Double eight = sc.nextDouble();
        participants[occupied][2] = Double.toString(eight);

        System.out.println("Insert the personal best mark of 2019");
        System.out.print("> ");
        Double nine = sc.nextDouble();
        participants[occupied][3] = Double.toString(nine);

        System.out.println("------------------------------------------------");
    }

    public static void showListOfData(String[][] participants, int occupied){
        for(int i = 0; i < occupied; i++){
            System.out.println("Name: " + participants[i][0] + " | PB 2017: " + participants[i][1] + " | PB 2018: " + participants[i][2] + " | PB 2019: " + participants[i][2]);
        }

        System.out.println("------------------------------------------------");
    }
    public static void showSortedMarks(String[][] participants, int occupied){
        // Double.parseDouble
        String[][] sortedMarks = new String[occupied][2];

        for(int i = 0; i < occupied; i++){
            if(i == 0){
                sortedMarks[i][0] = participants[i][0];
                sortedMarks[i][1] = participants[i][2];
            } else{
                if(Double.parseDouble(participants[i][2]) > Double.parseDouble(participants[i - 1][2])){
                    sortedMarks[i - 1][0] = participants[i][0];
                    sortedMarks[i - 1][1] = participants[i][2];
                    sortedMarks[i][0] = participants[i - 1][0];
                    sortedMarks[i][1] = participants[i - 1][2];
                } else{
                    sortedMarks[i][0] = participants[i][0];
                    sortedMarks[i][1] = participants[i][2];
                }
            }
        }

        printMatrix(sortedMarks);

        System.out.println("------------------------------------------------");
    }

    public static void printMatrix(String[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sizeAthletes = 10;
        int sizeData = 4;
        String[][] participants = new String[sizeAthletes][sizeData];
        int occupied = 0;

        boolean exit = false;

        while(!exit){
            System.out.println("Choose one of the following options");
            System.out.println("[a] Register a participant");
            System.out.println("[b] Show the data");
            System.out.println("[c] Display the brands");
            System.out.println("[d] Leave");
            System.out.print("> ");
            String option;
            option = sc.next();
            sc.nextLine();
            option = option.toLowerCase();

            switch(option){
                case "a":
                    if(occupied < 10){
                        registerParticipant(sc, participants, occupied);
                        occupied++;
                    } else{
                        System.out.println("The list is full");
                        System.out.println("------------------------------------------------");
                    }
                    break;
                case "b":
                    showListOfData(participants, occupied);
                    break;
                case "c":
                    showSortedMarks(participants, occupied);
                    break;
                case "d":
                    exit = true;
                    System.out.println("Leaving the program...");
                default:
                    if(!exit) System.out.println("That is not a valid option");
            }
        }

    }

}
