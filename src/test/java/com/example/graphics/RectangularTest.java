package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangularTest {

    public Rectangular rectangular;

    @BeforeEach
    public void setUp() {
        this.rectangular = new Rectangular(1,1,3.5, 4.5);
    }

    @Test
    public void computeAreaTest() {
        assertEquals(rectangular.computeArea(), 15.75, 0.001);
    }

    @Test
    public void computeCircumferenceTest() {
        assertEquals(rectangular.computeCircumference(), 16, 0.001);
    }

}
