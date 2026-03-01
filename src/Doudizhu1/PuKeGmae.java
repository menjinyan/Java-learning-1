package Doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PuKeGmae {

    //牌盒
  static ArrayList<String> list=new ArrayList<>();

    /**
     * 静态代码块
     * 特点:随着类的加载而加载的，而且只执行一次
     */

    static {
        //准备牌
        /**
         * "♦", "♣", "♥", "♠"
         * "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"
         */
        String[] color={"♦", "♣", "♥", "♠"};
        String[] number={"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};


        for (String c : color) {
            //c表示每一种花色
            for (String s : number) {
                //s表示每一个数字
                list.add(c+s);
            }
        }
        list.add("小王");
        list.add("大王");
    }


    public PuKeGmae(){

        //洗牌
        Collections.shuffle(list);

        System.out.println(list);
        //发牌
        ArrayList<String> lort=new ArrayList<>();  //lort是地主的意思
        ArrayList<String> fapai1=new ArrayList<>();
        ArrayList<String> fapai2=new ArrayList<>();
        ArrayList<String> fapai3=new ArrayList<>();

        //遍历牌盒得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            //i表示索引，也就是牌的序号
          String poker = list.get(i);

          if(i<=2){
              lort.add(poker);
              continue;
          }

          //给三个玩家轮流发牌

            if(i%3==0){
                fapai1.add(poker);
            }else if(i%3==1){
                fapai2.add(poker);
            }else {
                fapai3.add(poker);
            }
        }
        //看牌
        lookPoker("底牌",lort);
        lookPoker("大帅哥",fapai1);
        lookPoker("大美女",fapai2);
        lookPoker("本人",fapai3);
    }
    public void lookPoker(String name,ArrayList<String>list){
        System.out.println(name+":");
        for (String poker : list) {
            System.out.print(poker+"");
        }
        System.out.println();
    }
}
