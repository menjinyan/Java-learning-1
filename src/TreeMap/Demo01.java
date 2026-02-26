package TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * 需求1:
         * 键:整数表示id
         * 值:字符串表示商品名称
         * 要求:按照id的升序排列 按照id的降序排列
         *
         * 需求2:
         * 键:学生对象
         * 值:籍贯
         * 要求:按照学生年龄的升序进行排列 年龄一样按照姓名的字母进行排列 同姓名年龄市委一个人
         */

        //1、创建集合对象
        /**
         * Integer Double 默认情况下都是按照升序进行排列的
         * String  按照字母再按照ASCLL码表中对于的数字进行升序进行排列
         */
        TreeMap<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1:表示当前要添加的元素
                //o2:表示已经在红黑树中存在的元素
                return o2 - o1;
            }
        });

        //2、添加元素
        map.put(1, "奥利奥");
        map.put(2, "康师傅");
        map.put(3, "统一");
        map.put(4, "六个核弹");
        map.put(5, "雷比");

        //3、打印集合
        System.out.println(map);
    }
}
