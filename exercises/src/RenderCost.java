import java.util.Enumeration;
import java.util.Scanner;

public class RenderCost {
    public static void main(String[] args) {
        // build a calculator to calculate the cost of rendering.
        // The variables are:
        // price per minute
        // number of minutes to render
        Scanner scan = new Scanner(System.in);
        double pricePerMinute = 0.05;
        System.out.println("Enter the number of minutes you want render");
        double numberOfMinutes = scan.nextDouble();
        double totalPrice = pricePerMinute * numberOfMinutes;

        System.out.println("You must pay = $" + totalPrice);
    }
}
