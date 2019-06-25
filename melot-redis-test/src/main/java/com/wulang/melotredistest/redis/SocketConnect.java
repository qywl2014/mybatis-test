package com.wulang.melotredistest.redis;

import java.net.Socket;

public class SocketConnect {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket("127.0.0.1", 6379);
        System.out.println(socket.getInputStream());
    }
}
