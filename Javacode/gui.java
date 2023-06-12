import javax.swing.*;

import java.awt.*;

public class gui
{
    public static void main(String[] args)
    {
JFrame frame = new JFrame("First gui");
JMenuBar mb = new JMenuBar();
JMenu m1 = new JMenu("file");
JMenu m2 = new JMenu("formate");
mb.add(m1);
mb.add(m2);
m1.add("Hello");
m1.add("byy");


frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300,300);
JButton button = new JButton("press");
//JButton button1 = new JButton("try");
frame.getContentPane().add(button);
//frame.getContentPane().add(button1);
// frame.getContentPane().setBackground(new Color(171, 116, 187, 255));


 frame.getContentPane().add(BorderLayout.NORTH,mb);
 frame.getContentPane().add(BorderLayout.PAGE_END,button);
// frame.getJMenuBar().setBackground(new Color(241, 157, 157));
 frame.setVisible(true);





    }

}
