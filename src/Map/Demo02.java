package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式

        //1、创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2、添加元素
        map.put("杨过", "小龙女");
        map.put("电院", "安财");
        map.put("欧阳锋", "黄蓉");

        //3、通过键找值(获取所有的键，把这些键放到一个单列集合当中)
        Set<String> keys = map.keySet();

        //4、遍历单列集合，得到每一个键
        for (String key : keys) {
            System.out.println(key);
            //5、利用map集合中的键获取对应的值  get
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
