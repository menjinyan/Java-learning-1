package Stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Demo08 {
    public static void main(String[] args) {
        /**
         * distinct        元素去重，依赖(hashCode和equals方法)
         * concat          合并a和b两个流为一个流
         *
         * 注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
         * 注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "张无忌", "张无忌", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"大帅哥","大美女");

        //list.stream().distinct().forEach((s)->System.out.println(s));
        Stream.concat(list.stream(),list2.stream()).forEach((s)->System.out.println(s));


    }
}
