package Method_Reference;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01 {
    public static void main(String[] args) {
        // 需求:创建一个数组，进行倒序排序
        Integer[] arr = {3, 4, 5, 6, 7};

        // 1. 匿名内部类（注释保留，对比参考）
       /* Arrays.sort(arr,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1; // 倒序：后数减前数
            }
        });*/

        // 2. lambda表达式
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o2 - o1;
        });
        System.out.println(Arrays.toString(arr)); // [7, 6, 5, 4, 3]

        /**
         * 方法引用:
         * 1、引用处需要是函数式接口
         * 2、被引用的方法需要已经存在
         * 3、被引用的方法形参和返回值需要和抽象方法的形参和返回值一致
         * 4、被引用方法的功能需要满足当前的需求
         */
        Arrays.sort(arr, Demo01::compareDesc);
        System.out.println(Arrays.toString(arr)); // [7, 6, 5, 4, 3]
    }

    // 定义符合Comparator.compare方法签名的静态方法
    // 要求：参数类型、个数、返回值类型与Comparator的compare方法一致
    public static int compareDesc(Integer num1, Integer num2) {
        return num2 - num1;
    }
}