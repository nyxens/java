import java.awt.Checkbox;

import javax.swing.*;
public class swing4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Registration");
        frame.setSize(350,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20,20,80,25);
        JTextField nameField = new JTextField();
        nameField.setBounds(100,20,200,25);
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20,60,80,25);
        JTextField emailField = new JTextField();
        emailField.setBounds(100,60,200,25);
        JCheckBox termsCheckBox = new JCheckBox("I agree to the terms and conditions");
        termsCheckBox.setBounds(20,100,250,25);
        termsCheckBox.setFocusable(false);
        JButton submitButton = new JButton("Submit");
        submitButton.setEnabled(false); 
        submitButton.setFocusable(false); 
        submitButton.setBounds(120,150,100,30);
        termsCheckBox.addItemListener(E -> {
            if (termsCheckBox.isSelected()) {
                submitButton.setEnabled(true);
            } else {
                submitButton.setEnabled(false);
            }
        });
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(frame,"Name cannot be empty.");
            } else if (!email.contains("@") || !email.endsWith(".com")) 
                JOptionPane.showMessageDialog(frame,"Enter a valid email (must contain '@' and end with '.com').");
             else {
                JOptionPane.showMessageDialog(frame,"Registration Successful!");
            }
        });
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(termsCheckBox);
        frame.add(submitButton);
        frame.setVisible(true);
    }
}
