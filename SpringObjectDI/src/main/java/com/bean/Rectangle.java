package com.bean;

public class Rectangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Rectangle() {
    }

    public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }
    void display(){
        System.out.println("******Rectangle*********");
        System.out.println("Point A: "+getPointA().getX()+","+getPointA().getY());
        System.out.println("Point B: "+getPointB().getX()+","+getPointB().getY());
        System.out.println("Point C: "+getPointC().getX()+","+getPointC().getY());
        System.out.println("Point D: "+getPointD().getX()+","+getPointD().getY());
    }
}
