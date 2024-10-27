package Figures;

import service.Shape;

public class Triangle implements Shape {

    private double high;
    private double base;

    public Triangle(double high, double base) {
        this.high = high;
        this.base = base;
    }

    @Override
    public double getArea() {
        return 0.5 * high * base;
    }
}


