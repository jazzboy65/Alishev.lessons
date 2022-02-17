package AdvancedJava.multithreading; //Урок 20. Пул потоков (Thread pool)

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * ExecutorService (сервис по выполнению) - пул потоков.
 * Пример инициализации:
 * ExecutorService executorService = Executors.newFixedThreadPool(*); * - количество потоков внутри
 *
 * Пример из жизни - Фабрика на которой работают рабочие(потоки), которые выполняют разные задания
 *
 * Методы Thread Pool:
 * 1)*.submit() - включение передачи заданий
 * 2)*.shutdown() - прекращение передачи заданий
 * 3)*.awaitTermination() - сколько ждать пока потоки выполнят все задания
 *
 * Пример из жизни 2: 2 работника(потоки) 5 коробок(заданий)
 */

public class ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i)); //Описываем ту логику которая будет выполняться в потоке
        }
        executorService.shutdown();
        System.out.println("All tasks submitted");

        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}

class Work implements Runnable {
    private final int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work " + id + " was completed");
    }
}