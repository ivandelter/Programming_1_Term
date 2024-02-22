package Exercise_6;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(){

    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void quadrant(){
        System.out.println(this.x >= 0 ? this.y >= 0 ? "Quadrant 1 (top-right)" : "Quadrant 4 (bottom-right)" : this.y >= 0 ? "Quadrant 2 (top-left)" : "Quadrant 3 (bottom-left)");
    }

    public void show(){
        System.out.println("X: " + this.x);
        System.out.println("Y: " + this.y);
    }

}
