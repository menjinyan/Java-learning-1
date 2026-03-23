package 线程练习02;

import 线程练习01.MyThread;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * 有一个抽奖池，该抽奖池中存放了奖励的金额，该抽奖池中的奖项为 {10,5,20,50,100,200,500,800,2,80,300,700};
         * 创建两个抽奖箱 (线程) 设置线程名称分别为 “抽奖箱 1”，“抽奖箱 2”
         * 随机从抽奖池中获取奖项元素并打印在控制台上，格式如下：
         * 每次抽出一个奖项就打印一个 (随机)
         * 抽奖箱 1 又产生了一个 10 元大奖
         * 抽奖箱 1 又产生了一个 100 元大奖
         * 抽奖箱 1 又产生了一个 200 元大奖
         * 抽奖箱 1 又产生了一个 800 元大奖
         * 抽奖箱 2 又产生了一个 700 元大奖
         */
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,30,45,500);
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("抽奖1");
        t2.setName("抽奖2");

        t1.start();
        t2.start();
    }
}
