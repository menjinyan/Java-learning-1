package ThreadSafe2;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * 需求：
         *     某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
         *     用同步方法去完成
         */
        MyRunnable mr=new MyRunnable();
        Thread t1=new Thread(mr);
        Thread t2=new Thread(mr);
        Thread t3=new Thread(mr);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
