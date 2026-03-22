package WaitDnotiy;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * 需求：完成生产者和消费者（等待唤醒机制）的代码
         * 实现线程轮流交替执行的效果
         */

        //创建线程对象
        Cook c=new Cook();
        Foodie f=new Foodie();

        //给线程设置名字
        c.setName("厨师");
        f.setName("食客");

        //开启线程
        c.start();
        f.start();
    }



}
