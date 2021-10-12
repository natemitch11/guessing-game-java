/*

A number-guessing game.

*/

import java.util.Scanner;
import java.lang.Math;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = (int) (Math.random() * 100);
        int guess;

        System.out.println("Please guess a number between 0 and 100");
        do {
            try {
                System.out.print("Your guess:");
                guess = input.nextInt();

                if (guess > 100 || guess < 0) {
                    System.out.println("Your Guess: " + guess);
                    System.out.println("Please enter a number between 0 and 100");
                } else if (guess > answer) {
                    System.out.println("The Number is Lower! Try again.");
                } else if (guess < answer) {
                    System.out.println("The Number is Higher! Try again.");
                } else {
                    System.out.println("Congratulations! the number was " + answer + " you win!");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number");
                input.next();
            }
        } while (true);
    }
}
