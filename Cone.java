/*
 * Programmer: Nicholas Sanchez
 * Purpose: To represent a Cone
 * File Name: Cone.java
 */
package MyShapes;

/**
 * A class that represents a Cone
 */
public class Cone extends Shape3D {
    
    private double radius ; // the radius of the cone
    private double height ; // the height of the cone
    
    /**
     * Constructs a Cone with an x, y, and z coordinate, a radius, and a height
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     * @param radius the radius
     * @param height  the height
     */
    public Cone (int x, int y, int z, double radius, double height)
    {
        super(x ,y, z) ; // call the constructor of the super class
        this.radius = radius ;
        this. height = height ;
    }
    
    /**
     * Computes the Surface Area of the Cone
     * @return the surface area
     */
    public double surfaceArea()
    {
        return Math.PI * radius * 
              (radius + (Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2))));
    }
     /**
      * Computes the Volume of the Cone
      * @return The Volume
      */
    public double volume()
    {
        return (Math.PI * Math.pow(radius, 2) * height) / 3 ;
    }
    
    /**
     * Creates a string with the class name, coordinates, radius, and height
     * @return the string
     */
    public String toString()
    {
        return "Cone " + super.toString() + " radius: " + radius 
                + " height: " + height ;
    }
}
