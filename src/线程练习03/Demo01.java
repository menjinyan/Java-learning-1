package 线程练习03;



import java.util.ArrayList;
import java.util.Collections;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * 有一个抽奖池，该抽奖池中存放了奖励的金额，该抽奖池中的奖项为 {10,5,20,50,100,200,500,800,2,80,300,700};
         * 创建两个抽奖箱 (线程) 设置线程名称分别为 “抽奖箱 1”，“抽奖箱 2”
         * 随机从抽奖池中获取奖项元素并打印在控制台上，格式如下：
         * 每次抽的过程中，不打印，抽完时一次性打印 (随机)
         * 在此次抽奖过程中，抽奖箱 1 总共产生了 6 个奖项。
         * 分别为：10,20,100,500,2,300 最高奖项为 300 元，总计额为 932 元
         * 在此次抽奖过程中，抽奖箱 2 总共产生了 6 个奖项。
         * 分别为：5,50,200,800,80,700 最高奖项为 800 元，总计额为 1835 元
         * 抽奖箱1和抽奖箱2的奖项有重复的吗？
         * 如何保证抽奖过程的公平性？
         * 能否增加抽奖箱的数量？
         */
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,30,45,500);
        MyThread t1 = new MyThread(list);
        MyThread t2 = new MyThread(list);
        t1.setName("抽奖1");
        t2.setName("抽奖2");

        t1.start();
        t2.start();
    }
}
