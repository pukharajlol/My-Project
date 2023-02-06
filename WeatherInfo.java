 

import java.awt.Color;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.Collator;
import java.util.*;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.lang.*;
import java.lang.Thread.State;

import org.json.simple.*;
import org.json.simple.parser.JSONParser; 
public class WeatherInfo {
    static Double lat,lon;
    static String city1,state1;
    static  DecimalFormat df = new DecimalFormat("0.00");
    static JFrame fram=new JFrame("weather_info");
    static JLabel top=new JLabel("     WEATHER_INFO YOUR CITY");
    static JLabel city=new JLabel("  City_Name:-");
    static JLabel state=new JLabel(" State_Name:-");
    static JTextField tcity=new JTextField();
    static JTextField tstate=new JTextField();
    static JLabel lo=new JLabel("  Longitude:-");
    static  JLabel la=new JLabel("  Lattitude:-");
    static JLabel temp=new JLabel("   Temp:-");
    static JLabel tempmax=new JLabel("  Max_Temp:-");
    static JLabel tempmin=new JLabel("   Min_Temp:-");
    static JLabel pressure=new JLabel("   Pressure:-");
    static JLabel visibility=new JLabel("   Visibility:-");
    static JLabel sunrise=new JLabel("   Sunrise:-");
    static JLabel sunset=new JLabel("   Sunset:-");
    static JLabel windspeed=new JLabel("Wind_Speed:-");
    static JTextField ttemp=new JTextField();
    static JTextField ttempmax=new JTextField();
    static JTextField ttempmin=new JTextField();
    static JTextField tpressure=new JTextField();
    static JTextField tvisibility=new JTextField();
    static JTextField tsunrise=new JTextField();
    static JTextField tsunset=new JTextField();
    static JTextField twindspeed=new JTextField(); 
    static JTextField tlo=new JTextField();
    static  JTextField tla=new JTextField();
    static JButton result=new JButton(" Click for Weather_Report");
    static void gui(){

        fram.setBounds(0, 0, 350, 500);
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
        
        lo.setBounds(20, 180, 80, 20);
        lo.setBackground(Color.yellow);
        lo.setOpaque(true);
        tlo.setBounds(110, 180, 150, 20);

        la.setBounds(20, 205, 80, 20);
        la.setBackground(Color.yellow);
        la.setOpaque(true);
        tla.setBounds(110, 205, 150, 20);

        temp.setBounds(20, 230, 80, 20);
        temp.setBackground(Color.yellow);
        temp.setOpaque(true);
        ttemp.setBounds(110, 230, 150, 20);

        tempmax.setBounds(20, 255, 80, 20);
        tempmax.setBackground(Color.yellow);
        tempmax.setOpaque(true);
        ttempmax.setBounds(110, 255, 150, 20);

        tempmin.setBounds(20, 280, 80, 20);
        tempmin.setBackground(Color.yellow);
        tempmin.setOpaque(true);
        ttempmin.setBounds(110, 280, 150, 20);

        pressure.setBounds(20, 305, 80, 20);
        pressure.setBackground(Color.yellow);
        pressure.setOpaque(true);
        tpressure.setBounds(110, 305, 150, 20);

        visibility.setBounds(20, 330, 80, 20);
        visibility.setBackground(Color.yellow);
        visibility.setOpaque(true);
        tvisibility.setBounds(110, 330, 150, 20);

        sunrise.setBounds(20, 355, 80, 20);
        sunrise.setBackground(Color.yellow);
        sunrise.setOpaque(true);
        tsunrise.setBounds(110, 355, 150, 20);

        sunset.setBounds(20, 380, 80, 20);
        sunset.setBackground(Color.yellow);
        sunset.setOpaque(true);
        tsunset.setBounds(110, 380, 150, 20);
        
        windspeed.setBounds(20, 405, 80, 20);
        windspeed.setBackground(Color.yellow);
        windspeed.setOpaque(true);
        twindspeed.setBounds(110, 405, 150, 20);
        
        fram.add(temp);
        fram.add(tempmax);
        fram.add(tempmin);
        fram.add(ttemp);
        fram.add(ttempmax);
        fram.add(ttempmin);
        fram.add(pressure);
        fram.add(visibility);
        fram.add(sunrise);
        fram.add(sunset);
        fram.add(windspeed);
        fram.add(tpressure);
        fram.add(tvisibility);
        fram.add(tsunrise);
        fram.add(tsunset);
        fram.add(twindspeed); 
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
                } 
                URL xx= new URL("https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid=3c195ac2b0a81bd8c03935152491bf63");
                HttpURLConnection dat=(HttpURLConnection) xx.openConnection();
                dat.setRequestMethod("GET");
                InputStreamReader i=new InputStreamReader(dat.getInputStream());
                Scanner bf=new Scanner(i);
                String fi=""; 
                while(bf.hasNextLine()){
                 fi+=bf.nextLine();  
             } 
             
             JSONObject obj1=(JSONObject)par.parse(fi);
             JSONObject ob = (JSONObject)obj1.get("coord");
             JSONObject ob2 = (JSONObject)obj1.get("main");
             JSONObject ob3 = (JSONObject)obj1.get("wind");
             JSONObject ob4 = (JSONObject)obj1.get("sys");  
             System.out.println(ob2.get("pressure"));
             System.out.println(obj1.get("visibility"));
             System.out.println(ob4.get("sunrise"));
             System.out.println(ob4.get("sunset"));
             System.out.println(ob3.get("speed"));
             System.out.println(ob.get("lon"));
             System.out.println(ob.get("lat"));
             Double d1=(Double)(ob2.get("temp"));
             Double d2=(Double)(ob2.get("temp_min"));
             Double d3=(Double)(ob2.get("temp_max"));
             d1-=273.15;
             d2-=273.15;
             d3-=273.15;
               ttemp.setText(df.format(d1).toString()+" °C");
               ttempmax.setText(df.format(d2).toString()+" °C");
               ttempmin.setText(df.format(d3).toString()+ " °C");
               tpressure.setText(ob2.get("pressure").toString());
               tvisibility.setText(obj1.get("visibility").toString());
               tsunrise.setText(ob4.get("sunrise").toString());
               tsunset.setText(ob4.get("sunset").toString());
               twindspeed.setText(ob3.get("speed").toString()+" km/h");
               tlo.setText(ob.get("lon").toString());
               tla.setText(ob.get("lat").toString());
 
 
            bf.close();
           
        }
        catch(Exception e1 ){
 
       }

       });

    }
    
    public static void main(String[] args) {
        gui();  
    }
}
