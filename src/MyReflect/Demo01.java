package MyReflect;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 获取 class 对象的三种方式：
         * Class.forName ("全类名");
         * 类名.class
         * 对象.getClass ();
         */
        //1、第一种方式
        //全类名: 包名+类名
        Class clazz=Class.forName("MyReflect.Student");

        //第二种方式
        Class clazz2=Student.class;

        //第三种方式
        Student s=new Student();
        Class<? extends Student> clazz3=s.getClass();
        System.out.println(clazz==clazz2);
        System.out.println(clazz==clazz3);
    }
}
