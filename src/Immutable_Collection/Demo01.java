package Immutable_Collection;
import java.util.*;
public class Demo01 {
    public static void main(String[] args) {
        /**
         * 创建不可变的List集合
         * "张三","李四","王五","赵六"
         */
        //一旦创建完毕之后是无法进行修改的，在下面的代码中只能进行查询操作
        List<String> list = List.of("张三", "李四", "王五", "赵六");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        System.out.println("----------");

        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("----------");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String name = it.next();
            System.out.println(name);
        }

        System.out.println("----------");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            System.out.println(name);
        }

    }
}
