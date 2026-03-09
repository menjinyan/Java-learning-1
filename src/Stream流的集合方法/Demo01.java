package Stream流的集合方法;

import java.util.*;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Demo01 {
    public static void main(String[] args) {
        /**
         * collect(Collector collector)        收集流中的数据，放到集合中（List Set Map）
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20", "张三丰-男-100", "张翠山-男-40");

        // 收集List集合当中：
        // 需求：
        // 我要把所有的男性收集起来
        List<String> newlist = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        //System.out.println(newlist);

        /**
         * 收集到set集合当中
         * 需求:
         * 我要把所有的男性收集起来
         */

        Set<String> collect = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(collect);

        /**
         * 收集map集合当中
         * 谁作为键，谁作为值
         * 我要把所有的男性收集起来
         * 键:姓名 值:年龄
         */
        Map<String, String> map = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> s.split("-")[2]
                ));

        System.out.println(map);
    }
}
