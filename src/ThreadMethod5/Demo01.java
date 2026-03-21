package ThreadMethod5;

public class Demo01 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * public final void join()    插入线程/插队线程
         *
         */
        MyThread t = new MyThread();
        t.setName("MyThread");
        t.start();

        /**
         * 表示把这个线程插入到当前线程之前
         * t表示MyThread
         * 当前线程:main线程
         */
        t.join();

        //执行在main线程中的
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程 + i");
        }
    }
}
