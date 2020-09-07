/*
 * Programmer: Nicholas Sanchez
 * Purpose: A class that represents a Cylinder
 * File Name: Cylinder.java
 */
package MyShapes;

/**
 * A class that represents a Cylinder
 */
public class Cylinder extends Shape3D {
    
    private double radius ; // the radius of the cylinder
    private double height ; // the height of the cylinder
    
    /**
     * Constructs a Cylinder object with an 3D coordinate, radius, and a height
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     * @param radius the radius of the cylinder
     * @param height  the height of the cylinder
     */
    public Cylinder(int x, int y, int z, double radius, double height)
    {
        super(x,y,z) ; //call the construcotr of the super class
        this.radius = radius ;
        this. height = height ;
        
    }
    
    /**
     * A method that calculates and returns the surface area
     * @return the surface area
     */
    public double surfaceArea()
    {
        return (2 * Math.PI * Math.pow(radius, 2)) 
                + (2 * Math.PI * radius * height) ;
    }
    
    /**
     * A method that calculates and returns the volume of a Cylinder
     * @return the volume
     */
    public double volume()
    {
        return Math.PI * Math.pow(radius, 2) * height ;
    }
    
    /**
     * A method that returns the name of the Class, the coordinates of the 
     * center the radius and the height as a string
     * @return a string with class name, coordinates, radius and height 
     */
    public String toString()
    {
        return "Cylinder " + super.toString() + " radius: " + radius 
                + " height: " +  height ;
    }
}
