package Exception;

public class Demo05 {
    public static void main(String[] args) {
        /**
         * JVM 默认处理异常的方式：
         * 把异常的名称，异常原因及异常出现的位置等信息输出在了控制台
         * 程序停止执行，异常下面的代码不会再执行了
         */

        System.out.println("你是谁");
        System.out.println(2/0);
        System.out.println("是秃子总会发光");
    }
}
