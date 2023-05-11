package com.bean;

public class Shape {
    private Circle circle;
    private Triangle triangle;
    private Rectangle rectangle;

    public Shape() {
    }

    public Shape(Circle circle, Triangle triangle, Rectangle rectangle) {
        this.circle = circle;
        this.triangle = triangle;
        this.rectangle = rectangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
    void display(){
        triangle.display();
        circle.display();
        rectangle.display();
    }
}
