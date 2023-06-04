import javax.swing.*;

import java.awt.*;

public class gui
{
    public static void main(String[] args)
    {
JFrame frame = new JFrame("First gui");
JMenuBar mb = new JMenuBar();
JMenu m1 = new JMenu("Raj");
JMenu m2 = new JMenu("Khushi");
mb.add(m1);
mb.add(m2);
m1.add("Hello");


frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300,300);
JButton button = new JButton("press");
//JButton button1 = new JButton("try");
frame.getContentPane().add(button);
//frame.getContentPane().add(button1);
frame.setVisible(true);
frame.getContentPane().add(BorderLayout.NORTH,mb);
   frame.getContentPane().add(BorderLayout.PAGE_END,button);

    }

}
