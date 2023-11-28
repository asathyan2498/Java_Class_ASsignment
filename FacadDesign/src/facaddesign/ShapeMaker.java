/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facaddesign;

/**
 *
 * @author hp
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    /**
     * Constructs a ShapeMaker object and initializes instances of Circle, Rectangle, and Square.
     */
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    /**
     * Draws a circle using the stored Circle object.
     */
    public String drawCircle() {
       return circle.draw();
    }
    
    public String drawRectangle() {
       return rectangle.draw();
    }

    /**
     * Draws a square using the stored Square object.
     */
    public String drawSquare() {
        return square.draw();
    }
    
}
