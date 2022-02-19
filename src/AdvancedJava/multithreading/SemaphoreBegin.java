package AdvancedJava.multithreading; //Урок 26. Класс Semaphore

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Класс Semaphore используется когда есть ресурс, и много потоков используют этот ресурс
 * Класс используется тогда, когда мы хотим ограничить доступ к этому ресурсу
 *
 * Semaphore(*) - (*) количество разрешений для потоков (сколько потоков одновременно могут писать данные
 *
 * Методы:
 * *.release() - отпускает одно из разрешений (Semaphore(*)), когда в потоке перестаем использовать ресурс
 * ОБЯЗАТЕЛЬНО ОБОРАЧИВАТЬ В БЛОК finally() -
 * Пример:
 * semaphore.acquire();
 *         try {
 *             doWork();
 *         } finally {
 *             semaphore.release();
 *         }
 *
 * *.acquire() - когда начинаем взаимодействовать с ресурсом
 * *.availablePermits() - возвращает количество свободных разрешений (Semaphore(*))
 */

public class SemaphoreBegin {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);

        Connection connection = Connection.getConnection();

        for (int i = 0;i < 200;i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);

    }
}
// Singleton
class Connection {
    private static final Connection connection = new Connection(); // - (Он же Singleton, не больше одного объекта класса)
    private int connectionsCount;
    private Semaphore semaphore = new Semaphore(10);

    private Connection () { //Запрещаем пользователям создавать объекты этого класса

    }

    public static Connection getConnection() {
        return connection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        } finally {
            semaphore.release();
        }
    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
            connectionsCount++;
            System.out.println(connectionsCount);
        }

        Thread.sleep(5000);

        synchronized (this) {
            connectionsCount--;
        }
    }
}
