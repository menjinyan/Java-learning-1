package 线程练习01;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * 微信中的抢红包也用到了多线程。
         * 假设：100 块，分成了 3 个包，现在有 5 个人去抢。
         * 其中，红包是共享数据。
         * 5 个人是 5 条线程。
         * 打印结果如下：
         * XXX 抢到了 XXX 元
         * XXX 抢到了 XXX 元
         * XXX 抢到了 XXX 元
         * XXX 没抢到
         * XXX 没抢到
         */
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();

        t1.setName("A");
        t2.setName("B");
        t3.setName("C");
        t4.setName("D");
        t5.setName("E");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
