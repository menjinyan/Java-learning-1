package Properties;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        /**
         * properties作为map集合的操作
         */

        //1、创建集合
        Properties prop = new Properties();

        //2、添加数据
        prop.put("aaa", "bbb");
        prop.put("ccc", "ddd");
        prop.put("eee", "fff");
        FileOutputStream fos=new FileOutputStream("a.properties.txt");
        prop.store(fos,"test");
        fos.close();

      /*  BufferedWriter bw = new BufferedWriter(new FileWriter("a.properties.txt"));
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for(Map.Entry<Object, Object> entry : entries){
            Object key = entry.getKey();
            Object value = entry.getValue();
            bw.write(key + "=" + value);
            bw.newLine();
        }
        bw.close();

       */
    }
}
