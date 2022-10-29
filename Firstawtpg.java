import java.awt.*;
class Firstawtpg extends Frame{
  Firstawtpg(){

    Button b=new Button("First Button");

    b.setBounds(30,100,80,30);

    add(b);
    setSize(300,300);
    setTitle("studyhubtutorial.com");
    setLayout(null);
    setVisible(true);

  }
  public static void main(String[] args) {
    Firstawtpg f=new Firstawtpg();
  }
}