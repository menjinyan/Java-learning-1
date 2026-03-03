package Immutable_Collection;

import java.util.Iterator;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * 创建不可变的set集合
         * "张三","李四","王五","赵六"
         */
        //一旦创建完毕之后是无法进行修改的，在下面的代码中只能进行查询操作
        Set<String> set = Set.of("张三", "李四", "王五", "赵六");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("----------");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
