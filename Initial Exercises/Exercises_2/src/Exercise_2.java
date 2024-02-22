public class Exercise_2 {

    public static void main(String[] args){

        // Write the pseudocode needed to print the even numbers less than 100 (in descending order)

        /*ALGORITHM Exercise_2
                DATA
                        start int numeric var
                        sum int numeric var
                        start = 100
                START
                        FOR count to 0 step 1 repeat
                                IF(count % 2 == 0)
                                        WRITE count
                                END IF
                        END FOR
        END ALGORITHM*/

        for(int i = 100; i > 0; i--){
            if(i % 2 == 0) System.out.println(i);
        }
    }

}
