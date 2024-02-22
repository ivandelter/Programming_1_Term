package Exercise_4;

public class main2 {

    public static void main(String[] args) {
        Circumference_Solved c1 = new Circumference_Solved(3, "Red");
        Circumference_Solved c2 = new Circumference_Solved(10, "Blue");
        Circumference_Solved c3 = new Circumference_Solved(10, "Blue");

        c1.printPerimeter();
        c2.printPerimeter();

        System.out.println(c1.isBig() ? "Is big" : "Is NOT big");
        System.out.println(c2.isBig() ? "Is big" : "Is NOT big");

        System.out.println(c1.isEqualTo(c2) ? "They are equal" : "They are not equal");
        System.out.println(c2.isEqualTo(c3) ? "They are equal" : "They are not equal");
    }

}
