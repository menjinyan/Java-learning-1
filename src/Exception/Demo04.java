package Exception;

public class Demo04 {
    public static void main(String[] args) {

        /**
         * 异常作用一：异常是用来查询 bug 的关键参考信息
         * 异常作用二：异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况
         */

        //1、创建学生对象
        Student s1=new Student();

        s1.setAge(50);
    }
}
