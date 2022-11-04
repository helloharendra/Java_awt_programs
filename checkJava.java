import java.awt.*;
import java.awt.event.*;
class checkJava extends Frame implements ActionListener{
    TextField tf;
   checkJava(){
    tf=new TextField();
    tf.setBounds(165,60,200,20);// here 165 is x axis, 60 is y axis,100 is width and 20 is height of text field
    Button b=new Button("Submit");
    b.setBounds(220,120,80,30);
    
    b.addActionListener(this);
    
    add(b);
    add(tf);
    setSize(500,500);
    setLayout(null);
    setVisible(true);
   }
   public void actionPerformed(ActionEvent e){
    tf.setText("Welcome By: Harendra");
   }
   public static void main(String[] args) {
   new checkJava();
   }

    
}