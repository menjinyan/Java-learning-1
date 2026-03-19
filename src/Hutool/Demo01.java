package Hutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Demo01 {
    public static void main(String[] args) {
        /**
         *  FileUtil 类
         * file：根据参数创建一个 file 对象
         * touch：根据参数创建文件
         * writeLines：把集合中的数据写出到文件中，覆盖模式。
         * appendLines：把集合中的数据写出到文件中，续写模式。
         * readLines：指定字符编码，把文件中的数据，读到集合中。
         * readUtf8Lines：按照 UTF-8 的形式，把文件中的数据，读到集合中
         * copy：拷贝文件或者文件夹
         */

        /*
        File file = FileUtil.file("D:\\", "aaa", "bbb", "a.txt");
        System.out.println(file);
        File touch = FileUtil.touch(file);
        System.out.println(touch);

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        File file1 = FileUtil.writeLines(list, "D:\\a.txt", "UTF-8");
        System.out.println(file1);

         */

        /*
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        File file3 = FileUtil.appendLines(list, "D:\\a.txt", "utf-8");
        System.out.println(file3);

         */
        List<String> strings = FileUtil.readLines("D:\\a.txt", "UTF-8");
        System.out.println(strings);
    }
}
