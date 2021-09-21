/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author ACER
 */
public class TCP_client2 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.2", 2207);
//        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        
        DataInputStream dis = new DataInputStream(client.getInputStream());
        System.out.println(dis.readUTF());
//        dos.close();
        dis.close();
        client.close();
    }
}
