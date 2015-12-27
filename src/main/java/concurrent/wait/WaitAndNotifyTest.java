package concurrent.wait;

public class WaitAndNotifyTest {
    static Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new T1());
        Thread t2 = new Thread(new T2());
        t1.start();
        t2.start();
    }

    static class T1 implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    sleep(100);
                    System.out.println("A");
                    try {
                        //先唤醒其他正在等待此对象monitor的线程，然后在释放锁。要不然先释放锁，
                        //其他对象也没法拿到锁
                        lock.notify();
                        System.out.println("A2");
                        lock.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }

    static class T2 implements Runnable {

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    sleep(100);
                    System.out.println("B");
                    try {
                        //先唤醒其他正在等待此对象monitor的线程，然后在释放锁。要不然先释放锁，
                        //其他对象也没法拿到锁
                        lock.notify();
                        System.out.println("B2");
                        //调用wait方法，就是交出对象的monitor控制权，并且线程处于休眠期
                        lock.wait();
                        System.out.println("B3");//不会执行到
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
