package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo02 {
    static void main() {
        /**
         * public static <T> void sort(List<T> list)  排序
         *
         *
         * public static <T> void sort(List<T> list, Comparator<? super T> c)  根据指定的规则进行排序
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("----sort默认规则排序----");

        Collections.sort(list,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list);
        Collections.sort(list,(o1,o2)->o2-o1);
        System.out.println(list);
        System.out.println("----sort自己指定规则去进行排序----");
    }
}
