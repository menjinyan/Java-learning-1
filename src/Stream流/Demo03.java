package Stream流;

import java.util.HashMap;

public class Demo03 {
    public static void main(String[] args) {
        //双列集合  无   无法直接用stream流

        //1、创建双列集合
        HashMap<String, Integer> map = new HashMap<>();

        //2、添加数据
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);

        //3、第一种:获取stream流
        //map.keySet().stream().forEach(s->System.out.println(s));

        //4、第二种获取办法
        map.entrySet().stream().forEach(s->System.out.println(s));
    }
}
