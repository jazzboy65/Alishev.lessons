package AdvancedJava.multithreading; //Урок 28. Прерывание потоков

/**
 * Механиз прерывания - из одного потока прерывается второй поток,
 * например из потока main()
 *
 * Для прерывания потока используется метод interrupt(), вызывается до thread.join()
 *
 * Также для прерывания потока необходимо использовать проверку было ли вызвано прерывание потока:
 * if(Thread.currentThread().isInterrupted()) {
 *                         System.out.println("Thread was interrupted");
 *                         break;
 *                     }
 *
 *
 */

import java.util.Random;

public class InterruptingThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1000000000; i++) {
                    if(Thread.currentThread().isInterrupted()) {
                        System.out.println("Thread was interrupted");
                        break;
                    }

                    Math.sin(random.nextDouble());
                }
            }
        });

        System.out.println("Starting thread");

        thread1.start();

        thread1.interrupt();
        thread1.join();

        Thread.sleep(1000);


        System.out.println("Thread has finished");
    }
}
