package AdvancedJava.multithreading; //Урок 24. Класс CountDownLatch

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CountDownLatch(зашёлка обратного отсчёта) - CountDownLatch(*) - (*) - указывается количество отсчётов до открытия
 * Работает без синхронизации потоков
 *
 * Методы CountDownLatch:
 * *.countDown() - дикрементирует переменную указанную в CountDownLatch(*) (*)
 * *.await() - пока есть число !=0 в CountDownLatch(*) поток дальше не идёт
 */

public class CountDownLatchBegin {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.submit(new Processor(i,countDownLatch));
        }
        executorService.shutdown();

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            countDownLatch.countDown();

        }
    }
}

class Processor implements Runnable {
    private CountDownLatch countDownLatch;
    private int id;

    public Processor(int id,CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread with id " + id + " proceeded");
    }
}
