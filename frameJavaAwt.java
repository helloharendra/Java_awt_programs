import java.awt.*;
import java.awt.event.*;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

class frameJavaAwt implements ActionListener{
    TextField tf;
    Button b;
    frameJavaAwt(){
        Frame f=new Frame();
        Label l=new Label("Enter Your Name");
        l.setBounds(100,100,200,30);
        tf=new TextField();
        tf.setBounds(100,130,200,30);
        b=new Button("Addition");
        b.setBounds(150,200,80,30);
        b.addActionListener(this);
        f.add(b);
        f.add(l);
        f.add(tf);

        f.setSize(500,500);
        f.setTitle("Employee info");
        f.setLayout(null);
        f.setVisible(true);
        


    }
    public void actionPerformed(ActionEvent e){

        tf.setText("performed");
    }
    public static void main(String[] args) {
        frameJavaAwt fj=new frameJavaAwt();
    }
    
}
