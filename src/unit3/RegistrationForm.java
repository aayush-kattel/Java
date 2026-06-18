package unit3;

import javax.swing.*;

public class RegistrationForm {
    public static void main(String[] args){
        JFrame frame=new JFrame("registration Form");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel label=new JLabel("Registration Form");
        label.setSize(200,30);
        label.setHorizontalAlignment(JLabel.CENTER);

        JLabel nameLabel =new JLabel("Name");
        nameLabel.setBounds(30,60,200,50);
        JTextField nameField=new JTextField();
        nameField.setBounds(30,90,200,30);

        JLabel emailLabel =new JLabel("Email");
        emailLabel.setBounds(30,120,200,50);
        JTextField emailField=new JTextField();
        emailField.setBounds(30,150,200,30);


        JLabel phoneLabel =new JLabel("Phone");
        phoneLabel.setBounds(30,180,200,50);
        JTextField phoneField=new JTextField();
        phoneField.setBounds(30,210,200,30);

        JLabel addressLabel =new JLabel("Address");
        addressLabel.setBounds(30,240,200,50);
        JTextField addressField=new JTextField();
        addressField.setBounds(30,270,200,30);

        frame.add(label);

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(emailLabel);
        frame.add(emailField);

        frame.add(phoneLabel);
        frame.add(phoneField);

        frame.add(addressLabel);
        frame.add(addressField);

        frame.setVisible(true);
    }
}
