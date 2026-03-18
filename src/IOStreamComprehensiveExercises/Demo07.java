package IOStreamComprehensiveExercises;

import java.io.*;

public class Demo07 {
    public static void main(String[] args) throws IOException {
        /**
         * 利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码
         */

      /*  FileInputStream fis=new FileInputStream("src\\a.txt");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);
        String str=br.readLine();
        System.out.println(str);
        br.close();

       */
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
