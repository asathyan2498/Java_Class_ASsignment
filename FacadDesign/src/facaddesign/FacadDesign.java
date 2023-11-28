
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facaddesign;

public class FacadDesign {

    /**
     * The main method demonstrates the Facade design pattern by creating a ShapeMaker object
     * and using its simplified interface to draw a circle, rectangle, and square.
     *
     * @param args The command-line arguments passed to the program. These are not used in this demo.
     */
    public static void main(String[] args) {

        // Create a ShapeMaker object
        ShapeMaker shapeMaker = new ShapeMaker();

        // Draw a circle using the simplified interface
        shapeMaker.drawCircle();

        // Draw a rectangle using the simplified interface
        shapeMaker.drawRectangle();

        // Draw a square using the simplified interface
        shapeMaker.drawSquare();
    }
}
