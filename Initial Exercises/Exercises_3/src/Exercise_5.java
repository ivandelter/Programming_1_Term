import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Province
        for (int h = 1; h <= 4; h++) {
            System.out.println("[Province " + h + "]");
            System.out.println("Which is the identification code of the province " + h + "?");
            String idCode = sc.next();
            sc.nextLine();
            System.out.println("Which is the code of the area?");
            String areaCode = sc.next();
            sc.nextLine();
            System.out.println("How many towns there are in the province?");
            int numTowns = sc.nextInt();

            for (int i = 1; i <= numTowns; i++) {
                float salariesSum = 0;
                int salariesMany = 0;
                System.out.println("[Town " + i + "]");
                System.out.println("Which is the ID Code of the town " + i + "?");
                String tIdCode = sc.next();
                sc.nextLine();
                System.out.println("How large is the town area?");
                float tAreaCode = sc.nextFloat();
                System.out.println("How many families live in the town?");
                int tNumFamilies = sc.nextInt();

                for (int j = 1; j <= tNumFamilies; j++) {
                    System.out.println("[Family " + j + "]");
                    System.out.println("Which is the ID Code of the head's family (" + j + ")?");
                    String headIdCode = sc.next();
                    sc.nextLine();
                    System.out.println("Which is the total salary of the family?");
                    int salary = sc.nextInt();
                    System.out.println("How many children live in the house?");
                    int numChildren = sc.nextInt();

                    salariesMany++;
                    salariesSum += salary;
                }

                System.out.println("--------------------------------------------------------------------------");
                System.out.println("[Town " + tIdCode + " Results]");
                System.out.println("--------------------------------------------------------------------------");

                System.out.println("The average salary of the town " + tIdCode + " is: " + (salariesSum / salariesMany));

            }

        }

        sc.close();

    }

}
