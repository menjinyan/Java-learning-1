package IOStreamComprehensiveExercises;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        /**
         * 需求:
         * 把出师表的文章进行恢复并复制到新的文件中
         */
        BufferedReader br = new BufferedReader(new FileReader("src\\csb.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while((line=br.readLine())!=null){
            list.add(line);
        }
        br.close();

        //进行排序
        Collections.sort(list,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                int i1=Integer.parseInt(o1.split("\\.")[0]);
                int i2=Integer.parseInt(o2.split("\\.")[0]);
                return i1-i2;
            }
        });
        //写出
        BufferedWriter bw=new BufferedWriter(new FileWriter("src\\c.txt"));
        for (String string : list) {
            bw.write(string);
            bw.newLine();
        }
        bw.close();
    }
}
