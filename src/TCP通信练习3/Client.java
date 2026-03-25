package TCP通信练习3;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        /**
         * 客户端:将本地文件上传到服务器，接收服务器的反馈
         * 服务器:接收客户端上传的文件，上传完毕之后给出反馈
         */

        //1、创建socket对象，并连接服务器
        Socket socket = new Socket("127.0.0.1",10000);

        //2、读取本地文件中的数据，并写到服务器当中
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("D:\\Github\\Java-learning-1\\dog.jpg"));
        BufferedOutputStream out = new BufferedOutputStream(socket.getOutputStream());
        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer)) != -1) {
            out.write(buffer, 0, len);
        }
        //往服务器写出结束标记
        socket.shutdownOutput();

        //3、接收服务器的回写数据
        BufferedReader  br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line=br.readLine();
        System.out.println(line);

        socket.close();
    }
}
