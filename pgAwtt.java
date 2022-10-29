import java.awt.*;
public class pgAwtt extends Frame {

pgAwtt(){

TextField tf=new TextField();
tf.setBounds(30,200,160,30);
add(tf);
Button b=new Button("Click me");
b.setBounds(30,100,80,30);
add(b);
setSize(300,300);
setTitle("hello Harendra ");
setLayout(null);
setVisible(true);
    }

public static void main (String[]args){

    pgAwtt p=new pgAwtt();

}
}