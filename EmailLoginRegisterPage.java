import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class EmailLoginRegisterPage {
    static JFrame fram1=new JFrame("Emailloginpage"); 
    static JFrame fram2=new JFrame("EmailRegisterpage");
    static JFrame fram3=new JFrame("Emailloginpage"); 
    static JLabel top=new JLabel("  ~~Login Page~~");
    static JLabel top1=new JLabel("  ~~SignUp Page~~");
    static JLabel email =new JLabel("  Email:-");
    static JLabel pass=new JLabel("  Password:-");
    static JTextField temail=new JTextField();
    static JTextField tpass=new JTextField();
    static JLabel email1 =new JLabel("  Email:-");
    static JLabel pass1=new JLabel("  Password:-");
    static JTextField temail1=new JTextField();
    static JTextField tpass1=new JTextField();
    static JButton signin=new JButton("  Sign in");
    static JButton signup=new JButton("Sign up");
    static JButton register=new JButton(" Register_Email");
    static JButton logout=new JButton("Logout");
    static JLabel succeslogin=new JLabel("congratulation! you are succesfully Login"); 
    static JLabel result=new JLabel();
     static int flag,flagp,aa,read;
     static String st,st1,st2;

     

    static void gui(){
        fram1.setBounds(0, 0, 400, 400);
        fram1.setLayout(null);
        top.setBounds(120, 10, 100, 30);
        email.setBounds(30, 60, 50, 30);
        temail.setBounds(100, 60, 150, 30);
        pass.setBounds(30, 100, 80, 30);
        tpass.setBounds(100, 100, 150, 30);
        signin.setBounds(30, 140, 100, 30);
        signup.setBounds(140, 140, 120, 30);
        result.setBounds(30, 190, 250, 30);
        fram1.add(top);
        fram1.add(email);
        fram1.add(temail);
        fram1.add(pass);
        fram1.add(tpass);
        fram1.add(signin);
        fram1.add(signup);
        fram1.add(result);
        fram1.setVisible(true); 
    }
    static void action(){

        signin.addActionListener(e->{
            try {
            File fobj=new File("Data.txt"); 
            Scanner sc=new Scanner(fobj); 
            Scanner sc1=new Scanner(fobj); 
            
            while(sc.hasNext()){ flag=0;
                    st=sc.next();  
                 if((temail.getText()).equals(st)){flag=1;break; }} 

                 if(flag==0){aa=0;}
                 else{aa=1;
                       while(sc1.hasNext()){flagp=0;
                                         st1=sc1.next();
                                 if((tpass.getText()).equals(st1)){flagp=1;break;} 
                                             } 
                  }  

                  if(aa==0){
                    result.setText("sorry! your Email/password is wrong");
                  }else{
                    if(flagp==0){
                        result.setText("sorry! your Password is wrong"); 
                    }else{
                        temail.setText("");
                        tpass.setText("");
                fram3.setBounds(0, 0, 400, 400);
                fram3.setLayout(null);
                logout.setBounds(280, 10, 100, 30);
                succeslogin.setBounds(20, 50, 250, 30);
                fram3.add(logout);
                fram3.add(succeslogin);
                fram3.setVisible(true);

                    }
                  } 
        } catch (Exception e0) {
            // TODO: handle exception
        }
           
        });
        logout.addActionListener(e1->{
            gui();
            JOptionPane.showMessageDialog(fram3,"Succifully logout");
        });
        signup.addActionListener(e2->{
            temail.setText("");
            tpass.setText("");
            fram2.setBounds(0, 0, 400, 400);
            fram2.setLayout(null); 
            top1.setBounds(120, 10, 150, 30);
            email1.setBounds(30, 60, 50, 30);
            temail1.setBounds(100, 60, 150, 30);
            pass1.setBounds(30, 100, 80, 30);
            tpass1.setBounds(100, 100, 150, 30);
            register.setBounds(100, 140, 150, 30);
        fram2.add(top1);
        fram2.add(email1);
        fram2.add(temail1);
        fram2.add(pass1);
        fram2.add(tpass1);
        fram2.add(register);
        fram2.setVisible(true);

        });
        register.addActionListener(e3->{ try {
             
            File fobj=new File("Data.txt"); 
            FileWriter fwr=new FileWriter("Data.txt",true); 
            Scanner scw=new Scanner(fobj);
            while(scw.hasNext()){ 
                read=0;
                st2=scw.next();  
                if((temail1.getText()).equals(st2)){read=1;break;} 
            }
            if(read==0){fwr.write(temail1.getText()+" "+tpass1.getText()+"\n");
             fwr.close(); 
             temail1.setText("");
             tpass1.setText(""); 
             JOptionPane.showMessageDialog(fram2,"your data save");
             gui();
            }
             else{ gui();
                temail1.setText("");
                tpass1.setText(""); 
                JOptionPane.showMessageDialog(fram2,"sorry!!your mail Already exist");
             }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
           
    });  

    }
    
    public static void main(String[] args) {
        gui();
        action();
    }
    
}
