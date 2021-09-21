/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Scanner;




/**
 *
 * @author ACER
 */
public class TCP_client {
     public static void main(String[] args) throws IOException {
        Scanner sc;
        sc = new Scanner(new InputStreamReader(System.in, Charset.forName("UTF-8")));
        Socket client = new Socket("127.0.0.1", 2207);
        System.out.println("Nhập s: ");
        String s = sc.nextLine();
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        dos.writeUTF(s);
//        DataInputStream dis = new DataInputStream(client.getInputStream());
//        System.out.println(dis.readInt());
        dos.close();
//        dis.close();
        client.close();
    }
}
