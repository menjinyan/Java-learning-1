package 引用数组的构造方法;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * 方法引用（数组的构造方法）
         * 格式
         * 数据类型 []::new
         * 目的：
         * 创建一个指定类型的数组
         * 需求：
         * 集合中存储一些整数，收集到数组当中
         */

        //1、创建集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5", "6", "7", "8", "9");
        Integer[] arr=list.stream()
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
