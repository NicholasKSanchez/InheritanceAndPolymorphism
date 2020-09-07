/*
 * Programmer: Nicholas Sanchez
 * Purpose: An abstract class that represents a 3D shape
 * File Name: Shape3D.java
 */
package MyShapes;

/**
 * An abstract class that represents a 3D Shape and implements the interface
 * Comparable
 */
public abstract class Shape3D implements Comparable {
    
    private Points3D center ; //the center of the 3D shape
    
    /**
     * Constructs a Shape3D object for the subclass being created that knows the
     * center of the shape
     * @param x x coordinate
     * @param y y coordinate
     * @param z z coordinate 
     */
    public Shape3D(int x, int y, int z)
    {
        center = new Points3D(x, y, z) ;
    }
    
    /**
     * Computes and returns the distance of the center of the shape from the 
     * origin
     * @return The distance of the center of a shape from the Origin
     */
    public double originDistance()
    {
        double distance ;
        
        distance = Math.sqrt(Math.pow(center.getX(), 2) 
                   + Math.pow(center.getY(), 2) + Math.pow(center.getZ(), 2)) ;
        return distance;
    }
    
    /**
     * An abstract method that computes and returns the surface area of a shape
     * @return the surface area of a shape
     */
    public abstract double surfaceArea() ; 
    
    /**
     * An abstract method that computes and returns the volume of a shape
     * @return The volume of the shape
     */
    public abstract double volume() ;
    
    /**
     * A method that compares two shape objects
     * @param otherObject the object that this is being compared to
     * @return 1 for less than, 0 for equal to, and -1 for greater than
     */
    public int compareTo(Object otherObject)
    {
        Shape3D other = (Shape3D) otherObject ;
        if(this.volume() < other.volume()) //if this is less than that
        {
            return 1 ;
        } else if(this.volume() > other.volume())//if this is greater than that
        {
            return -1 ;
        } else //they are equal
        {
            return 0 ;
        }
    }
    
    /**
     * returns the coordinates of the center for the shape
     * @return the coordinates of the center
     */
    public String toString()
    {
        return center.toString() ; //calls point3D toString
    }
}
