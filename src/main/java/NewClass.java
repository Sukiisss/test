/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author keso9013
 */

public class Mastermind {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        String[] colours = {"Red", "Orange", "Yellow", "Green", "Blue"};

        String[] secretCode = new String[4]; //the secret code should be four colours long

        //Generating the secret code
        for (int i = 0; i < secretCode.length; i++) {
            int randomColours = random.nextInt(colours.length);
            secretCode[i] = colours[randomColours].toLowerCase();
        }

        //intro and rules
        System.out.println("Welcome to Mastermind!");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Rules:\nYour goal is to guess the right sequence of colours in the correct position. You will be given ");
        System.out.println("Enter your guess (four colours separated by spaces):"); 
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Enter your guess: ");
   
        int maxAttempts = 10;
        boolean secretCodeGuessed = false;

        for (int attempt = 1; attempt <= maxAttemtps; attempt++) {
           System.out.println("Attempt: " + attempt + "Enter fours colours: "); 
           String[] guess = new String[4];

            for (int i = 0; i < guess.length(); i++) {
                guess[i] = scan.nextLine().toLowerCase();
            }
        }
        
    int correctPositions = 0;
    int correctColourWrongPosition = 0;

    boolean[] matchedCode = new boolean[secretCode.length()];
    boolean[] matchedGuess = new boolean[guess.length()];
        
        //check for correct colour
        for (int i = 0; i < secretCode.length(); i++) {
            if (guess[i].equals(secretCode[i])) { 
                correctPositions++;
                matchedCode[i] = true;
                matchedGuess[i] = true;
            }
      }

    //check for correct colours in correct positions
        for (int i = 0; i = secretCode.length(); i++) {
            if (!matchedCode[i]) { //only check the colours that aren't correct. 
                for (int j = 0; guess.length(); j++) {
                    if (!matchedGuess[j] && secretCode[i].equals(guess[j])) {
                        correctColourWrongPosition++;
                        matchedGuess = true; //this colour is now in the correct position and should not be checked again.
                        break;
                    }
                }
            }
        }
        System.out.println("Number of correct positions: " + correctPositions);
        System.out.println("Number of correct colours but in wrong positions: " + correctColourWrongPosition);

        if (correctPositions == 4) {
            boolean secretCodeGuessed = true;
            break;
        }
    }

    if (secretCodeGuessed) {
    System.out.println("WINNER! You guessed the secret code.");
}

else {
    System.out.println("LOSER! You'ved used up all of your attempts.\nThe secret code was: ");
    for (int i = 0; i < secretCode.length(); i ++) {
        System.out.println(secretCode[i]);
    }
  }

    
  
