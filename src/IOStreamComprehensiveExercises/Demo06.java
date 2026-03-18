package IOStreamComprehensiveExercises;

import java.io.*;
import java.nio.charset.Charset;

public class Demo06 {
    public static void main(String[] args) throws IOException {
        /**
         * 利用转换流按照指定字符编码写出
         */
        //1、创建转换流的对象

        /*
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("a.txt"), "GBK");
        osw.write("你好");
        osw.close();

         */
        FileWriter fw=new FileWriter("a.txt",Charset.forName("GBK"));
        fw.close();
    }
}
