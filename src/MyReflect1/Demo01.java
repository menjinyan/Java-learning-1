package MyReflect1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        /**
         * Class 类中用于获取构造方法的方法
         * Constructor[] getConstructors() Constructor[] getDeclaredConstructors()
         * Constructor<T> getConstructor(Class<?>... parameterTypes)
         * Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
         *
         * Constructor 类中用于创建对象的方法
         * T newInstance (Object... initargs)
         * setAccessible (boolean flag)
         */

        //1、获取class字节码文件对象
        Class<?> aClass = Class.forName("MyReflect1.Student");

        //2、获取构造方法
       /* Constructor<?>[] cons1 = aClass.getConstructors();
        for (Constructor<?> con : cons1) {
            System.out.println(con);

        */
        /*
        Constructor[] cons2 = aClass.getDeclaredConstructors();
        for (Constructor con : cons2) {
            System.out.println(con);
        }

         */
        Constructor con1 = aClass.getDeclaredConstructor();
        System.out.println(con1);

        Constructor con3 = aClass.getDeclaredConstructor(int.class);
        System.out.println(con3);


    }
}
