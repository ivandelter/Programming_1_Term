package Exercise_5;

public class main2 {

    public static void main(String[] args) {

        System.out.println(Library.isEven(4) ? "Is even" : "Is odd");
        System.out.println(Library.digitAmount(1234));
        System.out.println(Library.digitAmount(123456));
        System.out.println(Library.isLong(1234) ? "Is long" : "Is not long");
        System.out.println(Library.isLong(123456) ? "Is long" : "Is not long");
        System.out.println(Library.multipleOf10(20) ? "Is multiple of 10" : "Is NOT multiple of 10");

    }

}
