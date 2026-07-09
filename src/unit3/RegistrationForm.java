package unit3;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class RegistrationForm {
    public static void main(String[] args){

        JFrame frame=new JFrame("registration Form");
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(255,255,102));

        JLabel title=new JLabel("User Registration Form");
        title.setFont(new Font("Arial",Font.BOLD,22));
        title.setBounds(130,20,300,30);
        frame.add(title);

        Font labelFont =new Font("Arial",Font.BOLD,14);


        JLabel nameLabel =new JLabel("Name:");
        nameLabel.setFont(labelFont);
        nameLabel.setBounds(50,80,100,25);
        JTextField nameField=new JTextField();
        nameField.setBounds(130,80,220,30);

        JLabel emailLabel =new JLabel("Email:");
        emailLabel.setFont(labelFont);
        emailLabel.setBounds(50,130,100,25);
        JTextField emailField=new JTextField();
        emailField.setBounds(130,130,220,30);


        JLabel passwordLabel =new JLabel("Password:");
        passwordLabel.setFont(labelFont);
        passwordLabel.setBounds(50,180,100,25);
        JPasswordField passwordField=new JPasswordField();
        passwordField.setBounds(130,180,220,30);

        JLabel genderLabel =new JLabel("Gender:");
        genderLabel.setBounds(50,230,100,25);

        JRadioButton maleRadio=new JRadioButton("Male");
        maleRadio.setBounds(130,230,80,25);

        JRadioButton femaleRadio=new JRadioButton("Female");
        femaleRadio.setBounds(220,230,80,25);

        ButtonGroup group=new ButtonGroup();
        group.add(maleRadio);
        group.add(femaleRadio);

        JLabel countryLabel=new JLabel("Country:");
        countryLabel.setFont(labelFont);
        countryLabel.setBounds(50,280,100,25);
        frame.add(countryLabel);

        String[] countries={
                "-- Select Country --",
                "Nepal",
                "India",
                "China",
                "Japan",
                "USA"
        };

        JComboBox<String> countryCombo = new JComboBox<>(countries);
        countryCombo.setBounds(130,280,200,30);
        frame.add(countryCombo);

        JLabel HobbyLabel=new JLabel("Hobbies:");
        HobbyLabel.setFont(labelFont);
        HobbyLabel.setBounds(50,330,100,25);
        frame.add(HobbyLabel);

        JCheckBox music =new JCheckBox("Music");
        music.setBounds(130,330,80,25);

        JCheckBox sports=new JCheckBox("Sports");
        sports.setBounds(230,330,80,25);

        JCheckBox reading=new JCheckBox("Reading");
        reading.setBounds(330,330,80,25);

        frame.add(music);
        frame.add(sports);
        frame.add(reading);

        JLabel skilllabel=new JLabel("Skills:");
        skilllabel.setFont(labelFont);
        skilllabel.setBounds(50,380,100,25);
        frame.add(skilllabel);

        String[] skills ={
                "Java",
                "phyton",
                "C#",
                "JavaScript",
                "C"
        };

        JList<String> skillList=new JList<>(skills);
        skillList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JScrollPane scrollPane=new JScrollPane(skillList);
        scrollPane.setBounds(130,380,150,80);
        frame.add(scrollPane);

        JButton registrationBtn=new JButton("Register");
        registrationBtn.setBounds(170,500,120,40);
        registrationBtn.setBackground(new Color(255,51,51));
        registrationBtn.setFocusPainted(false);
        frame.setLocationRelativeTo(null);
        frame.add(registrationBtn);

        registrationBtn.addActionListener(e->{
            String name=nameField.getText();
            String email=nameField.getText();
            String password=new String(passwordField.getPassword());

            String gender="";
            if(maleRadio.isSelected()){
                gender="Male";
            }else if(femaleRadio.isSelected()){
                gender="Female";
            }

            String country=countryCombo.getSelectedItem().toString();

            String hobbies="";
            if(music.isSelected()){
                hobbies+="Music";
            }
            if(sports.isSelected()){
                hobbies+="Sports";
            }
            if(reading.isSelected()){
                hobbies+="Reading";
            }

            List<String> selectedSkills=skillList.getSelectedValuesList();
            String skillsData=String.join(", ",selectedSkills);

            String message=
                    "Registration Sucessful!\n\n"+
                            "Name: " + name + "\n"+
                            "Email: " + email + "\n"+
                            "Password: " + password + "\n"+
                            "Gender: " + gender + "\n"+
                            "Country: " + country + "\n"+
                            "Hobbies: " + hobbies + "\n"+
                            "Skills: " + skillsData;

            JOptionPane.showMessageDialog(frame,message,"Registration Details",JOptionPane.INFORMATION_MESSAGE);
        });

        frame.add(maleRadio);
        frame.add(femaleRadio);

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(emailLabel);
        frame.add(emailField);

        frame.add(passwordField);
        frame.add(passwordLabel);

        frame.add(genderLabel);

        frame.setVisible(true);
    }
}
