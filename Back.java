import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Back extends Applet implements ActionListener
{
 String s;
 Button b1,b2,b3;
 public void init()
{
 b1=new Button("pink");
b2=new Button("yellow");
b3=new Button("green");
add(b1);add(b2);add(b3);
setLayout(null);
b1.setBounds(100,200,50,20);
b2.setBounds(170,200,50,20);
b3.setBounds(240,200,50,20);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
setBackground(Color.pink);
setForeground(Color.green);
s="Hi";
repaint();
}
if(ae.getSource()==b2)
{
setBackground(Color.yellow);
setForeground(Color.green);
s="Hiiiii";
repaint();
}
if(ae.getSource()==b3)
{
setBackground(Color.yellow);
setForeground(Color.pink);
s="itsmebaakya";
repaint();
}
}
public void paint(Graphics g)
{
 g.drawString(s,200,100);
}
}
//<applet code=Back width=500 height=500></applet>
 