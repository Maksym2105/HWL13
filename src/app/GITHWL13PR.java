package app;

import Figures.Circle;
import Figures.Square;
import Figures.Triangle;
import service.Shape;

import static service.ShapeSum.getTotalShapeSum;

public class GITHWL13PR {
    public static void main(String[] args) {

        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(5, 9);
        Square square = new Square(6);

        Shape shapes [] = new Shape[]{circle, triangle, square};

        System.out.println("Figures square total sum : " + getTotalShapeSum(shapes));





    }
}
