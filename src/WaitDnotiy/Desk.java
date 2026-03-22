package WaitDnotiy;

public class Desk {
    /**
     * 控制生产者和消费者的执行
     *
     */

    /**
     * 是否有面条  0表示没有面条 1表示有面条
     */
    public static int foodlog = 0;

    //总个数
    public  static int counter =10;

    //锁对象
    public static Object look=new Object();

}
