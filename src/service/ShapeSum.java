package service;

public class ShapeSum {

    public static double getTotalShapeSum(Shape[] shapes) {
        double totalSum = 0;
        for (Shape shape : shapes) {
            totalSum += shape.getArea();
        }
        return totalSum;
    }


    }



