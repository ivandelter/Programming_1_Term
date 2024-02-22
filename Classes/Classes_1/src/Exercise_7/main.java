package Exercise_7;
import Exercise_6.Point;

public class main {

    public static void main(String[] args) {

        Point p1 = new Point(2.0, 2.0);
        Point p2 = new Point(-5.0, 3.0);
        Straight first = new Straight(5, p1, p2);

        System.out.println("Is horizontal: " + first.isHorizontal());
        System.out.println("Is vertical: " + first.isVertical());
        System.out.println("The highest point is: ");
        first.highestPoint();

        System.out.println("The length is: " + first.length());
        Straight second = new Straight(4, 5.0, 6.0, -3.0, -5.0);

        System.out.println("The longest is: ");
        Straight.longest(first, second);

        first.show();
        second.show();

    }

}
