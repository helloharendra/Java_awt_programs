import java.awt.*;

public class awtButton3 {
    awtButton3(){
        Frame f=new Frame("hello harendra i am first label");
        Button b=new Button();
        b.setBounds(100,80,60,20);
        b.setLabel("click me");
        f.add(b);
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String[] args) {
        new awtButton3();
    }
}
