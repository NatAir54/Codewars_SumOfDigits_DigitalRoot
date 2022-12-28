package digits;

/*
* Digital root is the recursive sum of all the digits in a number.
* Given n, take the sum of the digits of n. If that value has more than one digit,
* continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
* Example: 493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
 */

import java.util.Scanner;

public class DigitsRunner {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        int number = Math.abs((int)input.nextDouble());
        System.out.println(digitalRoot(number));
    }

    public static int digitalRoot(int number) {
        int sum = number;
        if (sum > 9) {
            String stringValue = Integer.toString(number);
            char[] charArray = stringValue.toCharArray();
            sum = Character.getNumericValue(charArray[0]);
            for (int i = 1; i < charArray.length; i++) {
                sum += Character.getNumericValue(charArray[i]);
            }
            if (sum > 9) {
                sum = digitalRoot(sum);
            }
        }
        return sum;
    }


}
