import java.awt.*;
import javax.swing.*;


public class awtButton4 {

   awtButton4(){
    Frame f =new Frame("Frame with Layout");
    f.setLayout(new GridBagLayout());
    Button b=new Button("click me");
    b.setBounds(60,60,80,30);
    b.setLabel("submit");
    f.add(b);
    
    f.setSize(500,500);
    f.setVisible(true);
   
   }

   public static void main(String[] args) {
    new awtButton4();
   }

    
}
