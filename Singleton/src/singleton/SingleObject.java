/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author hp
 */
public class SingleObject {
     private static SingleObject instance = new SingleObject();

    // Make the constructor private so that this class cannot be instantiated
    private SingleObject() {}

    /**
     * Gets the only object available (singleton instance).
     * 
     * @return The singleton instance of the SingleObject class.
     */
    public static SingleObject getInstance() {
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello World!");
    }

    void setIdentifier(String value_1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getIdentifier() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
