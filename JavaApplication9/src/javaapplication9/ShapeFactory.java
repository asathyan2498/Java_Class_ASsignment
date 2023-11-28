/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author hp
 */

 public class ShapeFactory {

    /**
     * Gets a shape object based on the given shape type.
     * 
     * @param shapeType A string representing the type of shape to be created
     *                  (e.g., "CIRCLE", "RECTANGLE", "SQUARE").
     * @return A concrete implementation of the Shape interface based on the provided type.
     *         Returns null if the provided shapeType is not recognized.
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        // Returns null if the provided shapeType is not recognized.
        return null;
    
    }
}
