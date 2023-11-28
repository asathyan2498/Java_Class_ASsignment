/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statepattern;

/**
 *
 * @author hp
 */
public class AtRest extends State {
    
    /**
     * Default constructor for the AtRest class. Initializes the name and subState attributes.
     * The name is set to "At Rest" and subState is set to "None".
     */
    AtRest() {
        this.name = "At Rest";
        this.subState = "None";
    }
    
    /**
     * Handles the action of pressing the right pedal when in the At Rest state.
     * 
     * @param numOfTimesPressed The number of times the right pedal is pressed.
     * @return true if the right pedal is pressed once, triggering a transition to the
     * Move Forward state; false otherwise, with an error message printed.
     */
    public Boolean pressRightPedal(int numOfTimesPressed) {
        if (numOfTimesPressed != 1) {
            System.out.println("Error: Can only press Right Pedal once when in At Rest State.\nUnable to move.");
            return false;
        } else {
            System.out.println("Transitioning from At Rest State to Move Forward State...");
            return true;
        }
    }

    /**
     * Handles the action of pressing the left pedal for a specific duration when in the At Rest state.
     * 
     * @param numOfSecondsPressed The number of seconds the left pedal is pressed.
     * @return true if the left pedal is pressed for 5 seconds, triggering a transition to the
     * Move Backward state; false otherwise, with an error message printed.
     */
    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        if (numOfSecondsPressed != 5) {
            System.out.println("Error: Must press Right Pedal for 5 seconds when in At Rest State.\nUnable to move.");
            return false;
        } else {
            System.out.println("Transitioning from At Rest State to Move Backward State...");
            return true;
        }
    }
}