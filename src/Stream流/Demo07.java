package Stream流;

import java.util.ArrayList;
import java.util.Collections;

public class Demo07 {
    public static void main(String[] args) {
        /**
         * "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤"
         *
         * 课堂练习：
         * "张强","张三丰","张翠山"
         * 第一种思路：
         * 先获取前面 6 个元素："张无忌","周芷若","赵敏","张强","张三丰","张翠山"，
         * 然后跳过前面 3 个元素
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");
        list.stream().limit(6).skip(3).forEach((s)->System.out.println(s));
    }
}
