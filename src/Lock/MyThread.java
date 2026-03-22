package Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{

    static int tick=0;
    static Lock lock=new ReentrantLock();

    @Override
    public void run() {
        while(true){
            //synchronized (MyThread.class){
            lock.lock();
            try {
                if(tick==100){
                    break;
                }else{

                        Thread.sleep(20);
                    tick++;
                    System.out.println(getName()+"正在卖"+tick + "买票");
                }
                // }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
