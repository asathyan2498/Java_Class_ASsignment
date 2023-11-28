/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statepattern;

/**
 *
 * @author hp
 */
public class MoveBackward extends State {

    /**
     * Default constructor for the MoveBackward class. Initializes the name and subState attributes.
     * The name is set to "Move Backward" and subState is set to "Accelerate" by default.
     */
    MoveBackward() {
        this.name = "Move Backward";
        this.subState = "Accelerate";
    }
    
    /**
     * Handles the action of pressing the left pedal a specific number of times when in the Move Backward state.
     * The behavior depends on the number of times the pedal is pressed and the current subState.
     * 
     * @param numOfTimesPressed The number of times the left pedal is pressed.
     * @return true if the left pedal is pressed according to the specified conditions,
     * triggering a transition to a different state; false otherwise, with an error message printed.
     */
    protected Boolean pressLeftPedal(int numOfTimesPressed) {
        Boolean move = false;
        switch (numOfTimesPressed) {
            case 1:
                // Transition between Constant Speed and Decelerate states
                if (this.subState != "Decelerate" && this.subState != "Constant Speed") {
                    System.out.println("Error: Can only press Left Pedal once when in Constant Speed or Decelerate States.\nUnable to move.");
                } else if (this.subState == "Decelerate") {
                    System.out.println("Transitioning from Decelerate State to Constant Speed State...");
                    this.subState = "Constant Speed";
                } else {
                    System.out.println("Transitioning from Constant Speed State to Decelerate State...");
                    this.subState = "Decelerate";
                }
                break;
            case 2:
                // Transition between Accelerate and Decelerate states
                if (this.subState != "Decelerate" && this.subState != "Accelerate") {
                    System.out.println("Error: Can only press Left Pedal twice when in Accelerate or Decelerate States.\nUnable to move.");
                } else if (this.subState == "Decelerate") {
                    System.out.println("Transitioning from Decelerate State to Accelerate State...");
                    this.subState = "Accelerate";
                } else {
                    System.out.println("Transitioning from Accelerate State to Decelerate State...");
                    this.subState = "Decelerate";
                }
                break;
            case 3:
                // Transition from Decelerate to At Rest state
                if (this.subState != "Decelerate") {
                    System.out.println("Error: Can only press Left Pedal thrice when in Decelerate State.\nUnable to move.");
                } else {
                    System.out.println("Transitioning from Decelerate State to At Rest State...");
                    this.subState = null;
                    move = true;
                }
                break;
            default:
                System.out.println("Error: Must press Left Pedal once, twice, or thrice when in Move Backward State.\nUnable to move.");
                break;
        }
        return move;
    }

    /**
     * Handles the action of pressing the left pedal for a specific duration when in the Move Backward state.
     * The behavior depends on the duration of the pedal press and the current subState.
     * 
     * @param numOfSecondsPressed The number of seconds the left pedal is pressed.
     */
    protected void voidPressLeftPedalForTime(int numOfSecondsPressed) {
        // Check if the pedal is pressed for 3 seconds in Accelerate or Constant Speed states
        if (numOfSecondsPressed != 3) {
            System.out.println("Error: Can only press Left Pedal for 3 seconds when in Accelerate or Constant Speed States to move.\nUnable to move.");
            return;
        }
        // Check if the object is in Accelerate or Constant Speed states
        if (this.subState != "Accelerate" && this.subState != "Constant Speed") {
            System.out.println("Error: Can only press Left Pedal for 3 seconds when in Accelerate or Constant Speed States.\nUnable to move.");
            return;
        }
        // Transition between Accelerate and Constant Speed states
        if (this.subState == "Accelerate") {
            System.out.println("Transitioning from Accelerate State to Constant Speed State...");
            this.subState = "Constant Speed";
            return;
        }
        System.out.println("Transitioning from Constant Speed State to Accelerate State...");
        this.subState = "Accelerate";
    }
}
