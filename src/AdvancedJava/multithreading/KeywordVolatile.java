package AdvancedJava.multithreading; //Урок 17. Ключевое слово Volatile

import java.util.Scanner;

/**
 * Ключевое слово Volatile(подверженный изменению) используется когда данные делятся между
 * несколькими потоками. (один поток пишет в эту переменную другие потоки читают эту переменную)
 *
 * Volatile гарантирует когерентность(целостность) кэшей. Переменная с ключевым словом Volatile
 * не будет кэшироваться для каждого ядра, она всегда будет находиться в главной памяти
 *
 * !!!Когда один поток записывает в переменную, а другой читает из переменной нужно обязательно
 * использовать ключевое слово Volatile!!!
 *
 *
 */

public class KeywordVolatile {
    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();//Сканнер ожидает Enter - переход на новую строку

        myThread.shutdown();

    }
}

class MyThread1 extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shutdown() {
        this.running = false;
    }
}