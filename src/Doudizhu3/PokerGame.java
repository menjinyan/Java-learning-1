package Doudizhu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {

    static ArrayList<String> list = new ArrayList<>();
    static HashMap<String, Integer> map = new HashMap<>();

    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String s : color) {
            for (String n : number) {
                list.add(s + n);
            }
        }
        list.add("小王");
        list.add("大王");

        //指定牌的价值
        map.put("J", 11);
        map.put("Q", 12);
        map.put("K", 13);
        map.put("A", 14);
        map.put("2", 15);
        map.put("小王", 50);
        map.put("大王", 100);
    }

    public PokerGame() {
        Collections.shuffle(list);

        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> fapai1 = new ArrayList<>();
        ArrayList<String> fapai2 = new ArrayList<>();
        ArrayList<String> fapai3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String Poker = list.get(i);
            if (i <= 2) {
                lord.add(Poker);
                continue;
            }
            if (i % 3 == 0) {
                fapai1.add(Poker);
            } else if (i % 3 == 1) {
                fapai2.add(Poker);
            } else {
                fapai3.add(Poker);
            }
        }

        //排序
        order(lord);
        order(fapai1);
        order(fapai2);
        order(fapai3);

        //看牌


    }

    public void order(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            //Array.sort(插入排序+二分查找)
            @Override
            public int compare(String o1, String o2) {
                /**
                 * o1:表示当前要插入到有序，序列中的牌
                 * o2:表示已经在有序，序列中存在的牌
                 *
                 *
                 * 负数:o1小，插入到前面
                 * 正数:01大，插入到后面
                 * 0:o1的数字和o2的数字是一样的，需要按照花色再次进行排序
                 */

                //1、计算o1的花色和价值
                String color1 = o1.substring(0, 1);
                int value = getValue(o1);

                //2、计算o2的花色和价值
                String color2 = o1.substring(0, 1);
                int value1 = getValue(o2);

                //3、比较o1和o2的价值
                int i = value - value1;

                return i == 0 ? color1.compareTo(color2) : i;

            }
        });

    }

    //计算牌的价值
    //参数:牌
    //返回值:价值
    public int getValue(String Poker) {//♥3
        //获取牌上的数字
        String substring = Poker.substring(1);
        if (map.containsKey(substring)) {
            return map.get(substring);
        } else {
            return Integer.parseInt(substring);
        }
    }
}
