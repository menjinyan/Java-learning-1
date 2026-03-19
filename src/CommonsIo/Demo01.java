package CommonsIo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        /**
         * 1、FileUtils 类
         * static void copyFile (File srcFile, File destFile) —— 复制单个文件
         * static void copyDirectory (File srcDir, File destDir) —— 复制整个文件夹（包含子文件 / 子目录）
         * static void copyDirectoryToDirectory (File srcDir, File destDir) —— 将源文件夹复制到目标文件夹下
         * static void deleteDirectory (File directory) —— 删除整个文件夹（包含所有内容）
         * static void cleanDirectory (File directory) —— 清空文件夹内所有内容（保留文件夹本身）
         * static String readFileToString (File file, Charset encoding) —— 按指定编码读取文件内容为字符串
         * static void write (File file, CharSequence data, String encoding) —— 按指定编码将字符串写入文件
         *
         *
         * 2、IOUtils 类
         * public static int copy (InputStream input, OutputStream output) —— 复制流数据（适用于小文件）
         * public static int copyLarge (Reader input, Writer output) —— 复制大文件流数据（支持超过 Integer 最大值的字节数）
         * public static String readLines (Reader input) —— 从字符输入流读取所有行并返回字符串
         * public static void write (String data, OutputStream output) —— 将字符串写入字节输出流
         */

        /*
        File sr=new File("a.txt");
        File dest=new File("b.txt");
        FileUtils.copyFile(sr,dest);

         */

/*
        File src=new File("D:\\aaa");
        File dest=new File("D:\\bbb");
        FileUtils.copyDirectoryToDirectory(src, dest);

 */


     /*   File src=new File("D:\\bbb");
        FileUtils.deleteDirectory(src);

      */
        File src=new File("D:\\bbb");
        FileUtils.cleanDirectory(src);


    }
}
