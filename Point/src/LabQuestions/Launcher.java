package LabQuestions;

import static LabQuestions.Point.euclideanDistance;

public class Launcher
{
    public static void main(String[] args) {
        // Creating two point objects (2,1) and (6,4)
        Point point1 = new Point(2, 1);
        Point point2 = new Point(6, 4);

        // Update the second point as (8, 5)
        point2.setX(8);
        point2.setY(5);

        // Display points
        System.out.println("Point 1:");
        point1.display();
        System.out.println("Point 2:");
        point2.display();

        // Find Euclidean distance between these points
       double distance = euclideanDistance(point1, point2);
        System.out.println("Euclidean distance between the points: " + distance);
    }
}
