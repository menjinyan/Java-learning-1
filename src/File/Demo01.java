package File;

import java.io.File;

public class Demo01 {
    public static void main(String[] args) {
        /**
         *public File(String pathname)	根据文件路径创建文件对象
         * public File(String parent, String child)	根据父路径名字符串和子路径名字符串创建文件对象
         * public File(File parent, String child)	根据父路径对应文件对象和子路径名字符串创建文件对象
         *
         *"C:\Users\menji\Desktop\A.txt"
         */

        //1、根据字符串表示的路径，变成file对象
        String str="C:\\Users\\menji\\Desktop\\A.txt";
        File file=new File(str);
        System.out.println(file);

        /**
         * 2、
         * 父级路径:C:\Users\menji\Desktop
         * 子级路径:Desktop\A.txt
         */
        String parent="C:\\Users\\menji\\Desktop";
        String child="A.txt";
        File f2=new File(parent,child);
        System.out.println(f2);

        //3、把一个File表示的路径和String表示的路径进行拼接
        File parent1=new File("C:\\Users\\menji\\Desktop");
        String child1="A.txt";
        File f3=new File(parent1,child1);
        System.out.println(f3);
    }
}
