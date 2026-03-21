package A02Thread;

public class MyRun implements Runnable {
    @Override
    public void run() {
        //书写要执行的代码
        for (int i = 0; i < 100; i++) {

            //获取到当前线程的对象
            /**
             * Thread thread = Thread.currentThread();
             * 将这行代码合并到下面的代码当中
             * 也就是链式编程
             */

            System.out.println(Thread.currentThread().getName()+"Hello World");

        }
    }

}
