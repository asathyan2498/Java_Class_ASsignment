/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author hp
 */
public class Rectangle implements Shape {

    /**
     * Draws a rectangle by printing a message to the console.
     * This method is part of the Shape interface implementation.
     * It provides a specific behavior for drawing a rectangle.
     * No parameters are required for this method.
     */
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}