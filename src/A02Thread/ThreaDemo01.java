package A02Thread;

public class ThreaDemo01 {
    public static void main(String[] args) {
        /**
         * 多线程的第二种启动方式
         * 自己定义一个类实现Runnable接口
         * 重写里面的run方法
         * 创建自己的类的对象
         * 创建一个Thread类的对象，并开启线程
         */

        //创建自己的测试类对象
        //表示多线程要执行的任务
        MyRun mr=new MyRun();

        //创建线程中的对象
        Thread t1=new Thread(mr);
        Thread t2=new Thread(mr);

        //给第二个线程去设置名字
        t1.setName("线程1");
        t2.setName("线程2");

        //开启线程
        t1.start();
        t2.start();
    }
}
