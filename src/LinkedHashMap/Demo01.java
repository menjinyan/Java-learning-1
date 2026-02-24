package LinkedHashMap;

import java.util.LinkedHashMap;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * LinkedHashMap:
         * 由键决定:
         * 有序，不重复，无索引
         *
         * 有序:
         *     保证存储和取出的顺序一致
         *  原理:
         *      底层数据结构依旧是哈希表 只是每个建制元素又额外多了一个双链表的机制记录存储的顺序
         *
         */

        //1:创建集合
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        //2:添加元素
        map.put(1, "one");
        map.put(2, "two");
        map.put(4, "four");
        map.put(3, "three");

        /**
         * 表示了存和取的顺序是一致的
         */
        //3,遍历集合
        System.out.println(map);
    }
}
