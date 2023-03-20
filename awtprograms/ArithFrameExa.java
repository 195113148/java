import java.awt.*;
import java.awt.event.*;
class ArithFrame extends Frame  implements ActionListener,WindowListener
{
  Label  l1,l2,l3;
  TextField t1,t2,t3;
  Button b1,b2,b3,b4;
  
  ArithFrame()
  {
    l1=new Label("Enter a : ");
    l2=new Label("Enter b : ");
    l3=new Label("Result : ");

    t1=new TextField(10);
    t2=new TextField(10);
    t3=new TextField(10);

    b1=new Button("ADD"); b1.addActionListener(this);
    b2=new Button("SUB"); b2.addActionListener(this);
    b3=new Button("MUL"); b3.addActionListener(this);
    b4=new Button("DIV"); b4.addActionListener(this);

    setTitle("Arithmetic Frame");
    setVisible(true);
    setLayout(new FlowLayout());
    setSize(300,300);
    
    add(l1); add(t1); add(l2); add(t2); add(l3); add(t3);
    add(b1); add(b2); add(b3); add(b4);
    addWindowListener(this);
    
    }

 public void  actionPerformed(ActionEvent e)
 {
  int a=Integer.parseInt(t1.getText());
  int b= Integer.parseInt(t2.getText());
  if (e.getSource()==b1)
  {
   int c=a+b;
   t3.setText(""+c);
  }
if (e.getSource()==b2)
  {
   int c=a-b;
   t3.setText(""+c);
  }
if (e.getSource()==b3)
  {
   int c=a*b;
   t3.setText(""+c);
  }
if (e.getSource()==b4)
  {
   int c=a/b;
   t3.setText(""+c);
  }
    }
 
 public void windowOpened(java.awt.event.WindowEvent e){}
  public void windowClosing(java.awt.event.WindowEvent e){ dispose();}
  public void windowClosed(java.awt.event.WindowEvent e){}
  public  void windowIconified(java.awt.event.WindowEvent e){}
  public  void windowDeiconified(java.awt.event.WindowEvent  e){}
  public  void windowActivated(java.awt.event.WindowEvent  e){}
  public  void windowDeactivated(java.awt.event.WindowEvent e){}

} // frame

 class ArithFrameExa
{
  public static void main(String args[])
 {
   ArithFrame af=new ArithFrame();
   }
 } 

