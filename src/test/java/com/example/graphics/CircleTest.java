package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    public Circle circle;

    @BeforeEach
    public void setUp() {
        this.circle = new Circle(1,1,12.7);
    }

    @Test
    public void computeAreaTest() {
        assertEquals(circle.computeArea(), 506.707, 0.001);
    }

    @Test
    public void computeCircumferenceTest() {
        assertEquals(circle.computeCircumference(), 79.796, 0.001);
    }

}
