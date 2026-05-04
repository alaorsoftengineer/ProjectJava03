
import java.util.Random;
import java.util.Scanner;

public class Main {
     static void main(String[] args) {

      // NUMBER GUESSING GAME

         Random random = new Random();
         Scanner scanner = new Scanner(System.in);

         int guess;
         int attempts = 0;
         int randomNumber = random.nextInt(1, 11);

         System.out.println("Number Guessing Game");
         System.out.print("Guess a Number between 1-10");

         do{
             System.out.print("Enter a Guess: ");
             guess = scanner.nextInt();
             attempts++;

         }while (guess != randomNumber);

         System.out.println("You have won! 🤩");


        scanner.close();



    }
}