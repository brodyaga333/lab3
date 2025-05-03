package com.brodyaga.lab3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты для метода measure().
 */
class PerformanceComparisonTest {

    @Test
    void measureAddDoesNotThrow() {
        assertDoesNotThrow(() ->
                PerformanceComparison.measure(new ArrayList<>(), 100, "add")
        );
        assertDoesNotThrow(() ->
                PerformanceComparison.measure(new LinkedList<>(), 100, "add")
        );
    }

    @Test
    void measureGetDoesNotThrow() {
        assertDoesNotThrow(() ->
                PerformanceComparison.measure(new ArrayList<>(), 100, "get")
        );
        assertDoesNotThrow(() ->
                PerformanceComparison.measure(new LinkedList<>(), 100, "get")
        );
    }

    @Test
    void measureRemoveDoesNotThrow() {
        assertDoesNotThrow(() ->
                PerformanceComparison.measure(new ArrayList<>(), 100, "remove")
        );
        assertDoesNotThrow(() ->
                PerformanceComparison.measure(new LinkedList<>(), 100, "remove")
        );
    }

    @Test
    void measureUnknownActionThrows() {
        assertThrows(IllegalArgumentException.class, () ->
                PerformanceComparison.measure(new ArrayList<>(), 10, "foobar")
        );
    }
}
