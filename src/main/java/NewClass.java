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
    
    System.out.println("Welcome to Mastermind!");
    System.out.println("----------------------------------------------------------------------------------------------------------");
    System.out.println("Rules:\nYour goal is to guess the right sequence of colours in the correct position. You will be given ");
    System.out.println("Enter your guess (four colours separated by spaces):"); 
    System.out.println("----------------------------------------------------------------------------------------------------------");
    System.out.println("Enter your guess: ");
   
        int maxAttempts = 10;
        boolean codeGuessed = false;

        for (int attempt = 1; attempt <= maxAttemtps; attempt++) {
           system.out.println("Attempt: " + attempt + "Enter fours colours: "); 
           String[] guess = new String[4];

            for (int i = 0; i < guess.length; i++) {
                guess[i] = scan.nextLine().toLowerCase();
            }
        }
        
    int correctPositions = 0;
    int correctColoursWrongPosition = 0;
        
    for (int i = 0; i < secretCode.length; i++) {
        if (guess[i].equals(secretCode[i])) {
            correctPositions++;
        }
      }
    System.out.println("Number of correct positions: " + correctPositions);
    }
  }
