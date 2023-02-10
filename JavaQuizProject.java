 
import java.awt.Font;
	
	import javax.swing.ButtonGroup;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JRadioButton;
	import javax.swing.JTextField;
	import java.awt.Color;
	
	public class JavaQuizProject {
	    static int count =0;
	    static int right=0;
	    static JFrame mainfram=new JFrame("Pukharaj Java Quiz");  
	    static JLabel toplabel=new JLabel("JAVA QUIZ");
	    static JLabel quelabel=new JLabel("यहा पर प्रश्न प्रदर्शित किया जाायेगा");
	    static JRadioButton optionA=new JRadioButton("A");
	    static JLabel optionAlabel=new JLabel("इनमे से किसी एक का चयन करे। ");
	    static JRadioButton optionB=new JRadioButton("B");
	    static JLabel optionBlabel=new JLabel("सोच समझकर उत्तर दे");
	    static JRadioButton optionC=new JRadioButton("C");
	    static JLabel optionClabel=new JLabel("एक बार जवाब देने के बाद उत्तर नही बदले ");
	    static JRadioButton optionD=new JRadioButton("D");
	    static JLabel optionDlabel=new JLabel("प्रश्नोतरी शुरु करे।");
	    static JLabel answerlabel=new JLabel("प्रश्न का जवाब");
	    static JButton nextbt=new JButton("START QUIZ");
	    static JFrame resultfram=new JFrame("Quiz Result Fram");
	    static JLabel taglabel=new JLabel("Test Report");
	    static JButton showresultbt=new JButton("Show Result");
	    static JLabel resultlabel=new JLabel("Mr./Mrs. Your Number Of Correct Question :");
	    static JTextField resultfield=new JTextField("result");
	    static JLabel wronglabel=new JLabel("Mr./Mrs. Your Number Of InCorrect Question :");
	    static JTextField wrongfield=new JTextField("result");
	    static JLabel percentlabel=new JLabel("Mr./Mrs. Your Percent Mark's :");
	    static JTextField percentfield=new JTextField("result");
	    static JButton gobackbt=new JButton("Go Back");
	    static ButtonGroup G = new ButtonGroup();
	        
	    static void mainFram(){
	    mainfram.setLayout(null);
	    mainfram.setSize(400, 400); 
	    mainfram.getContentPane().setBackground(Color.CYAN); 
	    resultfram.getContentPane().setBackground(Color.RED); 
	    toplabel.setBounds(100, 10,400, 50);
	    toplabel.setFont(new Font("serif",Font.BOLD,30));
	    quelabel.setBounds(10, 70, 390, 40);
	    quelabel.setFont(new Font("serif",Font.ITALIC,15));
	    optionA.setBounds(15, 130, 40, 20);
	    optionA.setFont(new Font("serif",Font.BOLD ,15));
	    optionAlabel.setBounds(65, 130, 340, 20);
	    optionB.setBounds(15, 160, 40, 20);
	    optionB.setFont(new Font("serif",Font.BOLD ,15));
	    optionBlabel.setBounds(65, 160, 340, 20);
	    optionC.setBounds(15, 190, 40, 20);
	    optionC.setFont(new Font("serif",Font.BOLD ,15));
	    optionClabel.setBounds(65, 190, 340, 20);
	    optionD.setBounds(15, 220, 40, 20);
	    optionD.setFont(new Font("serif",Font.BOLD ,15));
	    optionDlabel.setBounds(65, 220, 340, 20);
	    answerlabel.setBounds(30, 250, 150, 20);
	    nextbt.setBounds(150, 255, 200, 20);
	    
	    taglabel.setBounds(100, 10,400, 50);
	    taglabel.setFont(new Font("serif",Font.BOLD,30));
	    showresultbt.setBounds(30,70,150, 30); 
	    resultlabel.setBounds(15, 110, 300, 30);
	    resultfield.setBounds(330, 110, 50, 30); 
	    wronglabel.setBounds(15, 150, 300, 30);
	    wrongfield.setBounds(330, 150, 50, 30);
	    percentlabel.setBounds(15, 190, 300, 30);
	    percentfield.setBounds(330, 190, 50, 30);
	    gobackbt.setBounds(100, 230, 100, 50);
	
	    G.add(optionA);
	    G.add(optionB);
	    G.add(optionC);
	    G.add(optionD);
	    mainfram.add(toplabel);
	    mainfram.add(quelabel);
	    mainfram.add(optionA);
	    mainfram.add(optionAlabel);
	    mainfram.add(optionB);
	    mainfram.add(optionBlabel);
	    mainfram.add(optionC);
	    mainfram.add(optionClabel);
	    mainfram.add(optionD);
	    mainfram.add(optionDlabel);
	    mainfram.add(answerlabel);
	    mainfram.add(nextbt);
	    mainfram.setVisible(true);
	         
	}
	
	    static void action(){
	        nextbt.addActionListener(e->{count++;
	            String a[]={"5","नई दिल्ली","राजस्थान","भीलवाङा","चम्बल","श्री मोहन लाल सुखाङिया","अहिच्छत्तरपुर","श्रीमती प्रतिभा सिह पाटिल","श्री बलदेव सिह ","जोजङी"};
	            for(String i:a){if(i.equals(answerlabel.getText())){right++; break;}}
	            answerlabel.setText("");
	            
	            if(count==1){
	            quelabel.setText("प्रश्न न.1 विश्व मे कितने महाद्वीप है।");
	            optionAlabel.setText("1");
	            optionBlabel.setText("2");
	            optionClabel.setText("4");
	            optionDlabel.setText("5");
	            nextbt.setText("NEXT QUESTION");
	                       
	            }
	    else if(count==2){ quelabel.setText("प्रश्न न.2 भारत की राजधानी निम्न मे से कोनसी है।");
	    optionAlabel.setText("मुम्बई");
	    optionBlabel.setText("चैन्नई");
	    optionClabel.setText("नई दिल्ली");
	    optionDlabel.setText("जयपुर");
	    
	     }
	
	else if(count==3){ quelabel.setText("प्रश्न न.3 भारत का क्षेत्रफल की दृष्टि से  सबसे बङा राज्य है।");
	optionAlabel.setText("उत्तरप्रदेश ");
	optionBlabel.setText("महाराष्ट्र");
	optionClabel.setText("मध्यप्रदेश");
	optionDlabel.setText("राजस्थान");
	 }
	
	else if(count==4){ quelabel.setText("प्रश्न न.4 राजस्थान का मैनचैस्टर किसको कहते है।");
	optionAlabel.setText("भिवाङी");
	optionBlabel.setText("भीलवाङा");
	optionClabel.setText("जयपुर");
	optionDlabel.setText("अजमेर");
	 
	}
	
	else if(count==5){ quelabel.setText("प्रश्न न.5 राजस्थान की बारहमासी नदी कोनसी है।");
	optionAlabel.setText("चम्बल");
	optionBlabel.setText("लुणी");
	optionClabel.setText("घग्घर");
	optionDlabel.setText("उपरोक्त सभी");
	 
	  }
	
	else if(count==6){ quelabel.setText("प्रश्न न.6 राजस्थान मे सभागीय व्यवस्था किस मुख्यमंत्री द्वारा बन्द की गयी");
	optionAlabel.setText("श्री हरिदेव जोशी ");
	optionBlabel.setText("श्री भारु सिह शेखावत");
	optionClabel.setText("श्री मोहन लाल सुखाङिया");
	optionDlabel.setText("श्रीमती वसुन्धरा राज्ये");
	   }
	
	else if(count==7){ quelabel.setText("प्रश्न न.7 कृषि के पुराने औजर बनाने के लिए प्रसिद्ध स्थान कौनसा है। ");
	optionAlabel.setText("जालौर");
	optionBlabel.setText("हनुमानगढ");
	optionClabel.setText("वागंङ");
	optionDlabel.setText("अहिच्छत्तरपुर");
	 
	
	    }
	
	else if(count==8){ quelabel.setText("प्रश्न न.8 भारत की प्रथम महिला राष्ट्रपति कोन थी। ");
	optionAlabel.setText("श्रीमती सुषमा स्वराज");
	optionBlabel.setText("श्रीमती इन्द्रा गांंधी");
	optionClabel.setText("श्रीमती प्रतिभा सिह पाटिल");
	optionDlabel.setText("श्रीतमी द्रोपती मुर्मु");
	 
	  }
	
	else if(count==9){ quelabel.setText("प्रश्न न.9 भारत के प्रथम रक्षा मंत्री कौन थे।");
	optionAlabel.setText("श्री राजेन्द्र प्रसाद");
	optionBlabel.setText("श्री जवाहर लाल नेहरु");
	optionClabel.setText("श्री बलदेव सिह ");
	optionDlabel.setText("श्री सरदार पटेल");
	 
	 }
	
	else if(count==10){ quelabel.setText("प्रश्न न.10 लुनी का सहायक नदी जो पश्चिम दिशा से मिलती है।");
	optionAlabel.setText("जोजङी");
	optionBlabel.setText("सुकङी");
	optionClabel.setText("जाखम");
	optionDlabel.setText("पश्चिम बनास");
	 
	
	   }
	
	else if(count>10){
	    resultfram.setLayout(null);
	    resultfram.setSize(400,400);
	    resultfram.add(taglabel);
	    resultfram.add(showresultbt);
	    resultfram.setVisible(true); 
	       
	} });
	showresultbt.addActionListener(e->{
	    resultfram.add(resultlabel);
	    resultfram.add(resultfield);
	    resultfram.add(wrongfield);
	    resultfram.add(wronglabel);
	    resultfram.add(percentfield);
	    resultfram.add(percentlabel);
	    int wrong=10-right;
	    int percent=right*10;
	    String s=Integer.toString(right);
	    String sr=Integer.toString(wrong);
	    String str=Integer.toString(percent);
	    resultfield.setText(s); 
	    wrongfield.setText(sr);
	    percentfield.setText(str+"%");  
	    resultfram.add(gobackbt);
	});
	gobackbt.addActionListener(e->{
	    resultfram.dispose();
	});
	
	optionA.addActionListener(e1->{answerlabel.setText(optionAlabel.getText());            
	});
	optionB.addActionListener(e1->{answerlabel.setText(optionBlabel.getText());            
	});
	optionC.addActionListener(e1->{answerlabel.setText(optionClabel.getText());            
	});
	optionD.addActionListener(e1->{answerlabel.setText(optionDlabel.getText());            
	}); 
	
	   }
	   static void ans(){
	    
	   }
	    public static void main(String[] args) {
	    mainFram();
	    action();
	    if(count==1){}
	    
	       
	    }
	}
