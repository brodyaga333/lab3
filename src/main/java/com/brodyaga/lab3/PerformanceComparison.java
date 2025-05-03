package com.brodyaga.lab3;

import java.util.List;

/**
 * Сравнивает время выполнения операций add, get, remove
 * для ArrayList и LinkedList.
 */
public class PerformanceComparison {

    /**
     * Выполняет тест выбранной операции и возвращает время в наносекундах.
     *
     * @param list   коллекция (ArrayList или LinkedList)
     * @param runs   сколько раз запускать операцию
     * @param action действие над коллекцией: "add", "get", "remove"
     * @return время в нс
     */
    public static long measure(List<Integer> list, int runs, String action) {
        long start = System.nanoTime();
        switch (action) {
            case "add":
                for (int i = 0; i < runs; i++) {
                    list.add(i);
                }
                break;
            case "get":
                for (int i = 0; i < runs; i++) {
                    list.add(i);
                }
                for (int i = 0; i < runs; i++) {
                    list.get(i);
                }
                break;
            case "remove":
                for (int i = 0; i < runs; i++) {
                    list.add(i);
                }
                for (int i = 0; i < runs; i++) {
                    list.remove(0);
                }
                break;
            default:
                throw new IllegalArgumentException("Unknown action: " + action);
        }
        return System.nanoTime() - start;
    }
}
