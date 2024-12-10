package Ex1;// package assignments.ex1;

import java.util.Objects;

/**
 * This class represents a simple solution for Ex1.
 * As defined here:
 * https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and
 * calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following
 * format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base),
 * “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */
public class Ex1 {
    int ans = -1;
    static String digits = "0123456789ABCDEFG";

    /**
     * Convert the given number (num) to a decimal representation (as int).
     * It the given number is not in a valid format returns -1.
     * 
     * @param num a String representing a number in basis [2,16]
     * @return
     */
    public static int number2Int(String num) {
        int ans = -1;

        String[] part = num.split("b");
        int base;
        if (part.length == 1) {
            return base = 10;
        } else {
            base = digits.indexOf(part[1]);
        }

        ans = 0;
        for (int i = 0; i < num.length() - 2; i++) {

            int value = digits.indexOf(num.charAt(i));
            int power = num.length() - 3- i;
            int result = value*(int) Math.pow(base,power);
            ans += result;
        }

        return ans;
    }

    /**
     * This static function checks if the given String (g) is in a valid "number"
     * format.
     * 
     * @param a a String representing a number
     * @return true iff the given String is in a number format
     */
    public static boolean isNumber(String a) {
        boolean ans = true;
        // add your code here
        if (a == null)
            return false;


        String[] parts = a.split("b");

        if (parts.length != 1 && parts.length != 2 ) {
            return false;
        }

        String base;
        if (parts.length == 1) {
            base = "A";
        } else {
            base = parts[1];

            if (base.length() != 1 && !digits.substring(2).contains(base)) {
                return false;
            }
        }


        String number = parts[0];
        if (Objects.equals(number, ""))
            return false;

        String digitsSub = digits.substring(0, digits.indexOf(base));
        for (int i = 0; i < number.length(); i++) {
            if (!digitsSub.contains(number.charAt(i) + "")) {
                return false;
            }
        }

      
        return ans;
    }

    /**
     * Calculate the number representation (in basis base)
     * of the given natural number (represented as an integer).
     * If num<0
     * or base is not in [2,16] the function should return "" (the empty
     * String).
     * 
     * @param num  the natural number (include 0).
     * @param base the basis [2,16]
     * @return a String representing a number (in base) equals to num, or an empty
     *         String (in case of wrong input).
     */
    public static String int2Number(int num, int base) { // int2Number(5, 2) => "101b2"
        String ans = "";
        // add your code here

     
        int result = num;
        String top = "";
        while (result != 0) {
            top = result % base + top;
            result = result / base;
        }

        ans = top + "b" + base;
        ////////////////////
        return ans;
    }

    /**
     * Checks if the two numbers have the same value.
     * 
     * @param n1 first number
     * @param n2 second number
     * @return true iff the two numbers have the same values.
     */
    public static boolean equals(String n1, String n2) {
        boolean ans = true;
        // add your code here
        ans = number2Int(n1) == number2Int(n2);

        ////////////////////
        return ans;
    }

    /**
     * This static function search for the array index with the largest number (in
     * value).
     * In case there are more than one maximum - returns the first index.
     * Note: you can assume that the array is not null and is not empty, yet it may
     * contain null or none-valid numbers (with value -1).
     * 
     * @param arr an array of numbers
     * @return the index in the array in with the largest number (in value).
     *
     */
    public static int maxIndex(String[] arr) {
        int ans = 0;
        // add your code here
        int maximum = 0;
        for (int i = 0; i <= arr.length; i++) {
            int help = number2Int(arr[i]);
            if (maximum < help) {
                help = maximum;
                ans = i;
            }
        }

        return ans;
    }
}