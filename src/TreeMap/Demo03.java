package TreeMap;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Demo03 {
    public static void main(String[] args) {
        /**
         * 统计个数
         * 需求：字符串 “aababcabcdabcde”
         * 请统计字符串中每一个字符出现的次数，并按照以下格式输出
         * 输出结果：
         * a (5) b (4) c (3) d (2) e (1)
         *
         * 分析:
         * 提到统计就要想到计数器思想
         * 弊端:如果我们要统计的比较多，那就非常的不方便
         *
         * 新的统计思想:
         * HashMAP
         * TreeMap
         * （如果题目中没有要求对结果进行排序，默认使用HashMap
         *   如果题目中有要求对结果进行排序，默认使用TreeMap）
         *
         * 键:表示统计的内容
         * 值:表示次数
         */

        //1、定义字符串
        String s = "aababcabcdabcde";

        //2、创建集合
        TreeMap<Character, Integer> tm = new TreeMap<>();

        //3、遍历字符串得到里面的每一个字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //拿着C到集合中判断是否存在
            //存在，表示当前又出现了一次
            //不存在，表示当前字符是第一次出现
            if (tm.containsKey(c)) {
                //存在
                //先把已经出现的次数拿出来
                int count = tm.get(c);
                //当前字符又出现了一次
                count++;
                //把自增之后的结果添加到集合当中
                tm.put(c, count);
            } else {
                //不存在
                tm.put(c, 1);
            }
        }

        //4、遍历集合，并按照指定的格式去进行拼接
        /**
         * 两种拼接方式
         * StringBuilder
         * StringJoiner
         */
        StringBuilder sb = new StringBuilder();
        tm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                sb.append(key).append("(").append(value).append(")");
            }
        });
        System.out.println(sb);
    }
}
