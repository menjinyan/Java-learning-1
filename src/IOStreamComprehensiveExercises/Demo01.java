package IOStreamComprehensiveExercises;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        /**
         * 需求:
         * 拷贝一个文件夹，考虑子文件夹
         */

        //1、创建对象表示数据源
        File src=new File("D:\\aaa\\src");
        File dest=new File("D:\\aaa\\xinde");

        copydir(src,dest);
    }

    /**
     * 作用:拷贝文件
     * @param src  数据源
     * @param dest 目的地
     */
    private static void copydir(File src, File dest) throws IOException {
        dest.mkdir();
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                FileInputStream fis=new FileInputStream(file);
                FileOutputStream fos=new FileOutputStream(new File(dest,file.getName()));
                byte[] bytes=new byte[1024];
                int len;
                while((len=fis.read(bytes))!=-1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            }else{
                copydir(file,new File(dest,file.getName()));
            }
        }


    }
}
