package WaitDnotiy;

public class Foodie extends Thread {
    @Override
    public void run() {
        /**
         * 1、循环
         * 2、同步代码块
         * 3、判断共享数据是否到了末尾(到了末尾)
         * 4、判断共享数据是否到了末尾(没有到末尾)
         */

        while(true){
            synchronized (Desk.look){
                if(Desk.counter==0){
                    break;
                }else{
                    //判断桌子上是否有面条

                    if(Desk.foodlog==0){
                        //如果没有就等待
                        try {
                            Desk.look.wait();  //让当前线程和锁进行绑定
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }else {
                        //把吃的总数-1
                        Desk.counter--;
                        //如果有就开吃
                        System.out.println("正在吃面条，还能再吃" + Desk.counter + "碗");
                        //吃完之后唤醒厨师继续做
                        Desk.look.notifyAll();

                        //修改桌子的状态
                        Desk.foodlog=0;
                    }


                }
            }
        }
    }
}
