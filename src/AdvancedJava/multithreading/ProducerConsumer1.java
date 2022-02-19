package AdvancedJava.multithreading; //Урок 21. Паттерн producer-consumer (часть 1)

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Паттерн producer-consumer - производитель - потребитель - один или несколько потоков
 * производят что-то, один или несколько потоков потребляют это
 *
 * Пример из жизни: несколько пользователей обращаются к компьютеру с математическими задачами
 * (производитель) - компьютер решает задачи(потребитель)
 *
 * Методы put() и take() - являются потокобезопасными
 */

public class ProducerConsumer1 {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
    //ArrayBlockingQueue<>(*) - потокобезопасная очередь(можно обращаться из нескольких потоков без synchronised)
    //* - предельный размер, не может вырасти больше указанного числа

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }

    private static void produce() throws InterruptedException {
        Random random = new Random();

        while (true) {
            queue.put(random.nextInt(100));
        }
    }

    private static void consumer() throws InterruptedException {
        Random random = new Random();

        while (true) {
            Thread.sleep(100);

            if (random.nextInt(10) == 5) {
                System.out.println(queue.take());
                System.out.println("Queue size is " + queue.size());
            }
        }
    }
}
