package TCP通信练习1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        /**
         * 客户端:多次发送数据
         * 服务器:接收多次接收数据，并打印
         */

        //1、创建对象绑定10000端口
        ServerSocket serverSocket = new ServerSocket(10000);

        //2、等待客户端进行连接
        Socket sk = serverSocket.accept();

        //3、读取数据

        InputStreamReader isr = new InputStreamReader(sk.getInputStream());
        int b;
        while((b=isr.read())!=-1){
            System.out.print((char)b);
        }

        //4、释放资源
        sk.close();
        serverSocket.close();
    }
}
