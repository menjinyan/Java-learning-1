package 字符打印流;

import java.io.PrintStream;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * 打印流什么时候用呢?
         */

        /**
         * 获取打印流的对象，此打印流在虚拟机启动的时候，由虚拟机创建，默认指向控制台
         * 特殊的打印流，系统中的输出流
         */
        PrintStream ps=System.out;

        /**
         * 调用打印流中的方法 println
         * 写出数据，自动换行，自动刷新
         */
        ps.println("123");
    }
}
