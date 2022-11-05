import java.awt.*;

public class awtButton2 {

    awtButton2(){
        Frame f=new Frame("this is first frame ");
    Button b= new Button("Click me ");
    b.setBounds(100,80,60,20);
    f.add(b);
    f.setSize(500,500);
    f.setVisible(true);
    f.setLayout(null);
    }
    public static void main(String[] args) {
        new awtButton2();
    }
    
}
