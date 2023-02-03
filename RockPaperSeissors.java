       import java.lang.*;
       import java.util.*;
       import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

import java.awt.Font;
import java.awt.Color;
import java.text.DecimalFormat;

import javax.sound.sampled.SourceDataLine;
import javax.swing.JFrame; 
      
 public class RockPaperSeissors {
 static String random(){
            String arr[]={"rock","paper","scissor"};
            Random ran=new Random();
            int index=ran.nextInt(arr.length);
            String st=arr[index]; 
               return st;
           } 
           static int count=0;
          static JFrame fram=new JFrame("Rock-Paper-Scissor-Game");
          static JLabel top1=new JLabel("~~WEL-COME~~");
          static  JLabel top2=new JLabel("ROCK-PAPER-SCISSOR-GAME");
          static  JLabel start =new JLabel("T.C.G");
          static JLabel round=new JLabel("ROUND");
          static   JTextField tround=new JTextField();
          static   JLabel choo=new JLabel("USER CHOISE:");
          static   String usc[]={"rock","paper","scissor"};
          static   JComboBox cmb=new JComboBox<>(usc); 
          static   JButton enter=new JButton("ENTER");
          static   JLabel choo1=new JLabel("SYSTEM CHOISE:");
          static   JTextField tchoo1=new JTextField();
          static  JLabel result1=new JLabel("ROUND-1:");
          static   JTextField tresult1=new JTextField();
          static    JLabel result2=new JLabel("ROUND-2:");
          static    JTextField tresult2=new JTextField();
          static   JLabel result3=new JLabel("ROUND-3:");
          static    JTextField tresult3=new JTextField();
          static   JLabel over=new JLabel("~GAME-OVER~");
          static  JLabel result=new JLabel("FINEL-RESULT:");
          static   JTextField tresult=new JTextField();
        
 static void gui(){ 
            fram.setBounds(50, 50, 500, 500);
            fram.setLayout(null);
            fram.getContentPane().setBackground(Color.BLUE);
            
           

            top1.setBounds(170, 20, 160, 20);
            top1.setBackground(Color.pink);
            top1.setOpaque(true);
            top1.setFont(new Font("serif",Font.BOLD,20)); 

            top2.setBounds(100, 50, 300, 20);
            top2.setBackground(Color.pink);
            top2.setOpaque(true);
            top2.setFont(new Font("serif",Font.BOLD,20)); 

            
            start.setBounds(190, 100, 60, 20);
            start.setBackground(Color.RED);
            start.setOpaque(true);
            start.setFont(new Font("serif",Font.BOLD,20)); 

          
            round.setBounds(150, 140, 80, 20);
            round.setBackground(Color.PINK);
            round.setOpaque(true);
            round.setFont(new Font("serif",Font.BOLD,20)); 

           
            tround.setBounds(240, 140, 40, 20);
            tround.setBackground(Color.PINK);
            tround.setOpaque(true);
            tround.setFont(new Font("serif",Font.BOLD,20));

          
            choo.setBounds(0, 180, 140, 20);
            choo.setBackground(Color.WHITE);
            choo.setOpaque(true);
            choo.setFont(new Font("serif",Font.BOLD,20)); 
           
          
            cmb.setBounds(150, 180, 130, 20);
            cmb.setBackground(Color.WHITE);
            cmb.setOpaque(true);
            cmb.setFont(new Font("serif",Font.BOLD,15)); 
            
           
            enter.setBounds(290, 180, 150, 20);
            enter.setBackground(Color.WHITE);
            enter.setOpaque(true);
            enter.setFont(new Font("serif",Font.BOLD,15)); 
            
          
            choo1.setBounds(0, 220, 180, 20);
            choo1.setBackground(Color.WHITE);
            choo1.setOpaque(true);
            choo1.setFont(new Font("serif",Font.BOLD,20));
             
          
            tchoo1.setBounds(190, 220, 180, 20);
            tchoo1.setBackground(Color.WHITE);
            tchoo1.setOpaque(true);
            tchoo1.setFont(new Font("serif",Font.BOLD,20));

         
            result1.setBounds(0, 280, 110, 20);
            result1.setBackground(Color.WHITE);
            result1.setOpaque(true);
            result1.setFont(new Font("serif",Font.BOLD,20));

           
            tresult1.setBounds(120, 280, 150, 20);
            tresult1.setBackground(Color.WHITE);
            tresult1.setOpaque(true);
            tresult1.setFont(new Font("serif",Font.BOLD,20));
           
            result2.setBounds(0, 310, 110, 20);
            result2.setBackground(Color.WHITE);
            result2.setOpaque(true);
            result2.setFont(new Font("serif",Font.BOLD,20));
            
            tresult2.setBounds(120, 310, 150, 20);
            tresult2.setBackground(Color.WHITE);
            tresult2.setOpaque(true);
            tresult2.setFont(new Font("serif",Font.BOLD,20));
            
            result3.setBounds(0, 340, 110, 20);
            result3.setBackground(Color.WHITE);
            result3.setOpaque(true);
            result3.setFont(new Font("serif",Font.BOLD,20));
           
            tresult3.setBounds(120, 340, 150, 20);
            tresult3.setBackground(Color.WHITE);
            tresult3.setOpaque(true);
            tresult3.setFont(new Font("serif",Font.BOLD,20));
           
            over.setBounds(140, 370, 170, 20);
                 over.setBackground(Color.RED);
                 over.setOpaque(true);
                 over.setFont(new Font("serif",Font.BOLD,20));
           
           
            result.setBounds(0, 400, 160, 20);
            result.setBackground(Color.WHITE);
            result.setOpaque(true);
            result.setFont(new Font("serif",Font.BOLD,20));
            
            tresult.setBounds(180, 400, 180, 20);
            tresult.setBackground(Color.WHITE);
            tresult.setOpaque(true);
            tresult.setFont(new Font("serif",Font.BOLD,20)); 

          

             fram.add(top1);
             fram.add(top2);
             fram.add(choo);
             fram.add(choo1);
             fram.add(tchoo1);
             fram.add(cmb);
             fram.add(enter);
             fram.add(round);
             fram.add(tround);
             fram.add(result1);
             fram.add(result2);
             fram.add(result3);
             fram.add(result);
             fram.add(tresult1);
             fram.add(tresult2);
             fram.add(tresult3);
             fram.add(tresult);
             fram.add(over);
             fram.add(start);
              
            fram.setVisible(true);
           }
    static String a,b; 
    static int i=0, pointa=0,pointb=0;      

    public static void main(String[] args) {
        gui();
         
        enter.addActionListener(e11->{  
        i++;
      
        if(i==4) {
          i=0;  
          tchoo1.setText("");
          tresult1.setText("");
          tresult2.setText("");
          tresult3.setText("");
          tresult.setText("");
          enter.setText("ENTER");
          tround.setText("");
          pointa=0;
          pointb=0;
        } 
        if((i==1)||(i==2)||(i==3)){ 
          String ro=Integer.toString(i);
          tround.setText(ro);
                
           Object ob=(cmb.getSelectedItem());
             a=ob.toString();      
             b= random();
             tchoo1.setText(b); 
         if(a.equals("rock")){      
                  if(b.equals("rock")){
                  if(i==1){ tresult1.setText("GAME-TIE"); }
                  if(i==2){ tresult2.setText("GAME-TIE"); }
                  if(i==3){ tresult3.setText("GAME-TIE"); }
                   
             }
                   else   if(b.equals("paper")){
                    pointb++;
                  if(i==1){ tresult1.setText("SYSTEM-WIN");}
                  if(i==2){ tresult2.setText("SYSTEM-WIN");}
                  if(i==3){ tresult3.setText("SYSTEM-WIN");}
                              
                          }
                else   if(b.equals("scissor")){
                  pointa++;
                if(i==1){ tresult1.setText("USER-WIN");}
                if(i==2){ tresult2.setText("USER-WIN");}
                if(i==3){ tresult3.setText("USER-WIN");} 
              } 
             }
         else if(a.equals("paper")){
            if(b.equals("rock")){
              pointa++;
             if(i==1){ tresult1.setText("USER-WIN");}
             if(i==2){ tresult2.setText("USER-WIN"); }
             if(i==3){ tresult3.setText("USER-WIN"); } 
                               }
             else if(b.equals("paper")){
                 if(i==1){ tresult1.setText("GAME-TIE"); }
                  if(i==2){ tresult2.setText("GAME-TIE");}
                  if(i==3){ tresult3.setText("GAME-TIE"); }
                                  
                              }
             else   if(b.equals("scissor")){
              pointb++;
             if(i==1){ tresult1.setText("SYSTEM-WIN");}
             if(i==2){ tresult2.setText("SYSTEM-WIN");}
             if(i==3){ tresult3.setText("SYSTEM-WIN");}}
                  }   
                         
         else if(a.equals("scissor")){ 
           if(b.equals("rock")){
            pointb++;
             if(i==1){ tresult1.setText("SYSTEM-WIN");}
             if(i==2){ tresult2.setText("SYSTEM-WIN"); }
             if(i==3){ tresult3.setText("SYSTEM-WIN") ;}
                                          }
          else  if(b.equals("paper")){
            pointa++;
           if(i==1){ tresult1.setText("USER-WIN");}
           if(i==2){ tresult2.setText("USER-WIN"); }
           if(i==3){ tresult3.setText("USER-WIN"); }               
                                               }
         else   if(b.equals("scissor")){
         if(i==1){ tresult1.setText("GAME-TIE"); }
         if(i==2){ tresult2.setText("GAME-TIE"); }
         if(i==3){ tresult3.setText("GAME-TIE"); }}
                }     
                }
                if(i==3){
                  if(pointa==pointb){  tresult.setText("GAME-TIE");}
                  else if(pointa>pointb){  tresult.setText("USER-WIN");}
                 else  if(pointa<pointb){  tresult.setText("SYSTEM-WIN"); } 
                 enter.setText("RESET-GAME");

                 
                }
         }); 
}}

       
    
    

