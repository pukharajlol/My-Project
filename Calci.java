import java.util.*;
import java.lang.*;
public class Calci extends Abstr {
   static int x,y;
    public static void main(String[] args) {
        Calci obj = new Calci();
       for(int i=1;i>0;i++){ 
        System.out.println("please select your choice");
        System.out.println("1.add  "+"2.sub  "+"3.multi  "+"4.div  "+"5.mod"+"\n"+"6.sin  "+"7.cos  "+"8.tan  "+"9.cot  "+"10.sec  "+"11.cosec"+"\n"+"12.squre");
      Scanner sc = new Scanner(System.in);
       int a= sc.nextInt();
       if(a==1){
        System.out.println("please enter two value");
         x=sc.nextInt();
         y=sc.nextInt();
        obj.add(x,y);

       }
       if(a==2){
        System.out.println("please enter two value");
        x=sc.nextInt();
        y=sc.nextInt();
       obj.sub(x,y);
        
       }
       else if(a==3){
        System.out.println("please enter two value");
        x=sc.nextInt();
        y=sc.nextInt();
       obj.multi(x,y);
        
       }
       else if(a==4){
        System.out.println("please enter two value");
        x=sc.nextInt();
        y=sc.nextInt();
       obj.div(x,y);
        
       }
       else if(a==5){
        System.out.println("please enter two value");
        x=sc.nextInt();
        y=sc.nextInt();
       obj.mod(x,y);
        
       }
       else if(a==6){
        System.out.println("please enter your degri value ");
        x=sc.nextInt();
        
       obj.sin(x);
        
       }
       else if(a==7){
        System.out.println("please enter your degri value ");
        x=sc.nextInt();
        
       obj.cos(x);
        
        
       }
       else if(a==8){System.out.println("please enter your degri value ");
       x=sc.nextInt();
       
      obj.tan(x);
       
        
       }
       else if(a==9){System.out.println("please enter your degri value ");
       x=sc.nextInt();
       
      obj.cot(x);
       
        
       }
       else if(a==10){System.out.println("please enter your degri value ");
       x=sc.nextInt();
       
      obj.sec(x);
       
        
       }
       else if(a==11){System.out.println("please enter your degri value ");
       x=sc.nextInt();
       
      obj.cosec(x);
       
        
       }
       else if(a==12){
        System.out.println("please enter a value ");
        x=sc.nextInt();
        obj.squre(x);
        
       }
        
      }
   
    }
    
}
