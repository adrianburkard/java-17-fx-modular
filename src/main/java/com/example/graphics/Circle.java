package com.example.graphics;

public class Circle extends Shape {

    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    double computeArea() {
        return (radius * radius * Math.PI);
    }

    @Override
    double computeCircumference() {
        return (2 * radius * Math.PI);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

}
