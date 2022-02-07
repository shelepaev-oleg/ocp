package com.cyclicBarrierTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Данный класс показывает как работают четыре потока по очистке клетки в зоопарке.
 * Один поток - это один работник зоопарка.
 *
 * Если запустить данный код, то видно что будут запущены одни потоки до завершения других.
 * Т.е. нельзя добавить животных пока не очищены клетки, т.к. работники пострадают.
 */
public class LionPenManager {

    /**
     * Удалить животных из клетки
     */
    private void removeAnimals() { System.out.println("Removing animals"); }

    /**
     * Почистить клетку
     */
    private void cleanPen() { System.out.println("Cleaning the pen"); }

    /**
     * Добавить животных в клетку
     */
    private void addAnimals() { System.out.println("Adding animals"); }
    private void performTaskWrapper() {
        removeAnimals();
        cleanPen();
        addAnimals();
    }
    public static void performTask() {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            LionPenManager manager = new LionPenManager();
            for(int i=0; i < 4; i++)
                service.submit(() -> manager.performTaskWrapper());
        } finally {
            if(service != null) service.shutdown();
        }
    }
}
