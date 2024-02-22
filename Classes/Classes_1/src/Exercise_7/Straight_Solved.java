package Exercise_7;
import Exercise_6.Point;

public class Straight_Solved {

    private float width;
    private Point p1;
    private Point p2;

    public Straight_Solved(float width, Point p1, Point p2){
        this.width = width;
        this.p1 = p1;
        this.p2 = p2;
    }

    public Straight_Solved(float width, double xOne, double xTwo, double yOne, double yTwo){
        this.width = width;
        this.p1 = new Point();
        this.p2 = new Point();
        this.p1.setX(xOne);
        this.p2.setX(xTwo);
        this.p1.setY(yOne);
        this.p2.setY(yTwo);
    }

    public boolean isHorizontal(){
        return this.p1.getY() == this.p2.getY() ? true : false;
    }

    public boolean isVertical(){
        return this.p1.getX() == this.p2.getX() ? true : false;
    }

    public double length(){
        double x = Math.abs(this.p1.getX() - this.p2.getX());
        double y = Math.abs(this.p1.getY() - this.p2.getY());
        double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return result;
    }

    public Straight_Solved longest(Straight_Solved s){
        return this.length() > s.length() ? this : s;
    }

    public void show(){
        System.out.println("Width: " + this.width);
        System.out.println("Point one: ");
        this.p1.show();
        System.out.println("Point two: ");
        this.p2.show();
    }

}
