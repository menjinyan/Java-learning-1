package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * 存储学生对象并遍历
         * 需求
         * 创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
         * 存储三个键值对元素，并遍历
         * 要求：同姓名，同年龄认为是同一个学生
         *
         * 核心点:
         * HashMap的键位置如果村粗的是自定义对象，需要重写hashCode和equals方法
         */

        //1、创建HashMap的对象
        HashMap<Student, String> hm = new HashMap<>();

        //2、创建三个学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhaoliu", 26);

        //3、添加元素
        hm.put(s1, "江苏");
        hm.put(s2, "贵州");
        hm.put(s3, "广西");
        hm.put(s4, "南昌");

        //4、遍历集合
        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("+++++++++++++");

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("+++++++++++++");
        hm.forEach(( student,  s)-> System.out.println(student + "=" + s)

        );
    }
}
