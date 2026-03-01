package CoreExercises;

import com.sun.jdi.Value;

import javax.swing.text.StyleContext;
import java.util.*;

public class Demo04 {
    public static void main(String[] args) {
        /**
         * 需求
         * 定义一个 Map 集合，键用表示省份名称province，值表示市city，但是市会有多个。
         * 添加完毕后，遍历结果格式如下：
         * 江苏省 = 南京市，扬州市，苏州市，无锡市，常州市
         * 湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
         * 河北省 = 石家庄市，唐山市，邢台市，保定市，张家口市
         */

        //1、创建Map集合
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        //2、创建单列集合存储市
        ArrayList<String>jiangsucities=new ArrayList<>();
        Collections.addAll(jiangsucities,"南京市","扬州市","无锡市","常州市","苏州市");
        map.put("江苏省",jiangsucities);

        ArrayList<String>hubeishencities=new ArrayList<>();
        Collections.addAll(hubeishencities,"武汉市","孝感市","十堰市","宜昌市","鄂州市");
        map.put("湖北省",hubeishencities);

        ArrayList<String>hebeishengcities=new ArrayList<>();
        Collections.addAll(hebeishengcities,"石家庄市","唐山市","邢台市","保定市","张家口市");
        map.put("河北省",hebeishengcities);

        Set<Map.Entry<String, ArrayList<String>>> entries = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            //entry：以此表示每一个键值对象
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner joiner = new StringJoiner(",","","");
            for (String cities : value) {
                joiner.add(cities);
            }
            System.out.println(key+" = "+joiner);
        }
    }
}
