import java.util.Random;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Thread.State;
import java.awt.*;

public class EmailPasswordGenerator {
    static JFrame jf=new JFrame("Email_Password_Generator");
    static JLabel jl=new JLabel("Email_Password_Generator");
    static JLabel jl1=new JLabel("Email:");
    static JTextField jt=new JTextField();
    static JButton jb=new JButton("Generator-Password");
    static JLabel jl2=new JLabel("Password:");
    static JPasswordField jt1=new JPasswordField();
    static JLabel jl3=new JLabel();
    static JLabel jl4=new JLabel();
    static String pass; 
    static int gen()
    {
        Random obj=new Random();
        int num =obj.nextInt(100000);
        return num;  
    }
    static void gui(){ 
        jf.setSize(400,400);
        jf.setLayout(null);  
        jl.setBounds(100, 10, 200, 40);
        jf.add(jl); 
        jl1.setBounds(10, 80, 100, 50); 
        jf.add(jl1); 
        jt.setBounds(90, 90, 180, 30);
        jf.add(jt); 
        jb.setBounds(90, 140, 180, 30);
        jf.add(jb);
        jl2.setBounds(10, 190, 100, 50); 
        jf.add(jl2); 
        jt1.setBounds(90, 200, 180, 30);
        jf.add(jt1);  
        jf.setVisible(true);
    }
    static void gui2(){ 
      
        
        jl3.setBounds(10, 230, 300, 50); 
        jf.add(jl3);  
        jl4.setBounds(10, 250, 190, 50); 
        jf.add(jl4);
        
    }
    static void actio(){
        jb.addActionListener(e->{ 
      pass=Integer.toString(gen());
    gui2();
    jt1.setText(pass);
    jl3.setText("Your-Email:- "+jt.getText());
    jl4.setText("Your-Password:- "+pass); 
        });
    }
    public static void main(String[] args) {
        gui();
        actio();
        
    }
    
}
