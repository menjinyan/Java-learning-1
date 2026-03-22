package WaitanDontify;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * 需求:利用阻塞队列完成生产者和消费者(等待唤醒机制)的代码
         *
         * 细节:
         * 生产者和消费者必须使用同一个阻塞队列
         */
        ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<String>(1);

        //创建线程的对象，并把阻塞队列放进去
        Cook c=new Cook(queue);
        Foodie f=new Foodie(queue);

        //开启线程
        c.start();
        f.start();

    }
}
