package Stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Demo06 {
    public static void main(String[] args) {
        /**
         * filter          过滤
         * limit           获取前几个元素
         * skip            跳过前几个元素
         *
         * 注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
         * 注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周驰诺", "张三丰","大帅哥");

        //filter          过滤 把张开头的进行过滤，其余数据过滤不变
        /*
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //如果返回true，表示当前数据留下
                //如果返回false，表示当前数据舍弃不要

                return s.startsWith("张");
            }
        }).forEach(s->System.out.println(s));

        list.stream()
                .filter(s->s.startsWith("张"))
                .filter(s->s.length()==3)
                .forEach(s->System.out.println(s));

        System.out.println("==========");

        System.out.println(list);

         */

        //limit           获取前几个元素
        //skip            跳过前几个元素
        list.stream().limit(3).forEach(s->System.out.println(s));
        System.out.println("==========");
        list.stream().skip(2).forEach(s->System.out.println(s));
    }
}
