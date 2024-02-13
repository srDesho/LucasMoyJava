import java.util.Scanner;

public class RPM {
    public static void main(String[] args) {
        // normal, low or high rpm
        System.out.println("Enter the number of respirations: ");
        Scanner scan = new Scanner(System.in);
        int respirations = scan.nextInt();

        if (respirations >= 12 && respirations <=20) {
            System.out.println("Respiration tase in normal range");
        } else if (respirations < 12) {
            System.out.println("Respiration tase in low range");
        } else {
            System.out.println("Respiration tase in high range");
        }
    }
}
