package File;

import java.io.File;

public class Demo03 {
    public static void main(String[] args) {
        /**
         * 定义一个方法，找某一个文件夹中，是否有以avi结尾的电影
         * 暂时不需要考虑子文件夹
         */

        File file=new File("D:\\ceshi");
        boolean b=haveAVI(file);
        System.out.println(b);
    }

    /**
     * 作用:
     * 用来找某一个文件夹中。是否有AVI结尾的电影
     *
     * 形参:要查找的文件
     *返回值:查找的结果，存在true 不存在false
     *
     *
     * @param file
     * @return
     */
    public static boolean haveAVI(File file) {

        File[] files = file.listFiles();

        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".avi")) {
                return true;

            }
        }
        return false;
    }
}
