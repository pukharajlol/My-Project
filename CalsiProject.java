 
import java.awt.Color;
	import java.awt.Font;
	import java.awt.event.*;
	import javax.swing.*;
	import java.lang.*;
	import java.util.ArrayList;
	import java.util.Scanner;
	public class CalsiProject {
	    static  JFrame fram=new JFrame("Calaulator");
	    static JTextField output=new JTextField();
	    static  JButton bt1=new JButton("1");
	    static  JButton bt2=new JButton("2");
	    static  JButton bt3=new JButton("3");
	    static JButton bt4=new JButton("4");
	    static JButton bt5=new JButton("5");
	    static JButton bt6=new JButton("6");
	    static JButton bt7=new JButton("7");
	   static  JButton bt8=new JButton("8");
	   static JButton bt9=new JButton("9");
	   static JButton bt00=new JButton("00");
	   static JButton btpo=new JButton(".");
	   static JButton bt0=new JButton("0");
	   static JButton btcl=new JButton("C");
	   static JButton btplus=new JButton("+");
	   static JButton btmin=new JButton("-");
	   static JButton btmulti=new JButton("*");
	   static JButton btdiv=new JButton("/");
	   static JButton bteq=new JButton("=");
	   static String op="";
	   
	    static void clasiFram(){
	        fram.setSize(395,363);
	        fram.setLayout(null);
	        fram.getContentPane().setBackground(Color.BLACK); 
	        output.setBounds(5, 5, 370, 40);
	        output.setFont(new Font("serif",Font.BOLD,24));
	        output.setHorizontalAlignment(JTextField.RIGHT);  
	        
	       
	   bt1.setBounds(5, 50, 95, 50);
	   bt1.setFont(new Font("serif",Font.BOLD,20));
	   fram.add(bt1);
	   
	
	  
	 bt2.setBounds(105, 50, 95, 50);
	 bt2.setFont(new Font("serif",Font.BOLD,20));
	 fram.add(bt2);
	
	    
	 bt3.setBounds(205, 50, 95, 50);
	 bt3.setFont(new Font("serif",Font.BOLD,20));
	 fram.add(bt3); 
	 
	 
	 bt4.setBounds(5, 105, 95, 50);
	 bt4.setFont(new Font("serif",Font.BOLD,20));
	 fram.add(bt4);
	 
	
	bt5.setBounds(105, 105, 95, 50);
	bt5.setFont(new Font("serif",Font.BOLD,20));
	fram.add(bt5);
	
	
	bt6.setBounds(205, 105, 95, 50);
	bt6.setFont(new Font("serif",Font.BOLD,20));
	fram.add(bt6);
	  
	
	bt7.setBounds(5, 160, 95, 50);
	bt7.setFont(new Font("serif",Font.BOLD,20));
	fram.add(bt7);
	 
	
	bt8.setBounds(105, 160, 95, 50);
	bt8.setFont(new Font("serif",Font.BOLD,20));
	fram.add(bt8);
	
	
	bt9.setBounds(205, 160, 95, 50);
	bt9.setFont(new Font("serif",Font.BOLD,20));
	fram.add(bt9);
	 
	
	bt00.setBounds(5, 215, 95, 50);
	bt00.setFont(new Font("serif",Font.BOLD,20));
	fram.add(bt00);
	 
	
	btpo.setBounds(105, 215, 95, 50);
	btpo.setFont(new Font("serif",Font.BOLD,20));
	fram.add(btpo);
	 
	
	bt0.setBounds(205, 215, 95, 50);
	bt0.setFont(new Font("serif",Font.BOLD,20));
	fram.add(bt0);
	  
	
	 btcl.setBounds( 305, 50, 70, 50);
	 btcl.setFont(new Font("serif",Font.BOLD,20));
	 fram.add(btcl);
	
	 
	btplus.setBounds( 305, 105, 70, 50);
	btplus.setFont(new Font("serif",Font.BOLD,20));
	fram.add(btplus);
	
	
	btmin.setBounds( 305, 160, 70, 50);
	btmin.setFont(new Font("serif",Font.BOLD,20));
	fram.add(btmin);
	
	
	btmulti.setBounds( 305, 215, 70, 50);
	btmulti.setFont(new Font("serif",Font.BOLD,20));
	fram.add(btmulti);
	
	
	btdiv.setBounds( 305, 270, 70, 50);
	btdiv.setFont(new Font("serif",Font.BOLD,25));
	fram.add(btdiv);
	 
	
	
	bteq.setBounds( 5, 270, 295, 50);
	bteq.setFont(new Font("serif",Font.BOLD,30));
	fram.add(bteq);
	
	
	        fram.add(output);
	        fram.setVisible(true);
	    }
	
	    static void actionbutton(){
	        ArrayList<String> out = new ArrayList<String>(10);
	
	        bt1.addActionListener(e->{ String num= bt1.getText() ;
	            String num1=output.getText()+num;
	            output.setText(num1);});
	        
	        bt2.addActionListener(e->{ String num= bt2.getText() ;
	                String num1=output.getText()+num;
	                output.setText(num1);});
	        
	        bt3.addActionListener(e->{ String num= bt3.getText() ;
	                    String num1=output.getText()+num;
	                    output.setText(num1);});
	                    
	                    bt4.addActionListener(e->{ String num= bt4.getText() ;
	                        String num1=output.getText()+num;
	                        output.setText(num1);});
	
	                        bt5.addActionListener(e->{ String num= bt5.getText() ;
	                            String num1=output.getText()+num;
	                            output.setText(num1);});
	
	                            bt6.addActionListener(e->{ String num= bt6.getText() ;
	                                String num1=output.getText()+num;
	                                output.setText(num1);});
	
	                                bt7.addActionListener(e->{ String num= bt7.getText() ;
	                                    String num1=output.getText()+num;
	                                    output.setText(num1);});
	
	                                    bt8.addActionListener(e->{ String num= bt8.getText() ;
	                                        String num1=output.getText()+num;
	                                        output.setText(num1);});
	
	                                        bt9.addActionListener(e->{ String num= bt9.getText() ;
	                                            String num1=output.getText()+num;
	                                            output.setText(num1);});
	
	                                            bt0.addActionListener(e->{ String num= bt0.getText() ;
	                                                String num1=output.getText()+num;
	                                                output.setText(num1);});
	
	                                                bt00.addActionListener(e->{ String num= bt00.getText() ;
	                                                    String num1=output.getText()+num;
	                                                    output.setText(num1);});
	                                                    btpo.addActionListener(e->{ String num= btpo.getText() ;
	                                                        String num1=output.getText()+num;
	                                                        output.setText(num1);});
	
	                                                        btplus.addActionListener(e->{  
	                                                            out.add(output.getText());
	                                                            output.setText("");
	                                                             out.add(btplus.getText());});
	
	                                                             btmin.addActionListener(e->{  
	                                                                out.add(output.getText());
	                                                                output.setText("");
	                                                                 out.add(btmin.getText());});
	
	                                                                 btmulti.addActionListener(e->{  
	                                                                    out.add(output.getText());
	                                                                    output.setText("");
	                                                                     out.add(btmulti.getText());});
	
	                                                                     btdiv.addActionListener(e->{  
	                                                                        out.add(output.getText());
	                                                                        output.setText("");
	                                                                         out.add(btdiv.getText());});
	
	                                                                         btcl.addActionListener(e->{ 
	                                                                            output.setText("0");
	                                                                            out.clear();
	                                                                            });
	
	                                                                         bteq.addActionListener(e->{  
	                                                                            out.add(output.getText());                 
	                for(int i=0;i<out.size();i++){
	                    if(out.get(i)=="+"){
	                        System.out.println(out.get(i));
	                        Double A=Double.parseDouble(out.get(i-1));
	                        System.out.println(out.get(i-1));
	                        Double B=Double.parseDouble(out.get(i+1));
	                        System.out.println(out.get(i+1));
	                        Double C=A+B;
	                        String D= Double.toString(C);
	                        output.setText(D);
	                    }
	                    else  if(out.get(i)=="-"){
	                        System.out.println(out.get(i));
	                        Double A=Double.parseDouble(out.get(i-1));
	                        System.out.println(out.get(i-1));
	                        Double B=Double.parseDouble(out.get(i+1));
	                        System.out.println(out.get(i+1));
	                        Double C=A-B;
	                        String D= Double.toString(C);
	                        output.setText(D);
	                    }
	                    else  if(out.get(i)=="*"){
	                        System.out.println(out.get(i));
	                        Double A=Double.parseDouble(out.get(i-1));
	                        System.out.println(out.get(i-1));
	                        Double B=Double.parseDouble(out.get(i+1));
	                        System.out.println(out.get(i+1));
	                        Double C=A*B;
	                        String D= Double.toString(C);
	                        output.setText(D);
	                    }
	                    else  if(out.get(i)=="/"){
	                        System.out.println(out.get(i));
	                        Double A=Double.parseDouble(out.get(i-1));
	                        System.out.println(out.get(i-1));
	                        Double B=Double.parseDouble(out.get(i+1));
	                        System.out.println(out.get(i+1));
	                        Double C=A/B;
	                        String D= Double.toString(C);
	                        output.setText(D);
	                    }
	                     }
	               });          
	       
	    }   
	    public static void main(String[] args) {
	        clasiFram();
	        actionbutton();
	    }
	     
	}
