package ar.edu.unq.po2.tp3;

public class Rectangle {

    private float coordinateX;
    private float coordinateY;
    private float height;
    private float width;

    private Point startingPoint;

    public Rectangle(Point point, float height, float width){
        this.startingPoint = point;
        this.height = height;
        this.width = width;
    }
}
