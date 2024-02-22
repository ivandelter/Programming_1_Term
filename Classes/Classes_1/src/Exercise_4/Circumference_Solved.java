package Exercise_4;

public class Circumference_Solved {

    private float radius;
    private String color;

    public Circumference_Solved(float radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setRadius(float radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public float area(){
        return (float) (Math.PI * (Math.pow(this.radius, 2)));
    }

    public void printPerimeter(){
        float res = 2 * (float)(Math.PI * this.radius);
        System.out.println("Perimeter equals to: " + res);
    }

    public boolean isBig(){
        return this.area() > 20 ? true : false;
    }

    public boolean isEqualTo(Circumference_Solved c){
        return c.getRadius() == this.radius && c.getColor().equals(this.color) ? true : false;
    }

    public void show(){
        System.out.println("Circumference: ");
        System.out.println("Radius: " + this.radius);
        System.out.println("Color: " + this.color);
    }

}
