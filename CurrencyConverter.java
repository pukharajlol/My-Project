import java.util.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

import java.awt.Font;
import java.lang.Thread.State;
import java.awt.Color;
import java.text.DecimalFormat;
 
public class CurrencyConverter
{ static double money;
   static JFrame fram=new JFrame("currency_convetor");
   static JLabel top=new JLabel("~CURRENCY-CONVETOR~"); 
   static JTextField amount=new JTextField();
   static JButton submit=new JButton("SUBMIT"); 
   static JLabel value=new JLabel("     Value:-");
   static String box[]={"RUPEE","DOLLAR","POUND","EURO","YEN","RINGGIT"};
   static JComboBox cmb=new JComboBox<>(box); 
   static JLabel rup=new JLabel("     RUPEE:-");
   static JLabel dol=new JLabel("     DOLLAR:-");
   static JLabel pou=new JLabel("     POUND:-");
   static JLabel eur=new JLabel("     EURO:-");
   static JLabel ye=new JLabel("     YEN:-");
   static JLabel rin=new JLabel("     RINGGIT:-"); 
   static JTextField trup=new JTextField();
   static JTextField tdol=new JTextField();
   static JTextField tpou=new JTextField();
   static JTextField teur=new JTextField();
   static JTextField tye=new JTextField();
   static JTextField trin=new JTextField();

   static void gui(){
      fram.setBounds(50, 50, 470, 600); 
      fram.getContentPane().setBackground(Color.DARK_GRAY);  
      fram.setLayout(null);

      top.setBounds(100, 20, 255, 20);
      top.setBackground(Color.pink);
      top.setOpaque(true);
      top.setFont(new Font("serif",Font.BOLD,20)); 

      value.setBounds(70, 100, 80, 30);
      value.setBackground(Color.WHITE);
      value.setOpaque(true);

      cmb.setBounds(160, 150, 100, 30);
      cmb.setBackground(Color.WHITE);
      cmb.setOpaque(true);
      
      amount.setBounds(160, 100, 200, 30);

      submit.setBounds(280, 150, 80, 30);
      submit.setBackground(Color.WHITE);
      submit.setOpaque(true); 

      rup.setBounds(70, 190, 80, 30);
      rup.setBackground(Color.WHITE);
      rup.setOpaque(true);
      trup.setBounds(160, 190, 200, 30); 
      

      dol.setBounds(70, 240, 80, 30);
      dol.setBackground(Color.WHITE);
      dol.setOpaque(true);
      tdol.setBounds(160, 240, 200, 30); 
     
     
      pou.setBounds(70, 290, 80, 30);
      pou.setBackground(Color.WHITE);
      pou.setOpaque(true);
      tpou.setBounds(160, 290, 200, 30); 
     
      eur.setBounds(70, 340, 80, 30);
      eur.setBackground(Color.WHITE);
      eur.setOpaque(true);
      teur.setBounds(160, 340, 200, 30); 
     

      ye.setBounds(70, 390, 80, 30);
      ye.setBackground(Color.WHITE);
      ye.setOpaque(true);
      tye.setBounds(160, 390, 200, 30); 
     

      rin.setBounds(70, 440, 80, 30);
      rin.setBackground(Color.WHITE);
      rin.setOpaque(true);
      trin.setBounds(160, 440, 200, 30); 
      fram.add(rup);
      fram.add(trup); 
      fram.add(dol);
      fram.add(tdol);
      fram.add(pou);
      fram.add(tpou);
      fram.add(eur);
      fram.add(teur);
      fram.add(ye);
      fram.add(tye); 
      fram.add(rin);
      fram.add(trin);
      fram.add(value);
      fram.add(submit);
      fram.add(top);
      fram.add(cmb); 
      fram.add(amount); 

                 submit.addActionListener(e1->{ 
                              String s=amount.getText(); 
                               money=Double.parseDouble(s); 
                               Object ob=(cmb.getSelectedItem());
                               String ob1=ob.toString();
                               if(ob1.equals("RUPEE")){
                                 double r=money;
                                 double d= money/70; 
                                 double p = money / 88;
                                 double e = money / 80;
                                 double y = money / 0.63;
                                 double ri = money / 16;
   
                                  String r1=Double.toString(r);
                                  String d1=Double.toString(d);
                                  String p1=Double.toString(p);
                                  String e11=Double.toString(e);
                                  String y1=Double.toString(y);
                                  String rii=Double.toString(ri);
   
                                  trup.setText(r1);
                                  tdol.setText(d1);
                                  tpou.setText(p1);
                                  teur.setText(e11);
                                  tye.setText(y1);
                                  trin.setText(rii);}
                                 else if(ob1.equals("DOLLAR")){double r=money*70;
                                    double d= money; 
                                    double p = money*.78;
                                    double e = money*.87;
                                    double y = money*111.087;
                                    double ri = money*4.17;
            
                                     String r1=Double.toString(r);
                                     String d1=Double.toString(d);
                                     String p1=Double.toString(p);
                                     String e11=Double.toString(e);
                                     String y1=Double.toString(y);
                                     String rii=Double.toString(ri);
            
                                     trup.setText(r1);
                                     tdol.setText(d1);
                                     tpou.setText(p1);
                                     teur.setText(e11);
                                     tye.setText(y1);
                                     trin.setText(rii);
                  }
                                 else if(ob1.equals("POUND")){double r=money*88;
                                    double d= money*1.26; 
                                    double p = money ;
                                    double e = money*1.10;
                                    double y = money *140.93;
                                    double ri = money*5.29;
                  
                                     String r1=Double.toString(r);
                                     String d1=Double.toString(d);
                                     String p1=Double.toString(p);
                                     String e11=Double.toString(e);
                                     String y1=Double.toString(y);
                                     String rii=Double.toString(ri);
                  
                                     trup.setText(r1);
                                     tdol.setText(d1);
                                     tpou.setText(p1);
                                     teur.setText(e11);
                                     tye.setText(y1);
                                     trin.setText(rii);
                  }
                                  else  if(ob1.equals("EURO")){double r=money*88;
                                    double d= money*1.14; 
                                    double p = money*0.90;
                                    double e = money;
                                    double y = money*127.32;
                                    double ri = money*4.78;
                        
                                     String r1=Double.toString(r);
                                     String d1=Double.toString(d);
                                     String p1=Double.toString(p);
                                     String e11=Double.toString(e);
                                     String y1=Double.toString(y);
                                     String rii=Double.toString(ri);
                        
                                     trup.setText(r1);
                                     tdol.setText(d1);
                                     tpou.setText(p1);
                                     teur.setText(e11);
                                     tye.setText(y1);
                                     trin.setText(rii);
                        
                        }
                                 else if(ob1.equals("YEN")){double r=money*0.63;
                                    double d= money*0.008; 
                                    double p = money*0.007;
                                    double e = money*0.007;
                                    double y = money;
                                    double ri = money*0.037 ;
                              
                                     String r1=Double.toString(r);
                                     String d1=Double.toString(d);
                                     String p1=Double.toString(p);
                                     String e11=Double.toString(e);
                                     String y1=Double.toString(y);
                                     String rii=Double.toString(ri);
                              
                                     trup.setText(r1);
                                     tdol.setText(d1);
                                     tpou.setText(p1);
                                     teur.setText(e11);
                                     tye.setText(y1);
                                     trin.setText(rii);}
                                 else if(ob1.equals("RINGGIT")){double r=money*16.8;
                                    double d= money*0.239; 
                                    double p = money*0.188;
                                    double e = money*0.209;
                                    double y = money*26.63;
                                    double ri = money;
                                 
                                     String r1=Double.toString(r);
                                     String d1=Double.toString(d);
                                     String p1=Double.toString(p);
                                     String e11=Double.toString(e);
                                     String y1=Double.toString(y);
                                     String rii=Double.toString(ri);
                                 
                                     trup.setText(r1);
                                     tdol.setText(d1);
                                     tpou.setText(p1);
                                     teur.setText(e11);
                                     tye.setText(y1);
                                     trin.setText(rii);
                                 }
                                   
                  
                     });
 

      
      fram.setVisible(true);
   }
   

   public static void main(String[] args)
       {
        gui();
      }
   }
 