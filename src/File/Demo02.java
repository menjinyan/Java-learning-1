package File;

import java.io.File;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        /**
         * 需求:在当前模块下aaa创建一个a.txt文件
         */

        //1、创建a.txt的父级路径
        File file=new File("C:\\Java-learning-1");

        /**
         * 2、创建父级路径
         * 如果aaa是存在的，那么此时创建是失败的
         * 如果aaa是不存在的，那么此时创建是成功的
         */
        file.mkdir();

        //3、拼接父级路径和子级路径
        File src=new File("C:\\Java-learning-1\\a.txt");
        boolean b=src.createNewFile();
        if(b){
            System.out.println("创建成功");
        }else{
            System.out.println("创建失败");
        }
    }
}
