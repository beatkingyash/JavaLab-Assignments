// swing

import javax.swing.*;
import java.awt.*;

public class swinge
{
   public static void main(String args[])
   {
     JFrame jf = new JFrame("Swing");
     Container c = jf.getContentPane();
     
     JLabel l1 = new JLabel("Username");
     JTextField t1 = new JTextField(10);
     
     JLabel l2 = new JLabel("Password");
     JTextField t2 = new JTextField(10);
     
     JButton b1 = new JButton("Log In");
     JRadioButton J1 = new JRadioButton("Enginnering");
     JComboBox<String> J2 = new JComboBox<>();
     
     c.setLayout(new FlowLayout());
     
     c.add(l1);
     c.add(t1);
     c.add(l2);
     c.add(t2);
     c.add(b1);
     c.add(J1);
     
     // Add items to the JComboBox correctly
     J2.addItem("FY");
     J2.addItem("SY");
     J2.addItem("TY");
     J2.addItem("BTech");
     c.add(J2);
     
     jf.setSize(400, 400);
     jf.setVisible(true);
   }
}
