/*
 * Programmer: Nicholas Sanchez
 * Purpose: To represent a Parallelepiped
 * File Name: Parallelepiped.java
 */
package MyShapes;

/**
 * A class that represents a Parallelepiped 
 */
public class Parallelepiped extends Shape3D {
    
    private double length ; // the length of the parallelepiped
    private double width ; // the width of the parallelepiped 
    private double height; // the hegiht of the parallelepiped 
    
    /**
     * Constructs a Parallelepiped Object
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     * @param l the length of the parallelepiped 
     * @param w the width of the parallelepiped 
     * @param h  the height of the parallelepiped 
     */
    public Parallelepiped (int x, int y, int z, double l, double w, double h)
    {
        super(x, y, z) ; //Calls the contructor of the super class
        length = l ;
        width = w ;
        height = h ;
    }
    
    /**
     * Computes the surface area of the parallelepiped 
     * @return the surface area
     */
    public double surfaceArea()
    {
        return 2 * (width * length + height * length + height * width)  ;
    }
    
    /**
     * Computes the volume of the parallelepiped 
     * @return The Volume
     */
    public double volume()
    {
        return width * height * length ;
    }
    
    /**
     * Creates a String with the name of the class, the coordinates, the length
     * , the width, and the height
     * @return the string created 
     */
    public String toString()
    {
        return "Parallelepiped " + super.toString() + " length: " + length 
                + " width: " + width + " hieght: " + height ;
    }
}
