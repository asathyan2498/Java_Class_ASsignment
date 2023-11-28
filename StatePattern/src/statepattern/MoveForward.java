/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statepattern;

/**
 *
 * @author hp
 */
public class MoveForward extends State {
   
    /**
     * Default constructor for the MoveForward class. Initializes the name and subState attributes.
     * The name is set to "Move Forward" and subState is set to "Accelerate" by default.
     */
    MoveForward() {
        this.name = "Move Forward";
        this.subState = "Accelerate";
    }
  
    /**
     * Handles the action of pressing the right pedal a specific number of times when in the Move Forward state.
     * The behavior depends on the number of times the pedal is pressed and the current subState.
     * 
     * @param numOfTimesPressed The number of times the right pedal is pressed.
     * @return true if the right pedal is pressed according to the specified conditions,
     * triggering a transition to a different state; false otherwise, with an error message printed.
     */
    public Boolean pressRightPedal(int numOfTimesPressed) {
        Boolean move = false;
        switch (numOfTimesPressed) {
            case 2:
                // Transition between Accelerate and Decelerate states
                if (this.subState != "Accelerate" && this.subState != "Decelerate") {
                    System.out.println("Error: Can only press Right Pedal twice when in Accelerate or Decelerate States.\nUnable to move.");
                } else if (this.subState == "Accelerate") {
                    System.out.println("Transitioning from Accelerate State to Decelerate State...");
                    this.subState = "Decelerate";
                } else {
                    System.out.println("Transitioning from Decelerate State to Accelerate State...");
                    this.subState = "Accelerate";
                }
                break;
            case 3:
                // Transition from Decelerate to At Rest state
                if (this.subState != "Decelerate") {
                    System.out.println("Error: Can only press Right Pedal thrice when in Decelerate State.\nUnable to move.");
                } else {
                    System.out.println("Transitioning from Decelerate State to At Rest State...");
                    this.subState = null;
                    move = true;
                }
                break;
            default:
                System.out.println("Error: Must press Right Pedal twice or thrice when in Move Forward State.\nUnable to move.");
                break;
        }
        return move;
    }

    /**
     * Handles the action of pressing the right pedal for a specific duration when in the Move Forward state.
     * The behavior depends on the duration of the pedal press and the current subState.
     * 
     * @param numOfSecondsPressed The number of seconds the right pedal is pressed.
     */
    protected void pressRightPedalForTime(int numOfSecondsPressed) {
        switch (numOfSecondsPressed) {
            case 3:
                // Transition between Constant Speed and Decelerate states
                if (this.subState != "Decelerate" && this.subState != "Constant Speed") {
                    System.out.println("Error: Can only press Right Pedal for 3 seconds when in Constant Speed or Decelerate States.\nUnable to move.");
                } else if (this.subState == "Decelerate") {
                    System.out.println("Transitioning from Decelerate State to Constant Speed State...");
                    this.subState = "Constant Speed";
                } else {
                    System.out.println("Transitioning from Constant Speed State to Decelerate State...");
                    this.subState = "Decelerate";
                } 
                break;
            case 5:
                // Transition between Accelerate and Constant Speed states
                if (this.subState != "Accelerate" && this.subState != "Constant Speed") {
                    System.out.println("Error: Can only press Right Pedal for 5 seconds when in Constant Speed or Accelerate States.\nUnable to move.");
                } else if (this.subState == "Accelerate") {
                    System.out.println("Transitioning from Accelerate State to Constant Speed State...");
                    this.subState = "Constant Speed";
                } else {
                    System.out.println("Transitioning from Constant Speed State to Accelerate State...");
                    this.subState = "Accelerate";
                }
                break;
            default:
                System.out.println("Error: Must press Right Pedal for 3 or 5 seconds when in Move Forward State.\nUnable to move.");
                break;
        }
    }
}
