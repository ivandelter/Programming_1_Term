package Exercise_3;

public class NumberStatistics_Solved {

    private int total;
    private int numElems;

    public NumberStatistics_Solved() {
        this.numElems = 0;
        this.total = 0;
    }

    public void addNumbers(int num){
        this.total += num;
        this.numElems++;
    }

    public int amountOfNumbers(){
        return total;
    }

    public void showStatistics(){
        if(numElems > 0){
            double avg = (double) total / numElems;
            System.out.println("The average: " + avg);
        }else{
            System.out.println("There are nor elements");
        }

    }

}
