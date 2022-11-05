import java.awt.*;


public class button1 extends Frame {
 
   button1(){
    Button b= new Button("click me");
    b.setBounds(60,60,50,30);
    add(b);
    setSize(500,500);
    setVisible(true);
    setLayout(null);
   }
   public static void main(String[] args) {
    new button1();
   }
}
