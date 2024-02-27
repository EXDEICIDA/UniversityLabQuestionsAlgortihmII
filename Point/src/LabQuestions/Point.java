package LabQuestions;

public class Point
{
    //Objectives for the class point
    /*
    - Define a Point class with:
	Two attributes: x and y
	One constructor method to construct a point at given coord (x, y) values
	Get/set methods
	Display method

Write a main method that
-	creates two point objects (2,1) and (6,4)
-	update the second point as (8, 5)
-	display points
-	finds Euclidean distance between these points.
     */
    private double x;
    private double y;

    public  Point (double x,double y)
    {
       this.x = x;
       this.y = y;

    }

    // Getters and setters for x and y attributes


    public double getX() {
        return x;
    }
    public void setX(double x)
    {
        this.x = x;

    }
    public double getY()
    {
        return x;
    }
    public void setY(double y)
    {
        this.y = y;
    }

    public void display ()
    {
        System.out.println("(" + x + ", " + y + ")");

    }

    // Method to calculate Euclidean distance between two points
    public static double euclideanDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
    }


}
