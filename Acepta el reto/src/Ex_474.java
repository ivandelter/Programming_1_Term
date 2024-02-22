import java.util.Scanner;

public class Ex_474 {
    public static void main(String[] args){
        // Va a haber más de una ronda de jecutar prueba, asi que se tendra que ecuantas pruebas pida la pagina
        //System.out.println("Escribe cuantas rondas quieres hacer:");
        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt();

        // Esto va a ser cada prueba
        for (int i = 0; i < rounds; i++) {

            // La posicion en la que empieza la plaza (no se si es useless)
            int initialPos = 0;
            // Los metros recorridos
            int walked = 0;

            // Pedimos la posicion de Spiderman
            //System.out.println("Escribe la posicion de Spiderman (<10000):");
            int spidermanPos = sc.nextInt();

            // Pedimos las posiciones de la bomba
            //System.out.println("Escribe la posicion de la bomba 1 (<10000):");
            int firstBomb = sc.nextInt();
            //System.out.println("Escribe la posicion de la bomba 2 (<10000):");
            int secondBomb = sc.nextInt();

            // Si la pos de spiderman es mayor a la de las bombas
            if(spidermanPos > firstBomb && spidermanPos > secondBomb){

                // Si la primera bomba esta más cerca
                if(spidermanPos - firstBomb < spidermanPos - secondBomb){

                    // Si la primera bomba esta en una distancia mas grande que la segunda
                    if(firstBomb > secondBomb){

                        walked += (spidermanPos - firstBomb) + firstBomb - secondBomb;

                    }else{

                        walked += (spidermanPos - firstBomb) + secondBomb - firstBomb;

                    }

                } else{

                    // Si la segunda bomba esta en una distancia mas grande
                    if(secondBomb > firstBomb){

                        // Si la primera bomba esta en una distancia mas grande que la segunda
                        if(firstBomb > secondBomb){

                            walked += (spidermanPos - firstBomb) + firstBomb - secondBomb;

                        }else{

                            walked += (spidermanPos - secondBomb) + secondBomb - firstBomb;

                        }

                        walked += (spidermanPos - secondBomb) + secondBomb - firstBomb;

                    }else{

                        walked += (spidermanPos - secondBomb) + firstBomb - secondBomb;

                    }

                }

            } else if(firstBomb > spidermanPos && secondBomb < spidermanPos){

                // Ir a la primera bomba primero y despues a la segunda
                walked += (firstBomb - spidermanPos) + firstBomb - secondBomb;

            } else if(secondBomb > spidermanPos && firstBomb < spidermanPos){

                // Ir a la segunda bomba primero y despues a la primera
                walked += (secondBomb - spidermanPos) + secondBomb - firstBomb;

            } else{ // es este else useless y se podria juntar a la primera condicion en la que &&?

                // Coger qué bomba es la más cercana

                if(firstBomb > secondBomb){

                    walked += (spidermanPos - firstBomb) + firstBomb - secondBomb;

                }else{

                    walked += (spidermanPos - secondBomb) + secondBomb - firstBomb;

                }

            }

            System.out.println(walked);

        }

    }
}
