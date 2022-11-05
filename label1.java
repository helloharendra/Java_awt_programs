import java.awt.*;
import javax.swing.*;
 public class label1{
     
    public static void main(String[] args) {
        Frame f=new Frame();
        Label l1,l2;
        l1=new Label("Employee name ");
        l2=new Label("Emploayee id");
        l1.setBounds(50,100,200,30);
        l2.setBounds(50,150,200,30);

        f.add(l1);
        f.add(l2);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        
    }
 }