package FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        /**
         * 文本文件中有以下的数据：
         * 2-1-9-4-7-8
         * 将文件中的数据进行排序，变成以下的数据：
         * 1-2-4-7-8-9
         */

        //1、读取数据
        FileReader fr=new FileReader("a.txt");
        StringBuilder sb=new StringBuilder();
        int ch;
        while((ch=fr.read())!=-1){
            sb.append((char)ch);
        }
        fr.close();
        System.out.println(sb);

        String str=sb.toString();
        String[] arr=str.split("-");

        ArrayList<Integer> list=new ArrayList<>();
        for(String s:arr){
            int i=Integer.parseInt(s);
            list.add(i);
        }
        Collections.sort(list);
        System.out.println(list);

        FileWriter fw=new FileWriter("a.txt");
        for(int i=0;i<list.size();i++){
            if(i==list.size()-1){
                fw.write(list.get(i)+"");
            }else{
                fw.write(list.get(i)+"-");
            }
        }
        fw.close();
    }
}
