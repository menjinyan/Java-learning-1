package 线程练习02;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
    ArrayList<Integer> list ;
    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if(list.size()==0){
                    break;
                }else{
                    Collections.shuffle(list);
                    int prite = list.remove(0);
                    System.out.println(getName()+"抽奖箱 2 又产生了一个" + prite + " 元大奖");
                }
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
