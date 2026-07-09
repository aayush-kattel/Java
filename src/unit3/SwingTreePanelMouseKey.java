package unit3;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SwingTreePanelMouseKey {
    public static void main(String[] args){
        JFrame frame=new JFrame();
        frame.setTitle("Tree Example");
        frame.setSize(700,600);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Programming");
        DefaultMutableTreeNode java = new DefaultMutableTreeNode("java");
        DefaultMutableTreeNode swing = new DefaultMutableTreeNode("swing");
        DefaultMutableTreeNode jdbc = new DefaultMutableTreeNode("jdbc");

        java.add(swing);
        java.add(jdbc);

        DefaultMutableTreeNode web = new DefaultMutableTreeNode("Web");
        DefaultMutableTreeNode html = new DefaultMutableTreeNode("HTML");
        DefaultMutableTreeNode css = new DefaultMutableTreeNode("CSS");
        web.add(html);
        web.add(css);

        root.add(java);
        root.add(web);

        JTree tree =new JTree(root);

        JScrollPane treeScroll =new JScrollPane(tree);
        treeScroll.setPreferredSize(new Dimension(200,0));

        JPanel panel=new JPanel();
        panel.setLayout(null);

        JLabel label=new JLabel("Click or Type Here");
        label.setBounds(50,30,300,30);
        panel.add(label);

        JTextField textField=new JTextField();
        textField.setBounds(50,80,300,30);
        panel.add(textField);

        JButton button=new JButton("Click Me");
        button.setBounds(50,130,300,30);
        panel.add(button);

        //mouse click
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at: "+ e.getX() + ", "+ e.getY());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(new Color(220,255,220));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(new Color(220,255,120));
            }
        });

        //key event
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("Typing: "+textField.getText());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    label.setText("ENTER Pressed: "+textField.getText());
                }
            }
        });

        //TREE EVENT
        tree.addTreeSelectionListener(e->{
            String selected=tree.getLastSelectedPathComponent().toString();
            label.setText("Selected: "+selected);
        });

        frame.add(treeScroll,BorderLayout.WEST);
        frame.add(panel,BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
