import java.awt.*;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;
class javabutton  extends Frame {

    javabutton(){
        Button b=new Button("click me");
        Label l=new Label("Name:");
        TextField tf=new TextField();
        l.setBounds(20,80,80,30);
        tf.setBounds(20,100,80,30);
        b.setBounds(100,100,80,30);
        
        setSize(300,300);  
        add(b);
        add(l);
        add(tf);
        setLayout(null); 
        setVisible(true);

    }
    
}

public class javaAwt{
    public static void main(String[] args) {
        javabutton jb=new javabutton();
    }
}
