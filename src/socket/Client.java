package socket;
import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client {
    /*
        java.net.Socket 插座 套接字
        Socket封装了TCP协议的通讯细节，使用它可以和服务端建立TCP连接，并基于两个流的
        读写完成数据交换。
     */
    private Socket socket;

    /**
     * 构造方法，用于初始化客户端
     */
    public Client(){
        try {
            /*
                实例化Socket时常用的构造方法:
                Socket(String host,int port)
                这个构造器实例化Socket的过程就是与服务端建立连接的过程。
                参数1:服务端的IP地址
                参数2:服务端开启的服务端口
                我们通过服务端的IP可以找到网络上服务端所在的计算机。通过端口号可以找到
                该机器上的服务端应用程序从而与之建立连接。
             */
            System.out.println("linking,please hold~");
            socket = new Socket("Localhost",8088);
            System.out.println("click!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 客户端开始工作的方法
     */
    public void start(){
        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            Scanner scan = new Scanner(System.in);
            while(true){
                String line = scan.nextLine();
                if("exit".equalsIgnoreCase(line)){
                    break;
                }
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                /*
                Socket 提供了close方法,可以与远端计算机断开连接
                该方法调用时,也会自动关闭通过他
                 */
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
