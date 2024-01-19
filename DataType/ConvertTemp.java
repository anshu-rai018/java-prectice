// Write a Java program to convert temperature from Fahrenheit to Celsius degrees.

import java.util.Scanner;
public class ConvertTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a Degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = ((5 * (fahrenheit - 32.0))/9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + "in Celsius");

    }

}
