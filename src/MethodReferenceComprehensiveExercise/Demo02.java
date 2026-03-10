package MethodReferenceComprehensiveExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * 需求：
         * 创建集合添加学生对象
         * 学生对象属性：name，age
         * 要求：
         * 获取姓名并放到数组当中
         * 使用方法引用完成
         */
        //1、创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2、添加元素
        list.add(new Student("zhangsan", 20));
        list.add(new Student("lisi", 30));
        list.add(new Student("wangwu", 40));

        //3、获取姓名并放到数组当中
        String[]name=list.stream()
                .map(Student::getName)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(name));
    }
}
