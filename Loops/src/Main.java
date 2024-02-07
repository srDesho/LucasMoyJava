public class Main {
    public static void main(String[] args) {
        // Display the first 100 prime numbers
        int number = 1;
        int counter = 0;
        int counterPrimes = 0;
        while (counter < 230){
            if (isPrime(number)){
                System.out.println( counter + 1 + ": " + number);
                counter++;
            }
            number++;
        }
    }
    private static Boolean isPrime(Integer number){
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
}