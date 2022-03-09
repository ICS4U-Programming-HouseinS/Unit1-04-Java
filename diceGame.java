import java.util.Random;
import java.util.Scanner;

class diceGame {
  public static void main(String[] args) {
  
    //declares variables
    int userGuessInt = 0;
    int userNumGuess = 0;
    int userGuesses = 0;
  
    //instance of random class
    Random rand = new Random();
    int min = 1;
    int max = 6;
    int int_random = (int) Math.floor(Math.random() * (max - min + 1) + min);
  
    // creates scanner object
    Scanner myObj = new Scanner(System.in);
  
    while (true) {
      // gets user guess
      System.out.println("Guess a number between 1 and 6");
      String userGuessStr = myObj.nextLine();
    
      try {
        //convert string to int
        userGuessInt = Integer.parseInt(userGuessStr);
      } catch (NumberFormatException e) {
        userGuessInt = -1;
      }

      if (userGuessInt < 1 || userGuessInt > 6) {
        System.out.println("Invalid input");
      } else if (userGuessInt < int_random) {
        System.out.println("the number is greater than " + userGuessInt);
        userNumGuess = userNumGuess + 1;
      } else if (userGuessInt > int_random) {
        System.out.println("the number is less than " + userGuessInt);
        userNumGuess = userNumGuess + 1;
      } else {
        System.out.println("You are correct");
        System.out.println("It took you " + userNumGuess + " guess(es)");
        break;
      }
    }
  }
}