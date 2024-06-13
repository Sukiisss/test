/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author keso9013
 */
import java.util.Random;

public class Mastermind {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        String[] colours = {"Red", "Orange", "Yellow", "Green", "Blue"};

        String[] secretCode = new String[4];
        
        for (int i = 0; i < secretCode.length; i++) {
            int randomColours = random.nextInt(colours.length);
            secretCode[i] = colours[randomColours];
        }
    }
        
    System.out.println("Enter your guess (four colours separated by spaces):");
    String[] guess = new String[4];

    for (int i = 0; i < guess.length; i++) {
        guess[i] = scan.nextLine();
    }
        
    int correctPositions = 0;
    for (int i = 0; i < secretCode.length; i++) {
        if (guess[i].equals(secretCode[i])) {
            correctPositions++;
        }
    }
}
