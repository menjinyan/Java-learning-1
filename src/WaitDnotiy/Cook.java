package WaitDnotiy;

public class Cook extends Thread{
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
                 }else {
                     //判断桌子上是否有食物
                     if(Desk.foodlog==1){
                         //如果有就等待
                         try {
                             Desk.look.wait();
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
                     }else{

                         //如果没有就制作食物
                         System.out.println("厨师做了一碗面");
                         //修改桌子上的食物状态
                         Desk.foodlog=1;
                         //叫醒等待的消费者开吃
                         Desk.look.notifyAll();
                     }


                 }
            }
        }
    }
}
