//import javax.swing.*;
//import java.awt.event.ActionListener;
//import java.awt.event.*;
//
//  abstract class clicker implements ActionListener
//{
//    int count = 0;
//    clicker(){
//        JFrame frame= new  JFrame();
//        JButton button1 = new JButton("Button1");
//        JButton button2 = new JButton("Button2");
//        button1.addActionListener(this);
//         frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
//         frame.add(button1);
//         frame.add(button2);
//         frame.getRootPane().setDefaultButton(button1);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.setSize(450,450);
//    frame.setLocationRelativeTo(null);
//    frame.setVisible(true);
//    }
//public void actionPerfomd(ActionEvent e){
//        count++;
//    System.out.println("You have clicked the active button" + count + "times");
//}
//    public static void main(String[] args)
//    {
//        clicker click = new clicker();
//    }
//}
//
