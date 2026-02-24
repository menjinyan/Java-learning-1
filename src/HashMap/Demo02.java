package HashMap;

import java.util.*;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * Map集合案例-统计投票人数
         * 需求
         * 某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是（A、B、C、D），每个学生只
         * 能选择一个景点，请统计出最终哪个景点想去的人数最多。
         */

        //1、需要让学生进行投票

        //定义一个数组，存储4个景点
        String[] arr = {"A", "B", "C", "D"};
        //利用随机数模拟88个同学的投票，并把投票的结果存储起来
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        //2、如果要统计的东西比较多，是不方便使用计数器思想的
        //我们可以定义map集合，利用集合进行统计
        HashMap<String, Integer> map = new HashMap<>();
        for (String name : list) {
            //判断当前的景点在map中是否存在
            if (map.containsKey(name)) {
                //存在
                //先获取当前景点已经被投票的次数
                int count = map.get(name);
                //表示当前景点又被投了一次
                count++;
                //表示当前次数再次添加到集合当中
                map.put(name, count);
            } else {
                //不存在
                map.put(name, 1);
            }
        }
        System.out.println(map);

        //3、求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);


        //4、判断哪个景点的次数和最大值一样，如果一样，打印出来
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
