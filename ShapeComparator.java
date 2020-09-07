/*
 * Programmer: Nicholas Sanchez
 * Purpose: To compare two shape objects distance from the origin on a 3D plane
 * File Name: ShapeComparator.java
 */
package MyShapes;

import java.util.Comparator;

/**
 * A class that compares two objects based on their distance from the origin on
 * a 3D plane
 */
public class ShapeComparator implements Comparator {
    
    /**
     * A method that compare the distance from the origin of 
     * two objects and determines which is bigger
     * @param firstObject the first object being compared
     * @param secondObject the second object being compared
     * @return -1 if distance of first object is less than the second
     * 1 if the distance of the first object is greater than the second
     * 0 if equal
     */
    public int compare(Object firstObject, Object secondObject)
    {
        
        Shape3D object = (Shape3D) firstObject ;
        double originDist = object.originDistance() ;
        Shape3D objectTwo = (Shape3D) secondObject ;
        double originDist2 = objectTwo.originDistance() ;
        
        if(originDist < originDist2) 
        {
            return -1 ;
        } else if(originDist > originDist2)
        {
            return 1 ;
        } else
        {
            return 0 ;
        }      
    }
}
