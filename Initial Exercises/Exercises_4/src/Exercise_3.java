public class Exercise_3 {

    public static void main(String[] args) {

        int lastNum = 1;
        int howLong = 5;

        for(int i = 1; i <= howLong; i++){
            String text = "";

            for(int j = 1; j <= i; j++){

                text += lastNum;
                lastNum = lastNum == 1 ? 0 : 1;

            }

            System.out.println(text);

        }

    }

}
