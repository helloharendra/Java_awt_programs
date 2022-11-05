import java.awt.*;
import java.awt.event.*;
class harendra extends Frame implements ActionListener{
    TextField tf;
    harendra(){
    Label l=new Label("It will change Dynamically"); 
    l.setBounds(165,30,200,20);  
    tf=new TextField();
    tf.setBounds(165,60,200,20);// here 165 is x axis, 60 is y axis,100 is width and 20 is height of text field
    Button b=new Button("Submit");
    b.setBounds(220,120,80,30);

    b.addActionListener(this);
    add(l);
    add(b);
    add(tf);
    setSize(500,500);
    setLayout(null);
    setVisible(true);
    setTitle("Hey.. awt");
   }
   public void actionPerformed(ActionEvent e){
    tf.setText("hello harendra");
   }
   public static void main(String[] args) {
   new harendra();
   }

    
}