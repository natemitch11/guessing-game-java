import java.util.Scanner;

public class ComputerGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer;
        int upperBound = 101;
        int lowerBound = 0;

        System.out.println("Please think of a number between 0 and 100");
        System.out.print("Do you have your number? (Y/N): ");
        String yesOrNo = input.nextLine();

        if (yesOrNo.equalsIgnoreCase("y")) {
            do {
                answer = (upperBound + lowerBound) / 2;
                System.out.print("Is your number " + answer + "? (Higher/Lower/Yes): ");
                String feedback = input.nextLine();
                if (feedback.equalsIgnoreCase("higher")) {
                    lowerBound = answer;
                } else if (feedback.equalsIgnoreCase("lower")) {
                    upperBound = answer;
                } else {
                    System.out.println("HA! I knew I could figure it out! Thanks for playing!");
                    break;
                }
            } while (true);
        } else {
            System.out.println("Ok! We can play another time!");
        }
    }
}
