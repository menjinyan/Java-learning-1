package TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;


public class Client {
    public static void main(String[] args) throws IOException {
        //TCP协议发送数据

        //1、创建Socket对象
        /**
         * 细节:
         * 在创建对象的的同时会连接服务端
         * 连接不上，代码会报错
         */
        Socket socket=new Socket("127.0.0.1",10000);

        //2、可以从连接通道中获取输出流
        OutputStream out=socket.getOutputStream();

        //写输出流
        out.write("aaa".getBytes());

        //释放资源
        out.close();
        socket.close();
    }
}
