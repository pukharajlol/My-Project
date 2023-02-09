import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NotesProgram {
    static JFrame fram=new JFrame("notes...");
    static JLabel subject=new JLabel("  Subject");
    static JLabel title=new JLabel("  Title");
    static JLabel subtitle=new JLabel("  SubTitle");
    static JLabel notes=new JLabel("  Brif_Notes");
    static JButton submit=new JButton("Submit_Notes");
    static JTextField tsub=new JTextField();
    static JTextField ttit=new JTextField();
    static JTextField tsubtit=new JTextField();
    static JTextArea tnot=new JTextArea();
    static void gui(){
        fram.setBounds(0, 0, 400, 600);
        fram.setLayout(null);
        subject.setBounds(160, 50, 100, 30);
        tsub.setBounds(110, 80, 150, 30);
        title.setBounds(160, 120, 100, 30);
        ttit.setBounds(110, 150, 150, 30);
        subtitle.setBounds(160, 190, 100, 30);
        tsubtit.setBounds(110, 220, 150, 30);
        notes.setBounds(150, 260, 100, 30);
        tnot.setBounds(50, 290, 280, 180);
        submit.setBounds(180, 500, 150, 30);
        fram.add(subject);
        fram.add(tsub);
        fram.add(title);
        fram.add(ttit);
        fram.add(subtitle);
        fram.add(tsubtit);
        fram.add(notes);
        fram.add(tnot);
        fram.add(submit);
        fram.setVisible(true);
    }
    static void action(){
        submit.addActionListener(e->{
            try {
                File fobj=new File("Notes.txt");
                FileWriter fwr=new FileWriter("Notes.txt",true);
                fwr.write("{"+"Subject="+tsub.getText()+", Title="+ttit.getText()+" ,Subtitle="+tsubtit.getText()+" ,Brif_notes="+tnot.getText()+"}"+"\n");
                fwr.close();
                tsub.setText("");ttit.setText("");tsubtit.setText("");tnot.setText("");
                JOptionPane.showMessageDialog(fram,"your notes successfully save my platform!");
            
        } catch (Exception e1) {
            // TODO: handle exception
        }  
        });

    }
     
    public static void main(String[] args) {
        gui();
        action();
    }
    
}
