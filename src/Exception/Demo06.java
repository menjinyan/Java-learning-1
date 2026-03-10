package Exception;

import java.lang.classfile.instruction.ArrayStoreInstruction;
import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        /**
         * 自己处理（捕获异常）
         * 格式：
         * try {
         * 可能出现异常的代码；
         * } catch (异常类名 变量名) {
         * 异常的处理代码；
         * }
         */
        int[] arr={1,2,3,4,5};



        try{
            System.out.println(arr[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            //如果出现了ArrayIndexOutOfBoundsException异常，我该如何处理
            System.out.println("索引越界了");

        }
        System.out.println("看我执行了吗");
    }
}
