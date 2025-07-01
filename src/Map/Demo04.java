package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Demo04 {
    public static void main(String[] args) {
        //Map集合的第三种遍历方式

        //1、创建map集合的对象
        Map<String, String> map = new HashMap<>();

        //2、添加元素
        //键:人物的名字
        //值:人物的名言

        map.put("鲁迅", "这句话是我说的");
        map.put("曹操", "不可能绝对不可能");
        map.put("刘备", "接着奏乐接着舞");

        //3、利用Lambda表达式进行遍历
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "=" + value);
            }
        });

        System.out.println("-------");

        map.forEach((String key, String value) ->{
                System.out.println(key + "=" + value);
            }
        );

        System.out.println("-------");

        map.forEach(( key,  value) -> System.out.println(key + "=" + value)

        );
    }
}
