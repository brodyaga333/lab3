package com.brodyaga.lab3;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Точка входа: запускает сравнительный тест производительности.
 */
public class Main {
    public static void main(String[] args) {
        int runs = 2000;
        String[] actions = {"add", "get", "remove"};

        System.out.printf("%-10s %-10s %-20s %-20s%n",
                "Action", "Runs", "ArrayList (ns)", "LinkedList (ns)");

        for (String action : actions) {
            long timeArray = PerformanceComparison.measure(new ArrayList<>(), runs, action);
            long timeLinked = PerformanceComparison.measure(new LinkedList<>(), runs, action);
            System.out.printf("%-10s %-10d %-20d %-20d%n",
                    action, runs, timeArray, timeLinked);
        }
    }
}
