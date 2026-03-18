package Serialization_Stream_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1、创建反序列化流的对象
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("a.txt"));

        //2、读取数据
        ArrayList<Student> list=(ArrayList<Student>) ois.readObject();
        for (Student student : list) {
            System.out.println(student);
        }
        ois.close();

    }
}
