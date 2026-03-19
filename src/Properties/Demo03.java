package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        //1、创建集合
        Properties prop=new Properties();

        //2、读取本地Properties文件里的数据
        FileInputStream fos=new FileInputStream("a.properties.txt");
        prop.load(fos);
        fos.close();

        //3、打印集合
        System.out.println(prop);
    }
}
