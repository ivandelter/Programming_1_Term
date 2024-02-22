package Exercise_7;
import Exercise_6.Point;

public class Straight{

    private double width;
    private Point pOne;
    private Point pTwo;

    public Straight(double width, Point pOne, Point pTwo){
      this.width = width;
      this.pOne = pOne;
      this.pTwo = pTwo;
    }

    public Straight(double width){
        this.width = width;
    }

    public Straight(double width, double xOne, double xTwo, double yOne, double yTwo){
        this.width = width;
        this.pOne = new Point();
        this.pTwo = new Point();
        this.pOne.setX(xOne);
        this.pTwo.setX(xTwo);
        this.pOne.setY(yOne);
        this.pTwo.setY(yTwo);
    }

    public boolean isHorizontal(){
        return this.pOne.getY() == this.pTwo.getY() ? true : false;
    }

    public boolean isVertical(){
        return this.pOne.getX() == this.pTwo.getX() ? true : false;
    }

    public void highestPoint(){
        if(this.pOne.getY() != this.pTwo.getY()){
            if(this.pOne.getY() > this.pTwo.getY()){
                this.pOne.show();
            }else{
                this.pTwo.show();
            }
        } else{
            System.out.println("They are equal");
        }

    }

    public double length(){
        double x1 = this.pOne.getX();
        double y1 = this.pOne.getY();
        double x2 = this.pTwo.getX();
        double y2 = this.pTwo.getY();

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void longest(Straight one, Straight two){
        if(one.length() != two.length()){
            if(one.length() > two.length()){
                one.show();
            } else{
                two.show();
            }
        } else{
            System.out.println("They are equal");
        }
    }

    public void show(){
        System.out.println("Width: " + this.width);
        System.out.println("Point one: ");
        this.pOne.show();
        System.out.println("Point two: ");
        this.pTwo.show();
    }

}
