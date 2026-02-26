package TreeMap;

import java.util.TreeMap;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * TreeMap集合:
         * 需求2:
         * 键:学生对象
         * 值:籍贯
         * 要求:按照学生年龄的升序进行排列，年龄一样的按照姓名字母进行排列，相同的姓名年龄视为同一个人
         */
        //1、创建集合
        TreeMap<Student, String> map = new TreeMap<>();

        //2、创建三个学生对象
        Student s1 = new Student("John", 18);
        Student s2 = new Student("Jane", 19);
        Student s3 = new Student("Jack", 20);

        //3、添加元素
        map.put(s1, "安徽");
        map.put(s2, "上海");
        map.put(s3, "南京");

        //4、打印集合
        System.out.println(map);
    }
}
