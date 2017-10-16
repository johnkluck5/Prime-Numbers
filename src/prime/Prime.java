/* John Kluck
johnkluck5@gmail.com */

import java.util.*;

public class Prime {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        int input, contFlag = 1, primeCounter = 0;
        int i = 0, x = 0;

        System.out.print("Enter an integer (2 or above): ");
        input = kbd.nextInt();
        //Checks for input to be greater than 1
        if (input < 2) {
            contFlag = 0;
            System.out.println("Not a valid number.");
        }
        //if input is greater than 1, continue
        if (contFlag == 1) {
            System.out.println("The prime numbers up to your integer are:");
            //establish outer loop to run inner and print primes
            for (i = 1; i <= input; i++) {
                primeCounter = 0;
                //establish inner loop to divide for primes
                for (x = i; x >= 1; x--) {
                    
                    if (i % x == 0) {
                        primeCounter++;
                    }
                }
                //if prime, print
                if (primeCounter == 2) {
                    System.out.println(i);
                }
            }
        }
        kbd.close();
    }
}