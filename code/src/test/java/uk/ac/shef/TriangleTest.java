package uk.ac.shef;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {

    @Test
    public void equilateralTest() {
        Triangle.Type result = Triangle.classify(10, 10, 10);
        assertEquals(Triangle.Type.EQUILATERAL, result);
    }

    @Test
    public void exceptionThrownWithInvalidTriangle() {
        InvalidTriangleException exception = assertThrows(InvalidTriangleException.class, () -> {
            Triangle.classify(0, 0, 0);
        });

        assertEquals("(0, 0, 0) is not a valid triangle", exception.getMessage());
    }

    @Test
    public void isocelesTest() {
        Triangle.Type result = Triangle.classify(5, 10, 10);
        assertThat(result, equalTo(Triangle.Type.ISOSCELES));
    }

}
