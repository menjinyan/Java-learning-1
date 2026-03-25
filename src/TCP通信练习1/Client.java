package TCP通信练习1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        /**
         * 客户端:多次发送数据
         * 服务器:接收多次接收数据，并打印
         */

        //1、创建Socket对象并连接服务器
        Socket sk=new Socket("127.0.0.1",10000);

        //2、写出数据
        Scanner sc=new Scanner(System.in);
        OutputStream os = sk.getOutputStream();

        while (true) {
            System.out.println("请输入要发送的数据:");
            String str=sc.nextLine();
            if("8861".equals(str)){
                break;
            }
            os.write(str.getBytes());
        }

        //3、释放资源
        sk.close();
    }
}
