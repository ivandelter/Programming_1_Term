package Exercise_5;

public class Library_Solved {

    public static boolean isEven(int number){
        return number % 2 == 0 ? true : false;
    }

    public static int digitAmount(int number){
        int c = number;
        int digit = 1;
        while(c / 10 != 0){
            digit++;
            c /= 10;
        }
        return digit;
    }

    public static boolean isLong(int number){
        return digitAmount(number) >= 5 ? true : false;
    }

    public static boolean multipleOf10(int number){
        return number % 10 == 0 ? true : false;
    }

}
