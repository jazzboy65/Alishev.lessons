package AdvancedJava.multithreading; //Урок 27. Взаимная блокировка (Deadlock)

/**
 * Класс ReentrantLock() помогает избежать ненужной вложенности:
 * for (int i = 0; i < 10000; i++) {
 * <p>
 * synchronized (account1) {
 * synchronized (account2) {
 * //
 * Account.transfer(account1, account2, random.nextInt(100));
 * }
 * }
 * }
 *
 * Deadlock - состояние, когда потоки ждут друг друга, но не отдают свои lock
 *
 * Способы избежать deadlock:
 * !) Не забирать lock в разных порядках!
 * 2) Использовать ReentrantLock() и его метод tryLock()
 *
 * Методы+:
 * tryLock() - для ожидания лока на протяжении определенного времени
 */

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Deadlock {
    public static void main(String[] args) throws InterruptedException {
        Runner1 runner1 = new Runner1();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner1.firstThread();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner1.secondThread();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner1.finished();

    }
}

class Runner1 {
    private Account account1 = new Account();
    private Account account2 = new Account();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void takeLocks(Lock lock1,Lock lock2) throws InterruptedException {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;

        while (true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken) {
                    return;
                }

                if (firstLockTaken) {
                    lock1.unlock();
                }

                if (secondLockTaken) {
                    lock2.unlock();
                }
            }

            Thread.sleep(1);
        }
    }

    public void firstThread() {
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            try {
                takeLocks(lock1,lock2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Account.transfer(account1, account2, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }


    public void secondThread() {
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            try {
                takeLocks(lock2,lock1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Account.transfer(account2, account1, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void finished() {
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("Total balance " + (account1.getBalance() + account2.getBalance()));
    }
}

class Account {
    private int balance = 10000;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Account account1, Account account2, int amount) {
        account1.withdraw(amount);
        account2.deposit(amount);
    }
}
