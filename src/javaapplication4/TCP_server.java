/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author ACER
 */
public class TCP_server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(2207);
        System.out.println("Server is running ");
        while(true) {
            // tiếp nhận connect
            Socket conn = server.accept();
            Socket conn2 = server.accept();
            System.out.println(conn);
            DataInputStream dis = new DataInputStream(conn.getInputStream());
            DataOutputStream dos = new DataOutputStream(conn2.getOutputStream());
            dos.writeUTF(dis.readUTF());
            dis.close();
            dos.close();
            conn.close();
        }
    }
}
