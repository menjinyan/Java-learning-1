package Map;

import java.util.HashMap;
import java.util.Map;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * 一:V put(K key,V value)                  添加元素
         * 二:V remove(object key)                  根据键删除键值对元素
         * 三:void clear()                          移除所有的键值对元素
         * 四:boolean containsKey(Object key)       判断集合是否包含指定的键
         * 五:boolean containsValue(object value)   判断集合是否包含指定的值
         * 六:boolean isEmpty()                     判断集合是否为空
         * 七:int size()                            集合的长度，也就是集合中键值对的个数
         */

        //1、创建Map集合对象
        Map<String, String> m = new HashMap<>();

        //一:V put(K key,V value)                  添加元素
        //2、添加元素
        //put方法的细节
        //添加或者覆盖

        //在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中
        //在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把覆盖的键值进行返回
        //String value1 = m.put("小明", "小黄");
        //System.out.println(value1);
        //m.put("小李", "小华");
        //m.put("小张", "小刘");
        //m.put("小孙", "小杨");
        //String value2 = m.put("小李", "小陈");
        //System.out.println(value2);

        //3、打印集合
        //System.out.println(m);


        //二:V remove(object key)                  根据键删除键值对元素
        //m.put("小李", "小华");
        //m.put("小张", "小刘");
        //m.put("小孙", "小杨");
        //String result = m.remove("小李");
        //System.out.println(result);

        //三:void clear()                          移除所有的键值对元素
        //m.put("小李", "小华");
        //m.put("小张", "小刘");
        //m.put("小孙", "小杨");
        //m.clear();


        //四:boolean containsKey(Object key)       判断集合是否包含指定的键
        //m.put("小李", "小华");
        //m.put("小张", "小刘");
        //m.put("小孙", "小杨");
        //boolean keyresult = m.containsKey("小李");
        //System.out.println(keyresult);


        //五:boolean containsValue(object value)   判断集合是否包含指定的值
        //m.put("小李", "小华");
        //m.put("小张", "小刘");
        //m.put("小孙", "小杨");
        //boolean ValueResult = m.containsValue("小杨");
        //System.out.println(ValueResult);


        //六:boolean isEmpty()                     判断集合是否为空
        //m.put("小李", "小华");
        //m.put("小张", "小刘");
        //m.put("小孙", "小杨");
        //boolean Result = m.isEmpty();
        //System.out.println(Result);


        //七:int size()                            集合的长度，也就是集合中键值对的个数
        m.put("小李", "小华");
        m.put("小张", "小刘");
        m.put("小孙", "小杨");
        int size = m.size();
        System.out.println(size);

        System.out.println(m);

    }
}
