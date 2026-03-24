package InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo01 {
    public static void main(String[] args) throws UnknownHostException {
        /**
         * static InetAddress getByName (String host) 确定主机名称的 IP 地址。主机名称可以是机器名称，也可以是 IP 地址
         * String getHostName () 获取此 IP 地址的主机名
         * String getHostAddress () 返回文本显示中的 IP 地址字符串
         */

        //1、获取InetAddress的对象
        //IP的对象看作是一台电脑的对象
        InetAddress address = InetAddress.getByName("menjinyan");
        System.out.println(address);
        String hostName = address.getHostName();
        System.out.println(hostName);
        String ip = address.getHostAddress();
        System.out.println(ip);
    }
}
