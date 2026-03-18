package FileReader;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        /**
         *public FileWriter(File file)          // 创建字符输出流关联本地文件
         * public FileWriter(String pathname)   // 创建字符输出流关联本地文件
         * public FileWriter(File file, boolean append)   // 创建字符输出流关联本地文件（可追加）
         * public FileWriter(String pathname, boolean append)   // 创建字符输出流关联本地文件（可追加）
         *
         * void write(int c)          // 写出一个字符
         * void write(String str)     // 写出一个字符串
         * void write(String str, int off, int len)  // 写出一个字符串的一部分
         * void write(char[] cbuf)     // 写出一个字符数组
         * void write(char[] cbuf, int off, int len)  // 写出字符数组的一部分
         *
         * public void close()   // 释放资源/关流
         *
         * '我' 25105
         */

        FileWriter fw = new FileWriter("a.txt",true);
        //fw.write("25105");

        //fw.write("你好啊");

        char[]chars={'b','c','d','e'};
        fw.write(chars);


        fw.close();
    }
}
