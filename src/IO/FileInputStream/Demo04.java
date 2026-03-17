package IO.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        /**
         *
         */

        //1、创建对象
        FileInputStream fis=new FileInputStream("D:\\\\Movie\\\\movie.mp4");
        FileOutputStream fos=new FileOutputStream("Java-learning-1\\copy.mp4");

        //2、拷贝
        int b;
        while((b=fis.read())!=-1){
            fos.write(b);
        }
        fos.close();
        fis.close();
    }
}
