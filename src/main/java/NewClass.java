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

    String[] colours = {"Red", "Orange", "Yellow", "Green", "Blue"};
    String[] secretCode = new String[4];

    Scanner scan = new Scanner(System.in);

    public Mastermind() {
        generateSecretCode();
        playGame();
    }
}

public void generateSecretCode() {
    Random random = new Random();
    for (int i = 0; i < secretCode.length; i++) {
        int randomLine = random.nextInt(colours.length);
        secretCode[i] = colours[randomIndext];
    }
}
