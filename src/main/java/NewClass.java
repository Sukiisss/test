/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author keso9013
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
import java.util.Random;

public class Mastermind {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        //Creates and array list of colours
        String[] colours = {"Red", "Orange", "Yellow", "Green", "Blue"};

        String[] secretCode = new String[4]; //the secret code should be four colours long

        //Generating the secret code from array
        for (int i = 0; i < secretCode.length; i++) {
            int randomColours = random.nextInt(colours.length);
            secretCode[i] = colours[randomColours].toLowerCase();
        }

        //intro, how to play, and rules
        System.out.println("Welcome to Mastermind!");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("How to play:\n1) Your goal is to crack the secret code with the right sequence of colours in the correct position.\n2) The secret code can INCLUDING DUPLICATE colours!");
        System.out.println("3) You will be given five colours to guess with a maximum of 10 attempts. Your guess will be four colours long.\n4) To enter your guess, you must type each colour on a seperate line and spell the colours correctly or else that guess won't be checked or counted properly.");
        System.out.println("5) You are not allowed to go back to a typed colour once on the previous new line, so be carful!\n Have fun!");
        System.out.println("----------------------------------------------------------------------------------------------------------");
     
   
        int maxAttempts = 10; //the users max attempts
        boolean secretCodeGuessed = false; //Mark to check if the user guessed the secret code

        //counts the number of attempts
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
           System.out.println("Attempt " + attempt + ": Enter fours colours from: red, orange, yellow, green, blue. ");
           String[] guess = new String[4];

            //collects the users guess
            for (int i = 0; i < guess.length; i++) {
                guess[i] = scan.nextLine().toLowerCase();//scan the users guess and converts it to lowercase
            }
         
    int correctPositions = 0; //Count of correct colours in the correct positions
    int correctColourWrongPosition = 0; //Count of correct colours but in the wrong position

    boolean[] matchedCode = new boolean[secretCode.length]; // This will track matched colour positions in the secret code 
    boolean[] matchedGuess = new boolean[guess.length]; //This will track matched colour positions in the users guess
        
        //check for correct colour
        for (int i = 0; i < secretCode.length; i++) {
            if (guess[i].equals(secretCode[i])) { 
                correctPositions++;
                matchedCode[i] = true; // Mark this colour position as matched with the secret code
                matchedGuess[i] = true; // Mark this colour position as matched in the users guess
            }
      }

    //check for correct colours in wrong positions
        for (int i = 0; i < secretCode.length; i++) {
            if (!matchedCode[i]) { // Should only check the colours that weren't matched after checking for correct positions.
                for (int j = 0; j < guess.length; j++) {
                    if (!matchedGuess[j] && secretCode[i].equals(guess[j])) {
                        correctColourWrongPosition++;
                        matchedGuess[i] = true; 
                        break; // Should stop after finding a match for this colour in the secret code
                    }
                }
            }
        }
        //Gives feedback to the user
        System.out.println("Number of correct positions: " + correctPositions);
        System.out.println("Number of correct colours but in wrong positions: " + correctColourWrongPosition);
        System.out.println("----------------------------------------------------------------------------------------------------------");

        //Checks if the user has guessed the secret code
        if (correctPositions == 4) {
            secretCodeGuessed = true;
            break; //Will stop the loop if the secret code is guessed correctly
        }
    }
    
        //Reveals the results/secret code
        if (secretCodeGuessed) {
            System.out.println("WINNER! You guessed the secret code.");
        }

        else {
            System.out.println("LOSER! You'ved used up all of your attempts.\nThe secret code was: ");
            for (int i = 0; i < secretCode.length; i ++) {
            System.out.println(secretCode[i]);
        }
      }
    }
  }
