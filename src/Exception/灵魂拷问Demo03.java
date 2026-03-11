package Exception;

public class 灵魂拷问Demo03 {
    public static void main(String[] args) {
        /**
         * 灵魂三问： 如果 try 中遇到的问题没有被捕获，怎么执行？
         * 回答:相当于 try...catch中的代码白写了，最终还是会交给虚拟机进行处理
         */
        int[] arr={1,2,3,4,5,6};
        try{
            System.out.println(arr[10]);
        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }
        System.out.println("看我执行了吗");
    }
}
