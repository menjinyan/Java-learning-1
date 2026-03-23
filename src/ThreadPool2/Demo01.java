package ThreadPool2;

import java.util.concurrent.*;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
         * (核心线程数量，最大线程数量，空闲线程最大存活时间，任务队列，创建线程工厂，任务的拒绝策略);
         * 参数一：核心线程数量 不能小于 0
         * 参数二：最大线程数 不能小于等于 0，最大数量 >= 核心线程数量
         * 参数三：空闲线程最大存活时间 不能小于 0
         * 参数四：时间单位 用 TimeUnit 指定
         * 参数五：任务队列 不能为 null
         * 参数六：创建线程工厂 不能为 null
         * 参数七：任务的拒绝策略 不能为 null
         */
        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                3,//核心线程数量 不能小于 0
                6,//最大线程数 不能小于等于 0，最大数量 >= 核心线程数量
                60,//空闲线程最大存活时间 不能小于 0
                TimeUnit.SECONDS,//时间单位 用 TimeUnit 指定
                new ArrayBlockingQueue<>(3),//任务队列 不能为 null
                Executors.defaultThreadFactory(),//创建线程工厂 不能为 null
                new ThreadPoolExecutor.AbortPolicy()//任务的拒绝策略 不能为 null
        );

    }
}
