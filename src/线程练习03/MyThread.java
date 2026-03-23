package 线程练习03;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
    ArrayList<Integer> list ;
    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    //线程1使用的集合
    static ArrayList<Integer>list1=new ArrayList<>();
    //线程2使用的集合
    static ArrayList<Integer>list2=new ArrayList<>();

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if(list.size()==0){
                    if("抽奖者1".equals(getName())){
                        System.out.println("抽奖箱1"+list1);
                    }else {
                        System.out.println("抽奖箱2"+list2);
                    }
                    break;
                }else{
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    if("抽奖者1".equals(getName())){
                        list1.add(prize);
                    }else {
                        list2.add(prize);
                    }
                   // System.out.println(getName()+"抽奖箱 2 又产生了一个" + prite + " 元大奖");
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
