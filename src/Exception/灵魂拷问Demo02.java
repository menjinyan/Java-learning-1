package Exception;

public class 灵魂拷问Demo02 {
    public static void main(String[] args) {
        /**
         * 灵魂二问： 如果 try 中可能会遇到多个问题，怎么执行？
         *
         * 回答:会写多个catch与之对应
         * 细节:
         * 如果我们要捕获多个异常，这些异常中如果存在父子关系的话，那么父类一定要写在下面
         *
         *
         * 扩展:
         * 在JDK7之后，我们可以在catch中同时捕获多个异常，中间用 | 进行隔开
         * 表示如果A异常或者B异常，采取同一个方案进行处理
         */

        int[] arr={1,2,3,4,5,6};
        try{
            System.out.println(arr[10]);//会创建ArrayIndexOutOfBoundsException对象，直接跳转到catch中
            System.out.println(2/0);//这段代码就不会再跑了
            String s=null;
            System.out.println(s.equals("abc"));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }

        System.out.println("看我执行了吗");
    }
}
