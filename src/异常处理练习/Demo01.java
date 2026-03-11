package 异常处理练习;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * 需求描述：
         * 键盘录入自己心仪的女朋友姓名和年龄。
         *
         * 姓名的长度在 3 - 10 之间，
         * 年龄的范围为 18 - 40 岁，
         * 超出这个范围是异常数据不能赋值，需要重新录入，一直录到正确为止。
         *
         * 提示：
         * 需要考虑用户在键盘录入时的所有情况。
         * 比如：录入年龄时超出范围。录入年龄时录入了 abc 等情况
         */

        //1、创建键盘录入的方法
        Scanner sc = new Scanner(System.in);
        //2、创建女朋友这个对象
        GirlFriend gf = new GirlFriend();

        //3、接收女朋友的姓名
        while (true) {
            try {
                System.out.println("请输入女朋友的名字");
                String name = sc.nextLine();
                if(name.length()>=3 && name.length()<=10){
                    gf.setName(name);
                }
                gf.setName(name);
                //4、接收女朋友的年龄
                System.out.println("请输入你女朋友的年龄");
                String age = sc.nextLine();
                int ager=Integer.parseInt(age);
                gf.setAge(ager);
                //如果所有的数据都是正确的那么跳出循环
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄的格式有误，请输入数字");
            }catch (RuntimeException e) {
                System.out.println("姓名的长度或者年龄的范围有误");
            }
        }

        //5、打印
        System.out.println(gf);
    }
}
