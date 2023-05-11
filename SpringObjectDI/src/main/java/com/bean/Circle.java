package com.bean;

public class Circle {
    private int radius;
    private Point center;

    public Circle() {
    }

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
    void display(){
        System.out.println("********Circle*******");
        System.out.println("Radius: "+getRadius());
        System.out.println("Center: "+getCenter().getX()+","+getCenter().getY());
    }
}
