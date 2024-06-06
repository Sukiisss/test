/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author keso9013
 */
public class Mastermind {
    private String playerName;
    private String secretCode;
    private static end int codeLength = 4;
    private static end int maxAttempts = 10;
    private int attpemtsLeft;

    public game(String playerName)
    {
        this.playerName = playerName;
    }

    public void start()
    {
        generateSecretCode();
        attemptsLeft = maxAttempts;
        System.out.println("Hello, " + playerName + "! Try to guess the hidden code!");
        System.out.println("You will have " + maxAttempts + " attempts.");

        Scanner scan = new scanner(System.in);

        while(attemptsLeft > 0)
            {
                System.out.println("Enter a guess (4 colours separated by spaces): ");
                String userGuess = scan.nextLine();
                evaluateGuess(userGuess);
            }
        System.out.println("Game over! The hidden code was: " + secretCode);
    }
}
