package Immutable_Collection;

import java.util.Map;
import java.util.Set;

public class Demo03 {
    /**
     * 创建map不可变集合
     * 细节1:
     * 键是不能重复的
     * 细节2:
     * Map里面的of方法，多数是有上线的，最多只能传递20个参数，10个键值对
     * 细节3:
     * 如果我们要传递多个键值对象，数量大于10个，在Map接口中还有一个of entries方法
     *
     *
     *
     *
     * "张三", "南京", "李四",
     * "北京", "王五", "上海",
     * "赵六", "广州", "孙七",
     * "深圳", "周八", "杭州",
     * "吴九", "宁波", "郑十",
     * "苏州", "刘一", "无锡",
     * "陈二", "嘉兴"
     */
    public static void main(String[] args) {
      Map<String,String> map= Map.of("张三", "南京", "李四",
                "北京", "王五", "上海",
                "赵六", "广州", "孙七",
                "深圳", "周八", "杭州",
                "吴九", "宁波", "郑十",
                "苏州", "刘一", "无锡",
                "陈二", "嘉兴");

        Set<String> keys = map.keySet();
        for (String key1 : keys) {
            String value=map.get(key1);
            System.out.println(key1+ "=" +value);
        }

        System.out.println("----------");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+ "=" +value);
        }
        System.out.println("----------");
        
    }
    /**
     * 如果我想让这个方法能接受多个键和值
     * 解决方法:
     * 键 可变参数
     * 值 可变参数
     * 类型不确定:用泛型方法
     */
    public static<k,v>void of(){

    }
}
