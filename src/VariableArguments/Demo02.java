package VariableArguments;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * 可变参数的小细节:
         * 1、在方法的形参中最多只能写一个可变参数
         *
         * 可变参数:理解为一个大胖子，有多少吃多少
         */
        getSum(1,2,3,4,5,6,7,8);
    }

    public static int getSum(int a, int... args) {
        return 0;
    }
}
