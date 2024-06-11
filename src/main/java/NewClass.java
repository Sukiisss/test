/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author keso9013
 */
public class Mastermind {
    String [] colours = {Red, Orange, yellow, Green, Blue};

    Scanner scan = new scanner(System.in)
    System.out.println("Make a guess");

    int count = 0;
    for (int i = 0; i < colours.length; i++)
        {
            if (colours[i] == number)
            {
                count++;
            }
        }
    System.out.println("That colour appears " + count + " times.");
}


public class Mastermind {
    public static void main(String[] args) {
        String[] colours = {"Red", "Orange", "Yellow", "Green", "Blue"};

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your guess (four colours separated by spaces):");
    String guess = scan.nextLine();

    String colour1 = guess.substring(0, guess.indexOf(" "));
    guess = guess.substring(guessInput.indextOf (" ") + 1);
    String colour2 = guess.substring(0, guess.indexOf(" "));
    guess = guess.substring(guess.indexOf(" ") + 1);
    String colour3 = guess.substring(0, guess.indexOf(" "));
    String colour4 = guess.substring(guess.indexOf(" ") + 1);

    int correctColours = 0;
    int correctPositions = 0;

    String[] guessColours = {colour1, colour2, colour3, colour4};

    for (int i = 0; i < guessColours.length; i++) {
        String colour = guessColours[i];
        for (int j = 0; j < colours.length; j++) {
            if (colours[j].equals(colour)) {
                correctColour++;
                if (i == j) {
                    correctPositions++;
                }
                break;
            }
        }
    }

    System.out.println("Correct colours : " + correctColours);
    System.out.println("Correct positions: " + correctPositions);
    }
}


