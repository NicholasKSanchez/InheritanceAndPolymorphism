/*
 * Programmer: Nicholas Sanchez
 * Purpose: To test the Shapes Hierarchy 
 * File Name: ShapeTester.java
 */
package MyShapes;

import java.util.Arrays;

/**
 * A class that tests Point3D, Shape3D, and the shapes classes 
 */
public class ShapeTester {
    
    public static void main(String[] args)
    {
        Shape3D shapes[] = {new Sphere(2, 5, 8, 14),
                            new Cone (-5, 4, -1, 11, 15),
                            new Cylinder(3, 7, -5, 12, 14),
                            new Parallelepiped(7, 16, 9, 19, 9, 13)} ;
        
        ShapeComparator compare = new ShapeComparator() ;
        
        for(int index = 0 ; index < shapes.length ; index++)
        {
            System.out.println(shapes[index].toString() 
                               + " Surface Area: " 
                               + shapes[index].surfaceArea()) ;
        }
        System.out.println("");
        Arrays.sort(shapes);
        
        for(int index = 0 ; index < shapes.length ; index++)
        {
            System.out.println(shapes[index].getClass().getName()
                               + ", Volume: " + shapes[index].volume()) ;
        }
        System.out.println("");
        Arrays.sort(shapes, compare) ;
        
        for(int index = 0 ; index < shapes.length ; index++)
        {
            System.out.println(shapes[index].getClass().getName()
                               + ", Distance from Origin: " 
                               + shapes[index].originDistance()) ;
        }
        
        
        
    }
    
}
