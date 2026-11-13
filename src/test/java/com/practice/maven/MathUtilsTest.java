package com.practice.maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilsTest {
    @Test
    void addsTwoNumbers() {
        assertEquals(15, MathUtils.add(5, 10));
    }
}
