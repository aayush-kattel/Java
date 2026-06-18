package unit3;

import javax.swing.*;

public class SwingExample {
    public static void main(String[] args){

        JFrame frame=new JFrame();
        frame.setTitle("My application");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label=new JLabel("hello world");
        label.setSize(100,100);
        frame.add(label);

        frame.setVisible(true);
    }
}
