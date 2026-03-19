package IO流综合练习;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        /**
         * 制造假数据资源提取
         * 获取姓氏：https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
         * 获取男生名字：http://www.haoming8.cn/baobao/108881.html
         * 获取女生名字：http://www.haoming8.cn/baobao/76411.html
         */

        //1、定义变量记录网址
        // 修正后的网址（去掉末尾空格，修正数字）
        String familyNames = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String BoyNames = "http://www.haoming8.cn/baobao/10881.html";
        String GirlNames = "http://www.haoming8.cn/baobao/7641.html";

        String familyNamesstr = webCrawler(familyNames);
        String BoyNamesstr = webCrawler(BoyNames);
        String Girlstr = webCrawler(GirlNames);


        //3、通过正则表达式
      ArrayList<String> familyNamesTempList= getDate(familyNamesstr,".{4}(,|。)");



    }

    private static ArrayList<String> getDate(String familyNamesstr, String regex) {

        //1、创建集合存放数据
        ArrayList<String> list=new ArrayList<>();

        //2、按照正则表达式的规则去获取数据
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(familyNamesstr);
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
        }
        return list;
    }

    /**
     * 作用:从网络中爬取数据，把数据拼接成字符串返回
     *
     * 形参:
     * 网址
     *
     * 返回值:
     * 爬取到的所有数据
     *
     */
    public static String webCrawler(String net) throws IOException {

        //1、定义StringBuilder拼接爬取到的数据
        StringBuilder sb = new StringBuilder();

        //2、创建一个URL对象
        URL url = new URL(net);

        //3、链接上这个网址
        //细节:保证网络是通畅的，而且这个网址是可以链接上的
        URLConnection conn = url.openConnection();

        //4、读取数据

        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1) {
            sb.append((char) ch);
        }
        isr.close();
        return sb.toString();
    }
}
