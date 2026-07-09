package unit3;

import javax.swing.*;

public class SwingMenu {
    public static void main(String[] args){

        JFrame frame=new JFrame();
        frame.setTitle("Menu Example");
        frame.setSize(550,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);

        //Menu Bar
        JMenuBar menuBar=new JMenuBar();

        //Menu Items
        JMenu file=new JMenu("File");
        JMenu help=new JMenu("Help");

        JMenuItem newItem =new JMenuItem("New");
        JMenuItem saveItem =new JMenuItem("Save");
        JMenuItem exitItem =new JMenuItem("Exit");
        JMenuItem aboutItem =new JMenuItem("About");


        file.add(newItem);
        file.add(saveItem);
        file.add(exitItem);
        file.add(aboutItem);

        menuBar.add(file);
        menuBar.add(help);

        frame.setJMenuBar(menuBar);

        newItem.addActionListener(e->{
            JOptionPane.showMessageDialog(
                    frame,
                    "New Item Created!",
                    "New Item",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        aboutItem.addActionListener(e->{
            JOptionPane.showMessageDialog(
                    frame,
                    "Version 1.0",
                    "About",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        exitItem.addActionListener(e->{
            int choice=JOptionPane.showConfirmDialog(
                    frame,
                    "Do you want to exit?",
                    "Exit",
                    JOptionPane.YES_NO_OPTION
            );
            if(choice== JOptionPane.YES_OPTION){
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
