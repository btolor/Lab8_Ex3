
package Ex_3;

public class Point {
    
    //Private Variables...
    private double xCoordinate, yCoordinate;
    private String point;
    
    //Constructor...
    public Point(double xCoordinate,double yCoordinate) {  
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    //Point Class Methods...
    //Getters & Setters...
    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }
 
    //Point Class Process Methods...
    public String axisPoint(){
        String testPoint = "(" + String.valueOf(getxCoordinate()) +
                "," + String.valueOf(getyCoordinate()) +")";
        setPoint(testPoint);
        return getPoint();
    }
    
    
    
    
    
}
