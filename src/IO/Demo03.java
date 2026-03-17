package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        /**
         *方法签名	功能说明
         * void write(int b)	                    一次写一个字节数据
         * void write(byte[] b)	                    一次写一个字节数组数据
         * void write(byte[] b, int off, int len)	一次写一个字节数组的部分数据
         *
         * 参数一:
         * 数组
         *
         * 参数二:
         * 起始索引  0
         *
         * 参数三:
         * 个数     3
         */

        //1、创建对象
        FileOutputStream fos=new FileOutputStream("a.txt");

        //2、写出数据
        //fos.write(68);
        //fos.write(98);


       byte[] bytes={23,45,67,89};
        /*
          fos.write(bytes);
        */

        fos.write(bytes,1,2);
        //3、释放数据
        fos.close();
    }
}
