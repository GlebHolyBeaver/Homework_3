package lesson4;

public class MultiThread {

        private final Object mon = new Object();
        private volatile int currentNum = 1;
        final static int num = 5;

        public static void main(String[] args) {
            MultiThread w = new MultiThread();
            Thread t1 = new Thread(() -> {
                w.printA();
            });
            Thread t2 = new Thread(() -> {
                w.printB();
            });
            Thread t3 = new Thread(() -> {
                w.printС();
            });
            t1.start();
            t2.start();
            t3.start();
        }

        public void printA() {
            synchronized (mon) {
                try {
                    for (int i = 0; i < num; i++) {
                        while (currentNum != 1) {
                            mon.wait();
                        }
                        System.out.print("A");
                        currentNum = 2;
                        mon.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void printB() {
            synchronized (mon) {
                try {
                    for (int i = 0; i < num; i++) {
                        while (currentNum != 2) {
                            mon.wait();
                        }
                        System.out.print("B");
                        currentNum = 3;
                        mon.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    public void printС() {
        synchronized (mon) {
            try {
                for (int i = 0; i < num; i++) {
                    while (currentNum != 3) {
                        mon.wait();
                    }
                    System.out.print("С");
                    currentNum = 1;
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }
