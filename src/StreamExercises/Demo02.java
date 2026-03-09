package StreamExercises;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * 创建一个 ArrayList 集合，并添加以下字符串，字符串中前面是姓名，后面是年龄
         * "zhangsan", 23
         * "lisi", 24
         * "wangwu", 25
         * 保留年龄大于等于 24 岁的人，并将结果收集到 Map 集合中，姓名为键，年龄为值
         */

        //1、创建一个 ArrayList 集合
        ArrayList<String> list = new ArrayList<>();

        //2、并添加以下字符串
        Collections.addAll(list,
                "zhangsan,23", "lisi,24", "wangwu,25");

        //3、保留年龄大于等于 24 岁的人
        Map<String, Integer> collect = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> Integer.parseInt(s.split(",")[1])
                ));
        System.out.println(collect);

        //4、并将结果收集到 Map 集合中，姓名为键，年龄为值


    }
}
