import java.util.Scanner;

public class Exercise_4 {

    public static void main(String[] main){

        // 4. Ask for a number to de user and write the corresponding name of the month.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number and I'll tell you the month");
        int number = sc.nextInt();
        String month = "";

        switch(number){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "There are only 12 months";
                break;
        }

        System.out.println("The month corresponding to " + number + " is: " + month);

    }

}
