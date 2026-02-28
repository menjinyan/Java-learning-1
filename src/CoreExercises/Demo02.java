package CoreExercises;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
        //1、创建集合
        ArrayList<Integer> list = new ArrayList<>();
        //2、添加数据
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);
        //3、打乱集合中的数据
        Collections.shuffle(list);
        //System.out.println(list);
        //4、从List集合中随机抽取0或1
        Random rand = new Random();
        int index = rand.nextInt(list.size());
        int number = list.get(index);
        System.out.println(number);
        //5、创建两个集合分别存储女生和男生的名字
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList, "范闲", "范建", "范统", "杜子瞻", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰");
        Collections.addAll(girlList, "杜琦燕", "袁明媛", "李猷", "田蜜蜜");

        //6、判断是从boyList中抽取的还收从girlList中抽取的
        if (number == 1) {
            int boyIndex = rand.nextInt(boyList.size());
            String boyName = boyList.get(boyIndex);
            System.out.println(boyName);
        } else {
            int girlIndex = rand.nextInt(girlList.size());
            String girlName = girlList.get(girlIndex);
            System.out.println(girlName);
        }
    }
}
