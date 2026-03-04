package Immutable_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo04 {
    public static void main(String[] args) {
        /**
         * 创建map的不可变集合
         */
        HashMap<String, String> map = new HashMap();
        map.put("张三", "南京");
        map.put("李四", "北京");
        map.put("王五", "上海");
        map.put("赵六", "北京");
        map.put("孙七", "深圳");
        map.put("周八", "杭州");
        map.put("吴九", "宁波");
        map.put("郑十", "苏州");
        map.put("刘一", "无锡");
        map.put("陈二", "嘉兴");
        map.put("aaa", "111");

        //Map<Object, Object> objectObjectMap = Map.ofEntries(map.entrySet().toArray(new Map.Entry[0]));
        Map<String, String> Map1 = Map.copyOf(map);

        /**
         * Map.copyOf(map):
         * 核心方法：
         * 1. Map：Java 自带的 Map 接口（所有键值对集合的 “规范”）；
         * 2. copyOf(map)：Map 接口的静态方法（Java 10+ 新增），接收一个现有 Map 作为参数；
         * 3. 内部逻辑：遍历原 map 的所有键值对，创建一个新的、不可变的 Map 实例，把原数据完整复制进去。
         * 4.copyOf 是 “复制” 而非 “引用”
         */
    }
}
