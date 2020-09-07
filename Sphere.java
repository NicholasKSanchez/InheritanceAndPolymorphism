/*
 * Programmer: Nicholas Sanchez
 * Purpose: To represent a Sphere
 * File Name: Sphere.java
 */
package MyShapes;

/**
 * A class that represents a Sphere
 */
public class Sphere extends Shape3D {
    
    private double radius ; //the radius of the sphere
    
    /**
     * constructs a sphere object with x, y, z coordinates and a radius 
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     * @param r the radius
     */
    public Sphere(int x, int y, int z, double r)
    {
        super(x, y, z) ; //call the construcotr of the super class
        radius = r ;
    }
    
    /**
     * Computes the surface area of the sphere
     * @return the surface area
     */
    public double surfaceArea()
    {
        return 4 * Math.PI * Math.pow(radius, 2) ;
    }
    
    /**
     * Computes the volume of the sphere
     * @return the volume
     */
    public double volume()
    {
        return (4/(double) 3) * Math.PI * Math.pow(radius, 3) ;
    }
    
    /**
     * Creates a string consisting of the class name, coordinates of the center
     * and the radius
     * @return the string that is created 
     */
    public String toString()
    {
        return "Sphere " + super.toString() + " radius: " + radius;
    }
}
