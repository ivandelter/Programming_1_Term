package Exercise_6;

public class Point_Solved {

    private double x;
    private double y;

    public Point_Solved(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public int quadrant(){
        if(this.x > 0) {
            if (this.y > 0) {
                return 1;
            }

            return 4;
        } else{
            if(this.y > 0){
                return 2;
            }
            return 3;
        }
    }

    public void print(){
        System.out.println("X: " + this.x);
        System.out.println("Y: " + this.y);
    }

}
