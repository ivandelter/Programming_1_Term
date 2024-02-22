package Exercise_4;

public class main {

    public static void main(String[] args) {

        Circumference cir = new Circumference(3, "green");

        System.out.println("The area is: " + cir.area());
        System.out.println("The perimeter is: " + cir.perimeter());
        System.out.println(cir.isBig() == true ? "Is big" : "Is small");

        Circumference c = new Circumference(3, "green");
        System.out.println(cir.isEqualTo(c) == true ? "They are equal" : "They are different");
        c.show();

    }

}
