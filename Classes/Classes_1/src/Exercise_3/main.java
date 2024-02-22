package Exercise_3;

public class main {

    public static void main(String[] args) {

        NumberStatistics n = new NumberStatistics();
        n.addNumbers(1);
        n.addNumbers(9);
        System.out.println("There is a total of " + n.amountOfNumbers() + " numbers");
        System.out.println("The average is: " + n.showStatistics());

    }

}
