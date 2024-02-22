package Exercise_3;

import java.awt.font.NumericShaper;

public class NumberStatistics {

    private int[] numbers;

    public NumberStatistics(){
        this.numbers = new int[0];
    }

    public int[] getNumbers(){
        return this.numbers;
    }

    public void setNumbers(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            this.numbers[i] = numbers[i];
        }
        //this.numbers = numbers;
    }

    public void addNumbers(int number){
        int[] newOne = new int[getNumbers().length + 1];
        for(int i = 0; i < numbers.length; i++){
            newOne[i] = numbers[i];
        }
        newOne[newOne.length - 1] = number;
        setNumbers(newOne);
    }

    public int amountOfNumbers(){
        return this.numbers.length;
    }

    public double showStatistics(){
        int sum = 0;
        for(int i = 0; i < this.numbers.length; i++){
            sum += this.numbers[i];
        }
        return sum / this.amountOfNumbers();
    }

}
