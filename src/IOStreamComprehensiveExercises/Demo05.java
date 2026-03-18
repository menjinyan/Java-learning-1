package IOStreamComprehensiveExercises;

import java.io.*;
import java.nio.charset.Charset;
import java.util.InputMismatchException;

public class Demo05 {
    public static void main(String[] args) throws IOException {
        /**
         * 利用转换流按照指定编码字符流进行读取
         *
         */

        //1、创建对象并指定字符编码
       /* InputStreamReader isr=new InputStreamReader(new FileInputStream("src\\gbkfile.txt"));

        int ch;
        while((ch=isr.read())!=-1){
            System.out.println((char)ch);
        }
        isr.close();

        */

        //替代方案
        FileReader fr=new FileReader("src\\gbkfile.txt", Charset.forName("GBK"));
        int ch;
        while((ch=fr.read())!=-1){
            System.out.println((char)ch);
        }
        fr.close();

    }
}
