package ThreadSafe;

public class MyThread extends Thread {

    //表示这个类的所有对象，都共享ticket数据
    static int tick=0;

    //锁对象要是唯一的
    //static Object obj=new Object();

    @Override
    public void run() {
        while (true) {

            //同步代码块
            /**
             * MyThread.class表示:
             * 表示当前字节码文件对象
             */
            synchronized (MyThread.class) {
                if(tick < 100) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    tick++;
                    System.out.println(getName()+"正在卖"+tick + "买票");
                }else  {
                    break;
                }
            }
        }
    }
}
