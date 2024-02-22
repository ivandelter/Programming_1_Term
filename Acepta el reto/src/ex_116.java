import java.util.Scanner;

public class ex_116 {
    public static void main(String[] args){
        // https://aceptaelreto.com/problem/statement.php?id=335

        System.out.println("Escribe las veces que quieres que se imprima el mensaje");
        Scanner ask = new Scanner(System.in);
        int rounds = ask.nextInt();

        for(int i = 0; i < rounds; i++){
            System.out.println("Hola mundo.");
        }

    }
}
