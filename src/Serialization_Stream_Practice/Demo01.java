package Serialization_Stream_Practice;

import java.io.*;
import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        /**
         * 需求:
         * 有多个自定义对象序列化到文件中，但是对象的个数不能确定，该如何操作
         */

        //1、序列化多个对象
        Student s1=new Student("zhangsan",23,"北京");
        Student s2=new Student("lisi",24,"南京");
        Student s3=new Student("wangwu",25,"合肥");

        ArrayList<Object> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(list);

        oos.close();
    }
}
