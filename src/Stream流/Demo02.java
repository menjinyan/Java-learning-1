package Stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * 单列集合：default Stream<E> stream()                       Collection 中的默认方法
         * 双列集合：无                                               无法直接使用 stream 流
         * 数组：public static <T> Stream<T> stream(T[] array)       Arrays 工具类中的静态方法
         * 一堆零散数据：public static<T> Stream<T> of(T... values)    Stream 接口中的静态方法
         */

        //1、单列集合获取Stream流
        ArrayList list = new ArrayList();
        Collections.addAll(list,"a","b","c","d","e");
        /*
        //获取到流水线，把集合当中的数据放到流水线上
        Stream<String> stream = list.stream();
        //再使用终结方法打印流水线上的所以数据
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        */
        list.stream().forEach(s->System.out.println(s));
    }
}
