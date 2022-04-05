package test;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class Client {
    private Socket socket;
    public Client(){
        try {
            System.out.println("正在连接服务器端");
            socket = new Socket("localhost",8088);
            System.out.println("与服务端建立连接");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void start(){

        try {
            ServerHandler handler = new ServerHandler();
            Thread t = new Thread(handler);
            t.start();
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw
                    = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            Scanner scanner = new Scanner(System.in);
            while(true){
                String line = scanner.nextLine();
                if("exit".equalsIgnoreCase(line)){
                    break;
                }
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
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

    private class ServerHandler implements Runnable{
        public void run(){
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in);
                BufferedReader br = new BufferedReader(isr);

                String line;
                while((line = br.readLine()) != null){
                    System.out.println(line);
                }
            } catch (IOException e) {
            }
        }
    }
}
