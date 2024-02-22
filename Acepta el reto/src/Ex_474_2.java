import java.util.Scanner;

public class Ex_474_2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt();

        // Cuantas rondas
        for(int i = 0; i < rounds; i++){

            // La posicion en la que empieza la plaza (no se si es useless)
            int squarePos = 0;
            int walked = 0;
            int spidermanPos = sc.nextInt();
            int firstBomb = sc.nextInt();
            int secondBomb = sc.nextInt();

            boolean isFirstShorter = false;

            int distanceFirst, distanceSecond;
            if(firstBomb > secondBomb){ // Hace falta este if?
                if(firstBomb > spidermanPos){
                    distanceFirst = firstBomb - spidermanPos;
                }else{
                    distanceFirst = spidermanPos - firstBomb;
                }
                if(secondBomb > spidermanPos){
                    distanceSecond = secondBomb - spidermanPos;
                }else{
                    distanceSecond = spidermanPos - secondBomb;
                }
            }

        }

    }

}
