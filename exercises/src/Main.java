import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 2 Salary calculator

        float salary;
        System.out.println("Write your salary: ");
        salary = scan.nextFloat();
        float needs = salary * 0.5f;
        float thingsWeWant = salary * 0.3f;
        float savings = salary * 0.2f;

        System.out.println("Yo should assign your salary in the following things: ");
        System.out.println("needs = $" + needs);
        System.out.println("thing we want = $" + thingsWeWant);
        System.out.println("savings = $" + savings);
    }
}