package Exception;
import java.text.ParseException;
public class Demo01 {
    public static void main(String[] args) {
        // 编译时异常 (在编译阶段，必须要手动处理，否则代码报错)
/*String time = "2030 年 1 月 1 日";SimpleDateFormat sdf = new SimpleDateFormat ("yyyy 年 MM 月 dd 日");
        Date date = sdf.parse (time);
        System.out.println (date);*/
// 运行时异常（在编译阶段是不需要处理的，是代码运行时出现的异常）
        int [] arr = {1,2,3,4,5};
        System.out.println (arr [10]);//ArrayIndexOutOfBoundsException
    }
}
