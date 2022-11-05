import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;
import java.awt.*;
import java.awt.event.*;
class HarendraBut extends Frame implements ActionListener{
    TextField tf;
 HarendraBut(){
    tf=new TextField();
    tf.setBounds(100,60,200,20);
    Button b=new Button("Click me");
    b.setBounds(150,90,100,30);
    b.addActionListener(this);
    add(tf);
    add(b);
    setSize(500,500);
    setVisible(true);
    setLayout(null);
 } 

 public void actionPerformed(ActionEvent e){
    tf.setText("helloo harendra");
 }
 public static void main(String[] args) {
    new HarendraBut();
 }
}
