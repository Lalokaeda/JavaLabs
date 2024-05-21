package javaapp.lr12;


public class Task4 {
public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(()->{
                System.out.println(Thread.currentThread().getName()+": "
                                    +1);
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
        });

        Thread t2 = new Thread(()->{
                System.out.println(Thread.currentThread().getName()+": "
                                    +2);
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
        });

        Thread t3 = new Thread(()->{
                System.out.println(Thread.currentThread().getName()+": "
                                    +3);
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
        });
    
        Thread t4 = new Thread(()->{
                System.out.println(Thread.currentThread().getName()+": "
                                    +4);
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
        });

        Thread t5 = new Thread(()->{
                System.out.println(Thread.currentThread().getName()+": "
                                    +5);
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
        });

        Thread t6 = new Thread(()->{
                System.out.println(Thread.currentThread().getName()+": "
                                    +6);
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
        });

        Thread t7 = new Thread(()->{
                System.out.println(Thread.currentThread().getName()+": "
                                    +7);
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
        });

        Thread t8 = new Thread(()->{
                System.out.println(Thread.currentThread().getName()+": "
                                    +8);
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
        });

        Thread t9 = new Thread(()->{
                System.out.println(Thread.currentThread().getName()+": "
                                    +9);
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
        });

        Thread t10 = new Thread(()->{
                System.out.println(Thread.currentThread().getName()+": "
                                    +10);
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
        });

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        t5.start();
        t5.join();
        t6.start();
        t6.join();
        t7.start();
        t7.join();
        t8.start();
        t8.join();
        t9.start();
        t9.join();
        t10.start();
        t10.join();
}
}
