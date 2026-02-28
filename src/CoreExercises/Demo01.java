package CoreExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo01 {
    static void main() {
        /**
         * 班里有N个学生，学生属性:姓名，年龄，性别
         *
         * 实现随机点名器
         */

        //1、定义集合
        ArrayList<String> list = new ArrayList<>();

        //2、创建数据
        Collections.addAll(list, "张三", "李四", "王五", "赵六");

        //3、随机点名
        /**
         * Random random = new Random();
         int index = random.nextInt(list.size());
         String name = list.get(index);
         System.out.println(name);
         */

        //打乱(也是一种随机方式)
        Collections.shuffle(list);
        String names = list.get(0);
        System.out.println(names);
    }
}
