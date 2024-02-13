import java.util.Scanner;

public class RespirationPerMinute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Enter your activity level");
        System.out.println("1) Sedentary");
        System.out.println("2) Moderate");
        System.out.println("3) Active");
        int levelActivity = scan.nextInt();

        System.out.println("Enter your sex: ");
        System.out.println("1) Male");
        System.out.println("2) Female");
        int sex = scan.nextInt();
        boolean isMale = sex == 1;

        int maxFrequency;
        if (isMale) {
            maxFrequency = 220 - age;
        } else {
            maxFrequency = 226 - age;
        }

        System.out.println("Max frequency is: " + maxFrequency);

        float minRange = 0f;
        float maxRange = 0f;

        final int SEDENTARY = 1;
        final int MODERATE = 2;
        final int ACTIVE = 3;

        if (levelActivity == SEDENTARY) {
            minRange = maxFrequency * 0.5f;
        } else if (levelActivity == MODERATE) {
            minRange = maxFrequency * 0.6f;
        } else if (levelActivity == ACTIVE) {
            minRange = maxFrequency * 0.7f;
        }
        maxRange = maxFrequency * 0.85f;

        System.out.println("Your objective range of cardiac frequency is from "
            + minRange + " to " + maxRange + " heartbeat per minute.");
    }
}
