package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        /**
         *演示：字节输出流 FileOutputStream
         * 实现需求：写出一段文字到本地文件中。（暂时不写中文）
         * 实现步骤：
         * 创建对象
         * 写出数据
         * 释放资源
         */

        //直接在当前目录创建文件
        FileOutputStream fos=new FileOutputStream("a.txt");

        fos.write("65".getBytes());

        fos.close();

    }
}
