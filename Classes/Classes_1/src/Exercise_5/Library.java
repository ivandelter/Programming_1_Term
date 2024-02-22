package Exercise_5;

public class Library {

    public Library(){

    }

    public static boolean isEven(int number){
        return number % 2 == 0 ? true : false;
    }

    public static int digitAmount(int number){
        return (int)String.valueOf(number).length();
    }

    public static boolean isLong(int number){
        return digitAmount(number) >= 5 ? true : false;
    }

    public static boolean multipleOf10(int number){
        return number % 10 == 0 ? true : false;
    }

}
