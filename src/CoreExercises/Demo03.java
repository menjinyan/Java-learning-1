package CoreExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo03 {

    public static void main(String[] args) {
/**
 * 班级里有N个学生
 * 要求：
 * 被点到的学生不会再被点到。
 * 但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。
 */

//1、定义集合
        ArrayList<String> list = new ArrayList();

        //2、添加数据
        Collections.addAll(list, "范闲", "范建", "范统", "杜子瞻", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰");

        //创建一个临时的集合，用来存放已经被点到学生的名字
        ArrayList<String> list1 = new ArrayList();

        //外循环表示轮数
        for (int i = 1; i <= 10; i++) {
            System.out.println("----第" + i + "轮点名结束了----");
            //3、获取集合的长度
            int count = list.size();
            //4、随机点名
            Random rand = new Random();
            //内循环中没一轮随机抽取的过程
            for (int k = 0; k < count; k++) {
                int index = rand.nextInt(list.size());
                String name = list.remove(index);
                list1.add(name);
                System.out.println(name);
            }
            //此时表示第一轮点名已经结束
            list.addAll(list1);
            list1.clear();
        }

    }
}
