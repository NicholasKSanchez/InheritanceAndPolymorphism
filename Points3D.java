/*
 * Programmer: Nicholas Sanchez
 * Purpose: To represent a point in Three-Dimensional space
 * File Name: Point3D.java
 */
package MyShapes;

/**
 * A class that represents a point in Three-Dimensional space
 */
public class Points3D {
    
    private int x ; //the x coordinate 
    private int y ; //the y coordinate
    private int z ; //the z coordinate
    
    /**
     * construct a Point3D object that represents a point in 3D Space
     * @param x the coordinate on the x plane
     * @param y the coordinate on the y plane
     * @param z the coordinate on the z plane 
     */
    public Points3D(int x, int y, int z)
    {
        this.x = x ;
        this.y = y ;
        this.z = z ;
    }
    
    /**
     * A method that return the x coordinate 
     * @return the x coordinate 
     */
    public int getX()
    {
        return x ;
    }
    
    /**
     * A method that returns the y coordinate
     * @return the y coordinate
     */
    public int getY()
    {
        return y ;
    }
    
    /**
     * A method that returns the Z coordinate
     * @return the z coordinate 
     */
    public int getZ()
    {
        return z ;
    }
    
    /**
     * A method that returns the coordinates of the Point3D object
     * @return The string
     */
    public String toString()
    {
        return "Coordinates: " + x + ", " + y + ", " + z ;
    }
}
