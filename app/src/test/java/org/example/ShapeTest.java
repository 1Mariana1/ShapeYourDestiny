package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShapeTest {

    private static final double DELTA = 0.001;

    @Test
    void testCircle() {
        Circle circle = new Circle(5);

        assertEquals(78.5398, circle.getArea(), DELTA);
        assertEquals(31.4159, circle.getPerimeter(), DELTA);
    }

    @Test
    void testRectangle() {
        Rectangle rectangle = new Rectangle(4, 6);

        assertEquals(24, rectangle.getArea(), DELTA);
        assertEquals(20, rectangle.getPerimeter(), DELTA);
        assertEquals(4, rectangle.numberOfSides());
    }

    @Test
    void testSquare() {
        Square square = new Square(4);

        assertEquals(16, square.getArea(), DELTA);
        assertEquals(16, square.getPerimeter(), DELTA);
        assertEquals(4, square.numberOfSides());
    }

    @Test
    void testRightTriangle() {
        RightTriangle triangle = new RightTriangle(3, 4);

        assertEquals(6, triangle.getArea(), DELTA);
        assertEquals(12, triangle.getPerimeter(), DELTA);
        assertEquals(3, triangle.numberOfSides());
    }

    @Test
    void testIsoscelesRightTriangle() {
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(5);

        assertEquals(12.5, triangle.getArea(), DELTA);
        assertEquals(5 + 5 + Math.sqrt(50), triangle.getPerimeter(), DELTA);
        assertEquals(3, triangle.numberOfSides());
    }


}
