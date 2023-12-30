/* solution 1
public class findCircleAreaAndPerimeter {
       // Define a constant for the  radius of the circle
        private static final double radius = 7.5;

        public static void main (String[]args){
        // Calculate  the perimeter of the circle using the constant radius
        double perimeter = 2 * Math.PI * radius;

        // Calculate the area of the circle using the constant radius
        double area = Math.PI * radius * radius;

        //print the calculated perimeter and area
        System.out.println(" Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
    }
*/

// Solution 2
import  java.util.Scanner;

public class findCircleAreaAndPerimeter{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner io = new Scanner(System.in);

        //Prompt the user to input the radius of the circle
        System.out.println( " Input the radius of the circle: ");

        //read and store the input radius
        double radius = io.nextDouble();

        // Calculate and print the perimeter of the circle
        System.out.println("Perimeter is = " + (2 * radius * Math.PI));

        // Calculate and print the area of the  circle
        System.out.println("Area is = " + (Math.PI * radius * radius));
      }
    }


