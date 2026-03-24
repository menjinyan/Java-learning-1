package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        //接收数据

        //1、创建对象ServerSocker
        ServerSocket ss=new ServerSocket(10000);

        //2、监听客户端的连接
        Socket socket=ss.accept();

        //3、从连接通道中获取输入流获取数据
        InputStream in =socket.getInputStream();
        InputStreamReader isr=new InputStreamReader(in);
        BufferedReader br=new BufferedReader(isr);
        int b;
        while((b=br.read())!=-1){
            System.out.println((char)b);
        }

        //4、释放资源
        socket.close();
        ss.close();
    }
}
