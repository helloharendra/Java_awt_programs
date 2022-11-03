import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.text.LabelView;
class javaAwtpg extends Frame implements ActionListener {
    TextField tf;
    int c;
    Button b;
    javaAwtpg(){
        b=new Button("Submit");
        tf=new TextField();
        Label l=new Label("Calculate two numbers :");
        l.setBounds(20,70,200,30);
        b.setBounds(100,130,80,30);
        b.addActionListener(this);
        tf.setBounds(20,100,200,20);
        setSize(300,300);
        add(l);
        add(b);
        add(tf);
        setLayout(null);
        setVisible(true);
        

    }
    public void actionPerformed(ActionEvent e){
        c=(10+20);
        tf.setText("Sum is : "+c);
    }
    public static void main(String[] args) {
        new javaAwtpg();
    }
    
}

