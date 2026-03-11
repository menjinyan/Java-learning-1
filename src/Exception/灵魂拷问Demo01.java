package Exception;

public class 灵魂拷问Demo01 {
    public static void main(String[] args) {
        /**
         * 自己处理（捕获异常）灵魂四问：
         * 灵魂一问： 如果 try 中没有遇到问题，怎么执行？
         * 回答:如果try里面所有的代码全部执行完毕，不会执行catch里面的代码
         *
         * 什么时候会执行catch里面的代码:
         * 注意:只有当出现了异常才会执行catch里面的代码
         *
         * 灵魂二问： 如果 try 中可能会遇到多个问题，怎么执行？
         * 灵魂三问： 如果 try 中遇到的问题没有被捕获，怎么执行？
         * 灵魂四问： 如果 try 中遇到了问题，那么 try 下面的其他代码还会执行吗？
         */
        int[] arr={1,2,3,4,5,6};

        try{
            System.out.println(arr[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }
        System.out.println("看我执行了吗");
    }
}
