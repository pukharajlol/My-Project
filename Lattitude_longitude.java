
import java.awt.Color;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.Collator;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.lang.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser; 
public class Lattitude_longitude {
    static Double lat,lon;
    static String city1,state1;
    static JFrame fram=new JFrame("long&latti");
    static JLabel top=new JLabel("  LATTITUDE & LONGITUDE FINDER");
    static JLabel city=new JLabel("  City_Name:-");
    static JLabel state=new JLabel(" State_Name:-");
    static JTextField tcity=new JTextField();
    static JTextField tstate=new JTextField();
    static JLabel lo=new JLabel("  Longitude:-");
    static  JLabel la=new JLabel("  Lattitude:-");
    static JTextField tlo=new JTextField();
    static  JTextField tla=new JTextField();
    static JButton result=new JButton("Result..");
    static void gui(){

        fram.setBounds(0, 0, 350, 400);
        fram.getContentPane().setBackground(Color.DARK_GRAY);   
        fram.setLayout(null);

        top.setBounds(50, 10, 200, 30);
        top.setBackground(Color.GREEN);
        top.setOpaque(true);

        city.setBounds(20, 50, 80, 30);
        city.setBackground(Color.pink);
        city.setOpaque(true);
        tcity.setBounds(110, 50, 150, 30);
        state.setBounds(20, 90, 80, 30);
        state.setBackground(Color.pink);
        state.setOpaque(true);
        tstate.setBounds(110, 90, 150, 30);

        result.setBounds(20, 140, 240, 30);
        result.setBackground(Color.pink);
        result.setOpaque(true);
        
        lo.setBounds(20, 180, 80, 30);
        lo.setBackground(Color.yellow);
        lo.setOpaque(true);
        tlo.setBounds(110, 180, 150, 30);
        la.setBounds(20, 220, 80, 30);
        la.setBackground(Color.yellow);
        la.setOpaque(true);
        tla.setBounds(110, 220, 150, 30);
        fram.add(top);
        fram.add(city);
        fram.add(tcity);
        fram.add(state);
        fram.add(tstate);
         fram.add(lo);
        fram.add(tlo);
        fram.add(la);
        fram.add(tla);
         
       
        fram.add(result);
        fram.setVisible(true);

    }
    
    public static void main(String[] args) {
        gui(); 
        result.addActionListener(e->{
           
             city1=tcity.getText();
             state1=tstate.getText();
             try{ 
                URL wd=new URL("http://api.openweathermap.org/geo/1.0/direct?q="+city1+","+state1+",IN&limit=5&appid=3c195ac2b0a81bd8c03935152491bf63");
                HttpURLConnection can=(HttpURLConnection) wd.openConnection();
                can.setRequestMethod("GET");
                InputStreamReader in=new InputStreamReader(can.getInputStream());
                Scanner in1 =new Scanner(in); 
                 String st ="";
                 while(in1.hasNextLine()){  
                  st+=in1.nextLine(); 
              }   
              in1.close();
              JSONParser par= new JSONParser();
                JSONArray arr=(JSONArray) par.parse(st);
                 for(int i=0;i<arr.size();i++){
               JSONObject obj=(JSONObject) arr.get(i);
                lon= (Double)obj.get("lon");
              lat= (Double)obj.get("lat");  
              tlo.setText(lon.toString());
              tla.setText(lat.toString());

                 } 
         }
         catch(Exception e1 ){
  
        }

        });
      
       
       
    }
}
