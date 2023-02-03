 
import java.lang.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import javax.print.attribute.standard.PrinterResolution;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.IconUIResource;

import java.awt.*;
import java.awt.HeadlessException;
import java.io.*;
import java.io.PrintWriter.*;
import java.awt.HeadlessException.*;
public class ServerGui {   
    static ServerSocket ss;
    static Socket s;
    static Scanner sc1=new Scanner(System.in);
    static Scanner sc;
    static PrintWriter ps;
    static String str="",str1="";

    static JFrame fram=  new JFrame("ServerRoom");
    static JLabel top=new JLabel();
    static JTextField tsend=new JTextField();
   
    static ImageIcon icon=new ImageIcon("pk.png");
    static JButton send=new JButton("G");

    static JTextArea tser=new JTextArea();
    static JTextArea trser=new JTextArea(); 
     
    static void gui(){ 
        fram.setBounds(0, 0, 350, 600); 
        fram.setLayout(null);
       
        top.setBounds(0,0,350,50);
        top.setBackground(Color.blue);
        top.setOpaque(true);

        tsend.setBounds(5, 530, 280, 30);

        send.setBounds(285,530,45,30); 
        trser.setBounds(0, 100, 170, 280);
        tser.setBounds(170, 100, 170, 280);
        
         fram.add(trser);
         fram.add(tser);
        // fram.add(tf1);
         fram.add(send);
         fram.add(tsend);
         fram.add(top);
         fram.setVisible(true);
    }
   
    public static void main(String[] args) {
       try {
        gui();
        ss=new ServerSocket(8080);
        System.out.println("server running......");
        s=ss.accept();
        System.out.println("connect to client...ok");

        sc=new Scanner(s.getInputStream());
        ps=new PrintWriter(s.getOutputStream(),true);

       reader();
       write();

       } catch (Exception e) {
        // TODO: handle exception
       }
        
    } 

    static void reader() {
        Thread tr=new Thread(()->{
           
          while(true){
                        try {
                            send.addActionListener(e->{
                                str=tsend.getText();
                                ps.println(str+"\n"); 
                                tsend.setText("");
                                trser.setText(trser.getText()+str+"\n");

                               
                              });    
            str=sc1.nextLine();
            ps.println(str);
            if(str.equals("Bye")){
                break;
            } 
        } catch (Exception e) { 
        System.out.println(e);
            // TODO: handle exception
        }
    } 
        });
        tr.start(); 
    }
    static void write(){
        Thread tw= new Thread(()->{
           
            while(true){
                try {
                    str=sc.nextLine();
                   tser.setText(tser.getText()+"\n"+str);
                    str=sc.nextLine();
                    System.out.println(str);
                    if(str.equals("Bye")){
                        break;
                    } 
                } catch (Exception e) {
                    System.out.println(e);
                    // TODO: handle exception
                }
            }
        });
        tw.start(); 
    }
}