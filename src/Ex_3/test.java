package Ex_3;

import java.util.Scanner;

public class test {
    //Test Class Scanner...
    static Scanner scan = new Scanner(System.in);
    
    //Test Class Method...
    //X-Coordinates...
    public static double xCoordinate(){
        double x;
        System.out.print("Enter the X-coordinates: ");
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Invalid entry. Try Again!");
        }
        x = scan.nextDouble();
        System.out.println();
        return x;
    }
    //Y-Coordinates...
    public static double yCoordinate(){
        double y;
        System.out.print("Enter the Y-coordinates: ");
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Invalid entry. Try Again!");
        }
        y = scan.nextDouble();
        System.out.println();
        return y;
    }
    
    public static void main(String[] args) {
        //Main method variables...
        double x,y;
        String point;
        x = xCoordinate();
        y = yCoordinate();
        Point xyAxis = new Point(x, y);
        System.out.println(xyAxis.axisPoint());
    }
    
}
