public class Exercise_7 {

    public static void main(String[] args) {

        int[] primes = new int[10];
        int count = 2;
        int saved = 0;

        while(saved < 10){
            boolean isPrime = true;
            for(int i = 2; i <= Math.floor(count / 2); i++){
                if(count % i == 0) isPrime = false;
            }
            if(isPrime){
                primes[saved] = count;
                saved++;
            }

            count++;
        }

        String result = "";
        for(int i = 0; i <= primes.length - 1; i++){
            result += primes[i] + ", ";
        }

        if(result.endsWith(", ")){
            result = result.substring(0, result.length() - 2);
        }

        System.out.println(result);

    }

}
