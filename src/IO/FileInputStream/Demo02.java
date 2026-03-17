package IO.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        /**
         *字节输入流的细节：
         * 创建字节输入流对象
         * 细节 1：如果文件不存在，就直接报错。
         * java为什么会这么设计呢?
         * 输出流:不存在，创建
         * 输入流:不存在，报错
         *
         *
         *
         * 读数据
         * 细节 1：一次读一个字节，读出来的是数据在 ASCII 上对应的数字
         * 细节 2：读到文件末尾了，read 方法返回 - 1。
         * 释放资源
         * 细节：每次使用完流之后都要释放资源
         */

        //1、创建对象
        FileInputStream fis=new FileInputStream("a.txt");

        //2、读取数据
        int b1=fis.read();

        //3、释放资源
        fis.close();
    }
}
