package 字符打印流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        /**
         * 字符打印流：
         * 构造方法
         * public Printwriter(Write/File/String)
         * 关联字节输出流/文件/文件路径
         * public Printwriter(String fileName,Charset charset)
         * 指定字符编码
         * public Printwriter(Write，boolean autoFlush) 自动刷新
         * public Printwriter(Write out,boolean autoFlush,String encoding)
         * 指定字符编码且自运
         * 成员方法：
         * public void write(int b)
         * 常规方法：规则跟之前一样，将指定的字节写出
         * public void println(Xxx xx)
         * 特有方法：打印任意数据，自动刷新，自动换行
         * public void print(Xxx xx)
         * 特有方法：打印任意数据，不换行
         * public void printf(string format, Object... args)
         * 特有方法：带有占位符的打印语句，不换
         */

        //1、创建字符打印流
        PrintWriter ps=new PrintWriter(new FileWriter("a.txt"), true);

        //2、写出数据
        ps.println("永远年轻");
        ps.print("你好");
        ps.println();
        ps.printf("你真年轻");

        //3、释放资源
        ps.close();
    }
}
