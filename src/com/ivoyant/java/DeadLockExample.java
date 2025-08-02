class Demo {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void methodA() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread() + "acquired lock1");

            try {

                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());

            }

            synchronized (lock2) {
                System.out.println(Thread.currentThread() + "acquired lock2");
            }

        }
    }

    public void methodB() {
        synchronized (lock2) {
            System.out.println(Thread.currentThread() + "acquired lock2");

            try {

                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            synchronized (lock1) {
                System.out.println(Thread.currentThread() + "acquired lock1");
            }

        }
    }
}
public class DeadLockExample {
    public static void main(String[] args) {
        Demo d=new Demo();
        Thread t1= new Thread(()->d.methodA());
        Thread t2= new Thread(()->d.methodB());
        t1.start();
        t2.start();

    }
}