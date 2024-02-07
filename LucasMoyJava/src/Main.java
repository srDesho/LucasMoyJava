import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        /*
        System.out.println("Enter your age : ");
        String strAge = buffer.readLine();

        // Convert string to int
        Integer age = Integer.parseInt(strAge);

        if (age >= 18) {
            System.out.println("You're of legal age");
        } else {
            System.out.println("You're not of legal age");
        } */

        // Ejercicio1
        // Armar un programa que permita cargar 3 nros y mostrar cual es mayor y cual es menor
        System.out.println("enter first number: ");
        Integer n1 = loadNumber();

        System.out.println("enter second number: ");
        Integer n2 = loadNumber();

        System.out.println("enter third number: ");
        Integer n3 = loadNumber();

        // calculateMajor(n1, n2, n3);
        // calculateMinor(n1, n2, n3);
        // calculateAverage(n1, n2, n3);
        isOddOrEven(n1);
    }
    private static Integer loadNumber() throws IOException {
        InputStreamReader captureKeyboard = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(captureKeyboard);
        String strNumber = buffer.readLine();
        return Integer.parseInt(strNumber);
    }
    private static void calculateMajor(Integer n1, Integer n2, Integer n3){
        // major
        Integer major = n1;
        if ((n2 > major)) {
            major = n2;
        }
        if ((n3 > major)){
            major = n3;
        }
        System.out.println("Major Number is: " + major);
    }
    private static void calculateMinor(Integer n1, Integer n2, Integer n3) {
        Integer minor = n1;

        // minor
        if ((n2 < minor)) {
            minor = n2;
        }
        if ((n3 < minor)) {
            minor = n3;
        }
        System.out.println("Minor Number is: " + minor);
    }

    // 2. Build a program to load 3 numbers and display the average on the screen
    private static void calculateAverage(Integer n1, Integer n2, Integer n3) {
        Double average;
        average = (double) ((n1 + n2 + n3)/3.0); // is a cast
        System.out.println("The average is = " + average);
    }

    // 3. Build a program to load 1 number and display if odd or even (par o impar)
    private static void isOddOrEven(Integer n1) {

        if (n1%2 == 0) {
            System.out.println("Is Odd");
        } else {
            System.out.println("Is even");
        }
    }
}