import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 public class Harendralabel2 implements ActionListener{
    Frame f;
    Label l;
    TextField tf;
    Button b;
    Harendralabel2(){
        f=new Frame();
        
        l=new Label("your ip will show here");
        l.setBounds(50,100,500,30);
        tf = new TextField();    
        tf.setBounds(50, 50,500, 20);  
         b=new Button("find IP");
        b.setBounds(50,200,200,30);
        b.addActionListener(this);
        f.add(b);
        f.add(l);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {    
        try {    
        String host = tf.getText();    
        String ip = java.net.InetAddress.getByName(host).getHostAddress();    
        l.setText("IP of Your System is : "+host+" is: "+ip);    
        }   
        catch (Exception ex) {  
            System.out.println(ex);  
        }    
    }    
     
    public static void main(String[] args) {
        new Harendralabel2();
        
    }
 }