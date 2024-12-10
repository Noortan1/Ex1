package Ex1;//package assignments.ex1;
import java.util.Scanner;

/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    static String digits = "123456789ABCDEFG";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2="", quit = "quit"; 
        
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();
            if (!num1.equals("quit")) {
                // add your code here
                boolean lal = Ex1.isNumber(num1);
               int ans= Ex1.number2Int(num1);
               System.out.println("num1= " + num1 +" is number: " + lal + ", value= " + ans );
                System.out.println("Enter a string as number#2 (or \"quit\" to end the program):");
                boolean nan = Ex1.isNumber(num2);
                int answer= Ex1.number2Int(num2);
                System.out.println("num1= " + num2 +" is number: " + nan + ", value= " + answer );
               System.out.println("Enter a string as number#2 (or \"quit\" to end the program):");
               System.out.println("Enter a base for output: (a number [2,16] \n");
               int base = sc.nextInt();
               int hebur = ans+answer;
               String Hebur= Ex1.int2Number(hebur,base );

                System.out.println( num1 + " + " + num2 + "=" + Hebur );
                int multiplication=ans*answer;
                System.out.println( num1 + " * " + num2 + "=" + multiplication);




            }


        }

        System.out.println("quiting now...");

        sc.close();
    }
}