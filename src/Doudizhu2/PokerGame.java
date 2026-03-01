package Doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    //牌盒 Map
    //此时我们只要把牌和序号产生对应的关系就可以了。不需要按照序号进行排序，所以只要HashMap就可以了

    static HashMap<Integer,String> map=new HashMap<>();
    static ArrayList<Integer> list=new ArrayList<>();


    static {
        String[] color={"♦", "♣", "♥", "♠"};
        String[] number={"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //牌的序号
        int seriaNumber=1;
        //细节:
        for (String s : color) {
            //s表示每一个花色
            for (String n : number) {
                //以此表示每一个数字
                map.put(seriaNumber,s+n);
                list.add(seriaNumber);
                seriaNumber++;
            }

        }
        map.put(seriaNumber,"小王");
        list.add(seriaNumber);
        seriaNumber++;
        map.put(seriaNumber,"大王");
        list.add(seriaNumber);
        System.out.println(list);
    }
    public PokerGame() {

        //洗牌
        Collections.shuffle(list);
        System.out.println("洗牌后的牌盒序号:"+list);
        //发牌
        /**
         * TreeSet
         * 特性:可以进行排序(按照默认方式进行排序)
         */
        TreeSet<Integer> lort=new TreeSet<>();
        TreeSet<Integer> fapai1=new TreeSet<>();
        TreeSet<Integer> fapai2=new TreeSet<>();
        TreeSet<Integer> fapai3=new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            //i:以此表示集合中的每一个索引
            //list.get()元素:牌的序号
            int seriaNumber=list.get(i);
            if(i<=2){
                lort.add(seriaNumber);
                continue;
            }
            if(i%3==0){
                fapai1.add(seriaNumber);
            } else if (i%3==1) {
                fapai2.add(seriaNumber);
            }else{
                fapai3.add(seriaNumber);
            }
        }
        //看牌
        lookPoker("底牌",lort);
        lookPoker("本人",fapai1);
        lookPoker("大帅哥",fapai2);
        lookPoker("大美女", fapai3);
    }

    /**
     * @param name
     * @param ts
     */
    public void lookPoker(String name,TreeSet<Integer>ts){
        System.out.print(name+" : ");
        //遍历TreeSet集合得到每一个符号，再拿着符号到Map集合中去找真正的牌
        for (int seriaNumber : ts) {
            String poker = map.get(seriaNumber);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
