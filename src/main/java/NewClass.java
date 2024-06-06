/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author keso9013
 */
public class Mastermind {

    private ArrayList<String[]> colourSoloutions;

    public Mastermind(String colours, int positions)
    {
        solutions = new ArrayList<>();
        generateSolutions(colours, new String(positions), 0);
        playGane();
    }
}
