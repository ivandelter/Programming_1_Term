package Exercise_4;

public class Circumference {

    private double radius;
    private String color;

    public Circumference(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double area(){
        return Math.PI*(Math.pow(this.radius, 2));
    }

    public double perimeter(){
        return 2 * Math.PI * this.radius;
    }

    public boolean isBig(){
        return this.area() > 20 ? true : false;
    }

    public boolean isEqualTo(Circumference c){
        return c.radius == this.radius && c.color.equals(this.color) ? true : false;
    }

    public void show(){
        System.out.println("Radius: " + this.radius);
        System.out.println("Color: " + this.color);
    }

}
