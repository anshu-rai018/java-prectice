import java.lang.*;
import java.util.Scanner;

public class ReadIntgerAndAddAllDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Inter the digit : ");
        int nums = input.nextInt();

        int firstDigit = nums % 10;
        int remainingNumber = nums / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + nums+ " is " + sum);


    }
}
