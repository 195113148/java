import java.awt.*;

class MyFrame
{
  public static void main(String args[])
  {
   Frame f=new Frame("MyFrame");
   f.setSize(300,300); f.setVisible(true);
   f.add(new Label("Hello"));
  }
}