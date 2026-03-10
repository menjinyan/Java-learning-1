package Exception;

public class Demo02 {
    public static void main(String[] args) {

        /**
         * 异常作用一：异常是用来查询 bug 的关键参考信息
         * 异常作用二：异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况
         */

        Student[] arr=new Student[3];
        //Student s1=new Student();
        String name=arr[0].getName();
        System.out.println(name);
    }
}
