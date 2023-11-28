/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author hp
 */

public class Square implements Shape {

    /**
     * Draws a square by printing a message to the console.
     * This method is part of the Shape interface implementation.
     * It provides a specific behavior for drawing a square.
     * 
     * This method does not take any parameters, as the square's drawing
     * behavior is predefined and does not require additional input.
     */
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
